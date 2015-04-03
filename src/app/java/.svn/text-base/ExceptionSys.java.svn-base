/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ExceptionSys.java
 * @Prject: effectiveJava
 * @Package: app.java
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月2日 下午6:50:34
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.EnumSys;
import com.ErrException;
import com.LogHandler;

/**
 * @ClassName: ExceptionSys
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月2日 下午6:50:34
 */
public class ExceptionSys {
	private static Logger logger = null;
	/**
	 * @Title: main
	 * @Description: java异常处理
	 	* Throwable:是java异常机制的超类,Exception和error是:throwable的子,Error:是程序无法解决问题. 内存溢出了,突然断电
	 	* Exception:我们可以通过程序控制的异常.
	 	* 不管return是否返回Finalily肯定是要被执行的.
	 	* Throws：声明一个异常:这里可能要抛出异常了,Throw:才是真正的抛出一个异常的对象
	 	* finally不一定是最后执行的代码，如果try/catch有return语句，finally还会回到return语句做为结束点
	 	* 但是不管是否有return，finally肯定是会被执行的
	 	* enum exception可以结合使用提供比较完美的国际化解决方案
	 * @param args
	 * @return: void
	 */
	public int divTest(int a, int b) {
		int c = -1;
		try {
			c = a/b;
			return c;
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			return c;
		} finally {
			logger.info("finally");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(ExceptionSys.class.getName());
		int a = 10;
		int b = 0;
		int c = new ExceptionSys().divTest(a, b);
		logger.info(c);
		
		
		try {
			throw new ErrException(EnumSys.EXCEPTION);
		} catch (ErrException e) {
			// TODO: handle exception
			logger.info(e.getErrno());
			logger.info(e.getEnMsg());
			logger.info(e.getZhMsg());
		} finally {
			logger.info("finally");
		}
	}
}
