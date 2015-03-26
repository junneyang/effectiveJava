/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaReflect.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月26日 下午5:05:59
 * @version: V1.0  
 */
package app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: JavaReflect
 * @Description: Java反射
 	* java vm启动时加载class文件，java对class字节码文件的描述也有专用的类Class
 	* 通过Class可以动态的获取类的信息，这叫做反射
 	* 三种方式获取Class对象：通过类名、通过类名字符串、通过类对象
 	* 获取Class对象之后就可以获取很多此类相关的信息如构造函数、方法、属性等、可以得到构造函数创建实例、可以执行方法
 * @author: yangjun03
 * @date: 2015年3月26日 下午5:05:59
 */
public class JavaReflect {
	private static Logger logger = null;
	private String name;
	/**
	 * @Title:JavaReflect
	 * @Description:TODO
	 */
	public JavaReflect(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public void disInfo() {
		logger.info(this.name);
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
		logger = LogManager.getLogger(JavaReflect.class.getName());
		logger.info("this is java reflect->" + JavaReflect.class.getName());
		Class<JavaReflect> cls = JavaReflect.class;
		Method[] m = cls.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			logger.info(m[i].getName());
		}
		
		try {
			
			Class<?> c = Class.forName("app.JavaReflect");
			Method[] method = c.getDeclaredMethods();
			for (int i = 0; i < method.length; i++) {
				logger.info(method[i]);
			}
			Constructor<?>[] cns = c.getConstructors();
			for (int i = 0; i < cns.length; i++) {
				logger.info(cns[i]);
				JavaReflect j = (JavaReflect)cns[i].newInstance("newInstance 123");
				j.disInfo();
			}
			
			Field[] fields = c.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				logger.info(fields[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
	}

}
