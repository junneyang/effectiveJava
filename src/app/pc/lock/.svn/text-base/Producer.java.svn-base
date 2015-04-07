/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Producer.java
 * @Prject: effectiveJava
 * @Package: app.pc.lock
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月5日 下午6:26:10
 * @version: V1.0  
 */
package app.pc.lock;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import app.pc.lock.PublicResource;

import com.LogHandler;

/**
 * @ClassName: Producer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月5日 下午6:26:10
 */
public class Producer implements Runnable {
	private static Logger logger = null;
	private PublicResource pr;
	
	public Producer(PublicResource pr) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(Producer.class.getName());
		this.pr = pr;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			this.pr.put(new Object());
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
		LinkedList<Object> wareHouse = new LinkedList<Object>();
		int maxSize = 5;
		PublicResource pr = new PublicResource(wareHouse, maxSize);
		Producer producer = new Producer(pr);
		for (int i = 0; i < 2; i++) {
			new Thread(producer).start();
		}
	}

}
