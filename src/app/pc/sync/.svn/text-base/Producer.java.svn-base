/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: Producer.java
 * @Prject: effectiveJava
 * @Package: app.pc
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月3日 下午8:54:31
 * @version: V1.0  
 */
package app.pc.sync;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: Producer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月3日 下午8:54:31
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
	/* (non Javadoc)
	 * @Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
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
		Producer producer = new Producer(new PublicResource(wareHouse, maxSize));
		for (int i = 0; i < 2; i++) {
			new Thread(producer).start();
		}
	}

}
