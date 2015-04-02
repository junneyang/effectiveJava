/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: OOFeature.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午9:01:07
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: OOFeature
 * @Description: java封装、继承、抽象类、接口、多态
 * abstract:	抽象类可以包含私有非静态非final成员变量、抽象方法、非抽象方法，抽象类在设计上强调的是is-a关系。只支持单重继承。
 * inteface:	接口只能定义static final成员变量以及抽象方法，接口在设计上强调的是like-a关系.支持多重实现。接口本质上是抽象类的特殊化。
 * 抽象类是对类抽象，而接口是对行为的抽象。抽象类是对整个类整体进行抽象，包括属性、行为，但是接口却是对类局部（行为）进行抽象。
 * 抽象类所跨域的是具有相似特点的类，而接口却可以跨域不同的类。
 * @author: yangjun03
 * @date: 2015年2月28日 下午9:01:07
 */
public class OOFeature {
	private static Logger logger = null;
	public OOFeature() {
		// TODO Auto-generated constructor stub
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
		logger = LogManager.getLogger(OOFeature.class.getName());
		logger.info("OOFeature log is null");
	}

}
