/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: SemaphoreTest.java
 * @Prject: effectiveJava
 * @Package: app.semaphore
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月7日 下午2:30:00
 * @version: V1.0  
 */
package app.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: SemaphoreTest
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月7日 下午2:30:00
 */
public class SemaphoreTest implements Runnable {
	private static Logger logger = null;
	private Semaphore semaphore;
	
	public SemaphoreTest(Semaphore semaphore) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(SemaphoreTest.class.getName());
		this.semaphore = semaphore;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.semaphore.acquire();
			logger.info(Thread.currentThread().getName() + " acquire...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		} finally {
			logger.info(Thread.currentThread().getName() + " release...");
			this.semaphore.release();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore semaphore = new Semaphore(5);
		SemaphoreTest semaphoreTest = new SemaphoreTest(semaphore);
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 20; i++) {
			executorService.execute(semaphoreTest);
		}
		executorService.shutdown();
	}

}
