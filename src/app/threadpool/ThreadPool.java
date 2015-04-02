/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ThreadPool.java
 * @Prject: effectiveJava
 * @Package: app.threadpool
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月1日 下午4:26:10
 * @version: V1.0  
 */
package app.threadpool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: ThreadPool
 * @Description: Java CountDownLatch与ExecutorService结合使用
 	* ExecutorService用于构造线程池
 	* CountDownLatch用于主线程等待线程池结束，同步辅助类
 	* 在一些应用场合中，需要等待某个条件达到要求后才能做后面的事情；同时当线程都完成后也会触发事件，以便进行后面的操作。 
 	* 这个时候就可以使用CountDownLatch。CountDownLatch最重要的方法是countDown()和await()，
 	* 前者主要是倒数一次，后者是等待倒数到0，如果没有到达0，就只有阻塞等待了。
 	* 为安全起见，countDown方法最好放在finally块保证其执行
 * @author: yangjun03
 * @date: 2015年4月1日 下午4:26:10
 */
public class ThreadPool {
	private static Logger logger = null;
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(ThreadPool.class.getName());
		
		final int POOL_SIZE = 5;
		CountDownLatch begineSignal = new CountDownLatch(1);
		CountDownLatch endSignal = new CountDownLatch(5);
		ExecutorService executorService = Executors.newFixedThreadPool(POOL_SIZE);
		for (int i = 0; i < POOL_SIZE; i++) {
			executorService.execute(new Worker("Thread-" + i, begineSignal, endSignal));
		}
		try {
			logger.info("all workers begin");
			begineSignal.countDown();
			endSignal.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		}
		logger.info("all workers end");
		executorService.shutdown();
	}

}
