/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Producer.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 下午6:21:30
 * @version: V1.0  
 */
package app.java;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Producer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 下午6:21:30
 */
public class Producer implements Runnable {
	private static Logger logger = null;
	private PublicResource pr;
	
	/**
	 * @Title:Producer
	 * @Description:TODO
	 */
	public Producer(PublicResource pr) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(Producer.class.getName());
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
			this.pr.put();
			try {  
				Thread.sleep(10);
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
		Producer p = new Producer(pr);
		Thread th_p = new Thread(p);
		th_p.start();
	}

}
