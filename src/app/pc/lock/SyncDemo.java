/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: SyncDemo.java
 * @Prject: effectiveJava
 * @Package: app.pc.lock
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月5日 下午6:38:04
 * @version: V1.0  
 */
package app.pc.lock;

import java.util.LinkedList;

/**
 * @ClassName: SyncDemo
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月5日 下午6:38:04
 */
public class SyncDemo {

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
		Consumer consumer = new Consumer(pr);
		for (int i = 0; i < 2; i++) {
			new Thread(producer).start();
			new Thread(consumer).start();
		}
	}

}
