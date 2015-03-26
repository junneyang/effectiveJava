/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Consumer.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 下午6:27:32
 * @version: V1.0  
 */
package app;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Consumer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 下午6:27:32
 */
public class Consumer implements Runnable {
	private static Logger logger = null;
	private PublicResource pr;
	
	/**
	 * @Title:Consumer
	 * @Description:TODO
	 */
	public Consumer(PublicResource pr) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(Consumer.class.getName());
		this.pr = pr;
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
			this.pr.get();
			try {  
				Thread.sleep(1000);
			} catch (InterruptedException e) {  
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
		LinkedList<Object> wareHouse = new LinkedList<Object>();
		int max = 3;
		PublicResource pr = new PublicResource(wareHouse, max);
		Consumer c = new Consumer(pr);
		Thread th_c = new Thread(c);
		th_c.start();
	}

}
