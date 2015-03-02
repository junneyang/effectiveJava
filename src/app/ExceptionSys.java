/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Exception.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月2日 下午9:53:49
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

class ErrException extends Exception {
	private static final long serialVersionUID = 608751847135585998L;
	private int errno;
	private String msg;
	public ErrException(int errno, String msg) {
		this.errno = errno;
		this.msg = msg;
	}
	public int getErrno() {
		return errno;
	}
	public String getMsg() {
		return msg;
	}
}

/**
 * @ClassName: Exception
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月2日 下午9:53:49
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
			throw new ErrException(1000000000, "system internal exception");
		} catch (ErrException e) {
			// TODO: handle exception
			logger.info(e.getErrno());
			logger.info(e.getMsg());
		} finally {
			logger.info("finally");
		}
	}

}
