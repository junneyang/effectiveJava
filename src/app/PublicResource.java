/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: PublicResource.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 下午2:58:17
 * @version: V1.0  
 */
package app;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: PublicResource
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 下午2:58:17
 */
public class PublicResource {
	private static Logger logger = null;
	private LinkedList<Object> wareHouse;
	private int max;
	
	/**
	 * @Title:PublicResource
	 * @Description:TODO
	 */
	public PublicResource(LinkedList<Object> wareHouse, int max) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(PublicResource.class.getName());
		this.wareHouse = wareHouse;
		this.max = max;
	}
	public synchronized void put() {
		while (this.wareHouse.size() == this.max) {
			logger.info("wareHouse is full , please wait");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			}
		}
		Object o = new Object();
		this.wareHouse.add(o);
		logger.info("wareHouse is added an object : " + o.toString() + ", you can get it");
		notify();
	}
	public synchronized void get() {
		while (this.wareHouse.size() == 0) {
			logger.info("wareHouse is empty , please wait");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			}
		}
		logger.info("wareHouse is geted an object : " + this.wareHouse.removeFirst().toString() + ", you can put it");
		notify();
	}
}
