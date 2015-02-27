/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: HelloWorld.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月27日 下午9:46:52
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: HelloWorld
 * @Description: HelloWorld，工程代码框架结构
 * @author: yangjun03
 * @date: 2015年2月27日 下午9:46:52
 */
public class HelloWorld {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		Logger logger = LogManager.getLogger(HelloWorld.class.getName());
		logger.info("hello world !!!");
	}

}
