/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: FutureTest.java
 * @Prject: effectiveJava
 * @Package: app.future
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月7日 下午4:32:48
 * @version: V1.0  
 */
package app.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: FutureTest
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月7日 下午4:32:48
 */
public class FutureTest {
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
		logger = LogManager.getLogger(FutureTest.class.getName());
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<String> future = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				logger.info("sub thread is running...");
				Thread.sleep(5000);
				return "hello,junneyang";
			}
		});
		executorService.shutdown();
		
		logger.info("main thread is running...");
		try {
			//logger.info("sub thread result : " + future.get());
			while (true) {
				if (future.isDone() && !future.isCancelled()) {
					logger.info("sub thread result : " + future.get());
					break;
				}
				logger.info("sub thread is not complete, waiting for 500 ms...");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		}
		logger.info("main thread is over...");
	}

}
