/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaThread.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 上午11:53:30
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.EnumSys;
import com.ErrException;
import com.LogHandler;


/**
 * @ClassName: JavaThread
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 上午11:53:30
 */
public class JavaThread {
	private static Logger logger = null;
	/**
	 * @Title: main
	 * @Description: Java线程
	 	* 进程与线程:	进程运行中的程序，线程运行中的代码片段
	 	* 线程创建:	基础Thread类-重写run方法，实现Runnable接口-重写run方法，前者不利于扩展，也不利于数据共享
	 	* 后台线程:	后台线程如果不join，立即停止。有join，都一样。
	 	* 线程安全:	synchronized修饰代码块、修饰方法
	 	* 线程通信:	notify/notifyall/wait，同样是对象方法
	 	* 线程问题:	线程死锁、线程饥饿
	 	* 线程停止:	比较复杂的问题，一种是通过run方法停止，一种是同座interrupt实现
	 	* 经典生产者消费者模式实现方法，方法一：公共资源：put、get加锁，等待与唤醒其他线程
	 	* 方法二：使用java阻塞队列LinkedBlockingQueue，阻塞队列内部已经实现了公共资源加锁机制，外部线程可直接使用get、put
	 	* 方法三：使用可重入锁以及await、signal方式,可重入锁提供了比synchronized更多的方法，但是保留了synchronized的方法行为，
	 	* 加入了锁的重入、中断、定时等
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(JavaThread.class.getName());
		logger.info("java thread");
		try {
			throw new ErrException(EnumSys.EXCEPTION);
		} catch (ErrException e) {
			// TODO: handle exception
			logger.error(e.getErrno());
			logger.error(e.getEnMsg());
			logger.error(e.getZhMsg());
		}
	}

}
