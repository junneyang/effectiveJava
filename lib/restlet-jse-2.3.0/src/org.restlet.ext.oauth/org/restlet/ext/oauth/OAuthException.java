/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.ext.oauth;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.data.Form;

/**
 * Exception that represents OAuth 2.0 (RFC6749) Errors.
 * 
 * @author Shotaro Uchida <fantom@xmaker.mx>
 * @see <a href="http://tools.ietf.org/html/rfc6749">The OAuth 2.0 Authorization
 *      Framework (RFC6749)</a>
 */
public class OAuthException extends Exception {

    private static final long serialVersionUID = 1L;

    public static OAuthException toOAuthException(Form params) {
        OAuthError error = Enum.valueOf(OAuthError.class,
                params.getFirstValue(OAuthResourceDefs.ERROR));
        OAuthException ex = new OAuthException(error);
        ex.description = params.getFirstValue(OAuthResourceDefs.ERROR_DESC);
        ex.errorUri = params.getFirstValue(OAuthResourceDefs.ERROR_URI);
        return ex;
    }

    public static OAuthException toOAuthException(JSONObject result)
            throws JSONException {
        OAuthError error = Enum.valueOf(OAuthError.class,
                result.getString(OAuthResourceDefs.ERROR));
        OAuthException ex = new OAuthException(error);
        if (result.has(OAuthResourceDefs.ERROR_DESC)) {
            ex.description = result.getString(OAuthResourceDefs.ERROR_DESC);
        }
        if (result.has(OAuthResourceDefs.ERROR_URI)) {
            ex.errorUri = result.getString(OAuthResourceDefs.ERROR_URI);
        }
        return ex;
    }

    public static OAuthException toOAuthException(Throwable t) {
        if (t instanceof OAuthException) {
            return (OAuthException) t;
        } else if (t.getCause() instanceof OAuthException) {
            return (OAuthException) t.getCause();
        } else {
            Logger.getLogger(OAuthException.class.getName()).log(Level.SEVERE,
                    "Internal Server Error", t);
            return new OAuthException(OAuthError.server_error, t.getMessage(),
                    null);
        }
    }

    private String description;

    private OAuthError error;

    private String errorUri;

    private OAuthException(OAuthError error) {
        super(error.name());
        this.error = error;
    }

    public OAuthException(OAuthError error, String description, String errorUri) {
        super(error.name());
        this.error = error;
        this.description = description;
        this.errorUri = errorUri;
    }

    public JSONObject createErrorDocument() throws JSONException {
        JSONObject result = new JSONObject();

        result.put(OAuthResourceDefs.ERROR, error.name());
        if ((description != null) && (description.length() > 0)) {
            result.put(OAuthResourceDefs.ERROR_DESC, description);
        }
        if ((errorUri != null) && (errorUri.length() > 0)) {
            result.put(OAuthResourceDefs.ERROR_URI, errorUri);
        }

        return result;
    }

    public OAuthError getError() {
        return error;
    }

    public String getErrorDescription() {
        return description;
    }

    public String getErrorURI() {
        return errorUri;
    }
}
