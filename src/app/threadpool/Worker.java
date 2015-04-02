/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Worker.java
 * @Prject: effectiveJava
 * @Package: app.threadpool
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月1日 下午4:27:52
 * @version: V1.0  
 */
package app.threadpool;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Worker
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月1日 下午4:27:52
 */
public class Worker implements Runnable {
	private static Logger logger = null;
	private String name;
	CountDownLatch begineSignal;
	CountDownLatch endSignal;
	/**
	 * @Title:Worker
	 * @Description:TODO
	 */
	public Worker(String name, CountDownLatch begineSignal, CountDownLatch endSignal) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(Worker.class.getName());
		this.name = name;
		this.begineSignal = begineSignal;
		this.endSignal = endSignal;
	}
	/* (non Javadoc)
	 * @Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.begineSignal.await();
			logger.info(this.name + " started...");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		} finally {
			logger.info(this.name + " completed...");
			this.endSignal.countDown();
		}
	}

}
