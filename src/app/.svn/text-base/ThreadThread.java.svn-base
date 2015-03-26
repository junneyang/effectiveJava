/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ThreadThread.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 下午12:17:03
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: ThreadThread
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 下午12:17:03
 */
public class ThreadThread extends Thread {
	private static Logger logger = null;
	private String name;
	public void run() {
		logger.info(this.name + " starts...");
		for (int i = 0; i < 5; i++) {
			logger.info(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			}
		}
	}
	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 */
	public ThreadThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param target
	 */
	public ThreadThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param name
	 */
	public ThreadThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param group
	 * @param target
	 */
	public ThreadThread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param group
	 * @param name
	 */
	public ThreadThread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param target
	 * @param name
	 */
	public ThreadThread(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param group
	 * @param target
	 * @param name
	 */
	public ThreadThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:ThreadThread
	 * @Description:TODO
	 * @param group
	 * @param target
	 * @param name
	 * @param stackSize
	 */
	public ThreadThread(ThreadGroup group, Runnable target, String name,
			long stackSize) {
		super(group, target, name, stackSize);
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
		logger = LogManager.getLogger(ThreadThread.class.getName());
		
		ThreadThread th0 = new ThreadThread("thread-0");
		ThreadThread th1 = new ThreadThread("thread-1");
		th0.start();
		th1.start();
		try {
			th0.join();
			th1.join();
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
	}

}
