/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: AbstractClass.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午10:28:30
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: AbstractClass
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年2月28日 下午10:28:30
 */
public abstract class AbstractClass {
	private static Logger logger = null;
	private String str;
	public AbstractClass(String str) {
		LogHandler.logInit();
		logger = LogManager.getLogger(AbstractClass.class.getName());
		this.str = str;
	}
	public void disStr() {
		logger.info(this.str);
	}
	public void upperStr() {
		logger.info(this.str.toUpperCase());
	}
	public abstract void abstractMethod();
}
