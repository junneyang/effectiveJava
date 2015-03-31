/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaSynchorized.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月30日 上午11:22:57
 * @version: V1.0  
 */
package app;

/**
 * @ClassName: JavaSynchorized
 * @Description: Java同步器
 	* 信号量：semaphore，同步方式实现N（如果为1，相当于synchronized）个线程同时执行，可以改变生产者-消费者模式的实现
 	* 屏障：N个线程达到屏障点才能执行其他线程
 	* 倒计数闭锁：CountDownLatch，提供计数器，当计数器为0时，所有线程释放占用资源
 	* exchange:交换器，线程同步点实现数据交换
 * @author: yangjun03
 * @date: 2015年3月30日 上午11:22:57
 */
public class JavaSynchorized {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
