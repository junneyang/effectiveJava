/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ProducerConsumer.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月22日 下午6:34:08
 * @version: V1.0  
 */
package app.java;

import java.util.LinkedList;

/**
 * @ClassName: ProducerConsumer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月22日 下午6:34:08
 */
public class ProducerConsumer {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> wareHouse = new LinkedList<Object>();
		int max = 1;
		PublicResource pr = new PublicResource(wareHouse, max);
		Producer producer = new Producer(pr);
		Consumer consumer = new Consumer(pr);
		Thread th_producer = new Thread(producer);
		Thread th_consumer = new Thread(consumer);
		th_producer.start();
		th_consumer.start();
	}

}
