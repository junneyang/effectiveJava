/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaGeneric.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月26日 上午11:26:34
 * @version: V1.0  
 */
package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: JavaGeneric
 * @Description: Java泛型
 	* 好处：代码复用、编译期间安全检查、不需要强制类型转化
 	* 注意：必须是引用类型、泛型通配符？ ？extends A——A以及A的子类构成的集合，不能添加元素
 	* ？super A——A以及A的父类的列表
 	* 带有super超类型限定的通配符可以向泛型对易用写入，带有extends子类型限定的通配符可以向泛型对象读取
 * @author: yangjun03
 * @date: 2015年3月26日 上午11:26:34
 */
public class JavaGeneric<T> {
	private static Logger logger = null;
	
	@SuppressWarnings("hiding")
	public <T> T disType(T t) {
		return t;
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
		logger = LogManager.getLogger(JavaGeneric.class.getName());
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		//list.add(123);
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			logger.info(string);
		}
		
		JavaGeneric<String> jg = new JavaGeneric<String>();
		System.out.println(jg.disType("123"));
		
		List<? extends String> l = new ArrayList<String>();
		//l.add(new String("123"));
		l = list;
		for (Iterator<? extends String> iterator = l.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			logger.info(string);
		}
	}

}
