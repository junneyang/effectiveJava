/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Consumer.java
 * @Prject: effectiveJava
 * @Package: app.pc
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月3日 下午9:02:33
 * @version: V1.0  
 */
package app.pc;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Consumer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月3日 下午9:02:33
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
	/* (non Javadoc)
	 * @Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
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
		Consumer consumer = new Consumer(new PublicResource(wareHouse, maxSize));
		for (int i = 0; i < 2; i++) {
			new Thread(consumer).start();
		}
	}

}
