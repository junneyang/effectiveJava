/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: OOParam.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午7:21:46
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: OOParam
 * @Description: java参数传递
 	* java只有值传递一种方式，如果传递的是基本数据类型，实参不会改变。如果传递的是引用，则引用不会发生改变、引用的值可以发生改变。
 	* 区别是：基本数据类型传递数据类型值不变，引用传递引用指向的值可以修改。
 * @author: yangjun03
 * @date: 2015年2月28日 下午7:21:46
 */
public class OOParam {
	private static Logger logger = null;
	public OOParam() {
		// TODO Auto-generated constructor stub
	}
	public StringBuilder strChange(StringBuilder str) {
		logger.info(str);
		str.append(" !!!");
		logger.info(str);
		return str;
	}
	public StringBuilder strChange2(StringBuilder str) {
		logger.info(str);
		str.append(" !!!");
		logger.info(str);
		str = new StringBuilder("XYZ");
		return str;
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
		logger = LogManager.getLogger(OOParam.class.getName());
		OOParam oo = new OOParam();
		StringBuilder str = new StringBuilder("junneyang");
		logger.info(oo.strChange(str));
		logger.info(str);
		
		str = new StringBuilder("junneyang");
		logger.info(oo.strChange2(str));
		logger.info(str);
	}

}
