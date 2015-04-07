/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: PublicResourec.java
 * @Prject: effectiveJava
 * @Package: app.pc.lock
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月5日 下午6:01:05
 * @version: V1.0  
 */
package app.pc.lock;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: PublicResourec
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月5日 下午6:01:05
 */
public class PublicResource {
	private static Logger logger = null;
	private LinkedList<Object> wareHouse;
	private int maxSize;
	final Lock lock = new ReentrantLock();
	final Condition full = lock.newCondition();
	final Condition empty = lock.newCondition();
	
	public PublicResource(LinkedList<Object> wareHouse, int maxSize) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(PublicResource.class.getName());
		this.wareHouse = wareHouse;
		this.maxSize = maxSize;
	}
	public void put(Object object) {
		lock.lock();
		try {
			while (this.wareHouse.size() == this.maxSize) {
				logger.info("ware house is full, please wait...");
				full.await();
			}
			this.wareHouse.add(object);
			logger.info("put an object into ware house : " + object);
			empty.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		} finally {
			lock.unlock();
		}
	}
	public Object get() {
		lock.lock();
		Object obj = null;
		try {
			while (this.wareHouse.size() == 0) {
				logger.info("ware house is empty, please wait...");
				empty.await();
			}
			obj = this.wareHouse.removeFirst();
			logger.info("get an object from ware house : " + obj);
			full.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		} finally {
			lock.unlock();
		}
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
