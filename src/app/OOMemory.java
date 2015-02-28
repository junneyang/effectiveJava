/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: OOMemory.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午6:36:02
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: OOMemory
 * @Description: java内存管理
 	* 栈(基本数据类型、对象的引用即地址、当然包括局部变量, 函数形式参数也是局部变量，退出作用域自动释放)、
 	* 堆(new出来的对象、当然包括成员变量，垃圾回收器负责回收)、
 	* 静态存储区(字符串常量和基本数据类型常量-public static final、各种描述符都属于常量、常量在编译器优化时已经决定，堆变量在程序运行时决定)
 	* String/StringBuilder理解
 	* 垃圾回收:	自动进行/System.gc/null
 * @author: yangjun03
 * @date: 2015年2月28日 下午6:36:02
 */
public class OOMemory {
	public OOMemory() {
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
		Logger logger = LogManager.getLogger(OOMemory.class.getName());
		//创建三个对象，常量区一个，堆中new出一个，栈中引用一个
		String str = new String("abcxyz");
		logger.info(str);
		
		String str1 = "abc"; 
		String str2 = "abc"; 
		logger.info(str1.equals(str2)); //true 
		logger.info(str1 == str2); //true 
		String str3 = new String("abc"); 
		String str4 = new String("abc"); 
		logger.info(str3.equals(str4)); //true 
		logger.info(str3 == str4); //false 
		
		final StringBuffer a = new StringBuffer("111"); 
		final StringBuffer b = new StringBuffer("222"); 
		//a=b;//此句编译不通过  final StringBuffer a = new StringBuffer("111"); 
		a.append(b);// 编译通过
		logger.info(a);
		
		String aa = "ab"; 
		String bb = "b"; 
		String bbb = "a" + bb; 
		logger.info((aa == bbb)); //result = false 
		String aaa = "ab"; 
		final String bbbb = "b"; 
		String bbbbb = "a" + bbbb; 
		logger.info((aaa == bbbbb)); //result = true 
		
		String tmp = new String("ABCXYZ");
		logger.info(tmp);
		tmp = null;
		System.gc();
	}

}
