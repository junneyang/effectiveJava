/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Consumer.java
 * @Prject: effectiveJava
 * @Package: app.pc.lock
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月5日 下午6:34:00
 * @version: V1.0  
 */
package app.pc.lock;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Consumer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月5日 下午6:34:00
 */
public class Consumer implements Runnable {
	private static Logger logger = null;
	private PublicResource pr;
	
	public Consumer(PublicResource pr) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(Consumer.class.getName());
		this.pr = pr;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Object object = this.pr.get();
			System.out.println(object);
			try {
				Thread.sleep(10);
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
		LinkedList<Object> wareHouse = new LinkedList<Object>();
		int maxSize = 5;
		PublicResource pr = new PublicResource(wareHouse, maxSize);
		Consumer consumer = new Consumer(pr);
		for (int i = 0; i < 2; i++) {
			new Thread(consumer).start();
		}
	}

}
