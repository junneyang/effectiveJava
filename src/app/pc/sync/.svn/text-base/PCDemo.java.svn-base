/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: PCDemo.java
 * @Prject: effectiveJava
 * @Package: app.pc
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月3日 下午9:06:05
 * @version: V1.0  
 */
package app.pc.sync;

import java.util.LinkedList;

/**
 * @ClassName: PCDemo
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月3日 下午9:06:05
 */
public class PCDemo {

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
		PublicResource publicResource = new PublicResource(wareHouse, maxSize);
		Producer producer = new Producer(publicResource);
		Consumer consumer = new Consumer(publicResource);
		for (int i = 0; i < 2; i++) {
			new Thread(producer).start();
			new Thread(consumer).start();
		}
	}

}
