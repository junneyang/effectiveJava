/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Implement.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午11:13:27
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Implement
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年2月28日 下午11:13:27
 */
public class Implement implements Interface {
	private static Logger logger = null;
	/* (non Javadoc)
	 * @Title: strCat
	 * @Description: TODO
	 * @param stra
	 * @param strb
	 * @see app.Interface#strCat(java.lang.String, java.lang.String)
	 */
	@Override
	public void strCat(String stra, String strb) {
		// TODO Auto-generated method stub
		logger.info(stra + strb);
	}
	public static void disID() {
		logger.info(id);
	}
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(AbstractClass.class.getName());
		Interface intf = new Implement();
		intf.strCat("stra", "strb");
		disID();
	}

}
