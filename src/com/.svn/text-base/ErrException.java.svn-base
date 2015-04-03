/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Exception.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月2日 下午9:53:49
 * @version: V1.0  
 */
package com;


public class ErrException extends Exception {
	private static final long serialVersionUID = 608751847135585998L;
	private EnumSys enumSys;
	public ErrException(EnumSys enumSys) {
		this.enumSys = enumSys;
	}
	public int getErrno() {
		return this.enumSys.getId();
	}
	public String getEnMsg() {
		return this.enumSys.getMsgEN();
	}
	public String getZhMsg() {
		return this.enumSys.getMsgZH();
	}
}
