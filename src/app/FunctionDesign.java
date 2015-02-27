/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: FunctionDesign.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月27日 下午9:51:25
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: FunctionDesign
 * @Description: java函数
	 * 基础:		定义、参数传递、调用、重载
 * @author: yangjun03
 * @date: 2015年2月27日 下午9:51:25
 */
public class FunctionDesign {
	public String strCat() {
		return "hello, " + "test !!!";
	}
	public String strCat(String stra, String strb) {
		return stra + strb;
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
		Logger logger = LogManager.getLogger(FunctionDesign.class.getName());
		String stra = "hello, ";
		String strb = "world !!!";
		logger.info(new FunctionDesign().strCat());
		logger.info(new FunctionDesign().strCat(stra, strb));
	}

}
