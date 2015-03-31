/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaNIO.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月30日 下午10:03:03
 * @version: V1.0  
 */
package app;

/**
 * @ClassName: JavaNIO
 * @Description: Java异步IO
 	* 阻塞和非阻塞、同步和异步的方式
 	* IO事件的轮询  --多路复用技术(select模式)
 	* Java IO模型：
 	* BIO:JDK1.4以前我们使用都是BIO 阻塞IO
 	* 阻塞到我们的读写方法,阻塞到线程来提供性能.对于线程的开销本来就是性能的浪费.
 	* NIO:jdk1.4  linux 多路复用技术(select模式)  实现IO事件的轮询方式:同步非阻塞的模式.这个种方式目前是主流的网络通信模式.
 	* Mina，netty    mina2.0    netty5.0---网络通信框架.比我直接写NIO要容易些  并且代码可读性更好
 	* AIO:jdk1.7 (NIO2) 才是实现真正的异步aio，学习linux epoll模式
 	* AIO使用的比较少,大家可以认真的学习一些思想
 	* 
 * @author: yangjun03
 * @date: 2015年3月30日 下午10:03:03
 */
public class JavaNIO {

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
