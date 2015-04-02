/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ThreadRunnable.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 下午12:31:48
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: ThreadRunnable
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 下午12:31:48
 */
public class ThreadRunnable implements Runnable {
	private static Logger logger = null;
	private int sum;
	/**
	 * @Title:ThreadRunnable
	 * @Description:TODO
	 */
	public ThreadRunnable(int sum) {
		// TODO Auto-generated constructor stub
		this.sum = sum;
	}

	/* (non Javadoc)
	 * @Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			/*if (this.sum > 0) {
				//logger.info(this.sum);
				System.out.println(Thread.currentThread().getName() + " sell appale num : " + this.sum);
				this.sum -= 1;
				//System.out.println(Thread.currentThread().getName() + " cur num : " + this.sum);
			} //else {
				//System.out.println(Thread.currentThread().getName() + " all appale selled out");
				//System.exit(0);
			//}*/
			synchronized (this) {
				if (this.sum > 0) {
					//logger.info(this.sum);
					System.out.println(Thread.currentThread().getName() + " sell appale num : " + this.sum);
					this.sum -= 1;
					//System.out.println(Thread.currentThread().getName() + " cur num : " + this.sum);
				} //else {
					//System.out.println(Thread.currentThread().getName() + " all appale selled out");
					//System.exit(0);
				//}
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			}
		}
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
		logger = LogManager.getLogger(ThreadRunnable.class.getName());
		ThreadRunnable th = new ThreadRunnable(10);
		Thread th0 = new Thread(th, "th-0");
		Thread th1 = new Thread(th, "th-1");
		//th0.setDaemon(true);
		//th1.setDaemon(true);
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
