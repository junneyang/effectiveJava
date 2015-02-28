/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: OOClass.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午5:29:39
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: OOClass
 * @Description: java面向对象编程-类与对象
 	* 概念(面向过程更多思考的是算法的实现,这种建模方式有缺陷,通常数据结构与算法是密不可分的,面向对象对此作了改进,将方法和属性看作一个整体,
 	* 首先思考对象之间的关系,然后才考虑具体的过程实现)
 	* 构造函数(如果没有构造函数初始化,基本数据类型0,引用null)、this指针
 	* 函数重载
 * @author: yangjun03
 * @date: 2015年2月28日 下午5:29:39
 */
public class OOClass {
	private String name;
	private int age;
	
	public OOClass() {
	}
	public OOClass(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
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
		Logger logger = LogManager.getLogger(OOClass.class.getName());
		OOClass oo1 = new OOClass();
		logger.info("name:\t\t" + oo1.getName());
		logger.info("age:\t\t" + oo1.getAge());
		
		OOClass oo2 = new OOClass("junneyang", 26);
		logger.info("name:\t\t" + oo2.getName());
		logger.info("age:\t\t" + oo2.getAge());
	}

}
