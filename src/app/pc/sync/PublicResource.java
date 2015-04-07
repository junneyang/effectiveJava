/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: PublicResource.java
 * @Prject: effectiveJava
 * @Package: app.pc
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月3日 上午11:14:23
 * @version: V1.0  
 */
package app.pc.sync;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: PublicResource
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月3日 上午11:14:23
 */
public class PublicResource {
	private static Logger logger = null;
	private LinkedList<Object> wareHouse;
	private int maxSize;

	public PublicResource(LinkedList<Object> wareHouse, int maxSize) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(PublicResource.class.getName());
		this.wareHouse = wareHouse;
		this.maxSize = maxSize;
	}
	synchronized public void put(Object obj) {
		while (this.wareHouse.size() == this.maxSize) {
			logger.info("ware house is full, please wait...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.catching(e);
			}
		}
		this.wareHouse.add(obj);
		logger.info("put an object into ware house : " + obj);
		notifyAll();
	}
	synchronized public Object get() {
		while (this.wareHouse.size() == 0) {
			logger.info("ware house is empty, please wait...");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			}
		}
		Object obj = this.wareHouse.removeFirst();
		logger.info("get an object from ware house : " + obj);
		notifyAll();
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
