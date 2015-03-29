/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaAtom.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月27日 下午3:00:59
 * @version: V1.0  
 */
package app;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: JavaAtom
 * @Description: Java原子类
 	* synchronized线程之间同步到达线程安全，本质是互斥锁，是一个悲观锁
 	* 乐观锁通过CAS实现：通过硬件指令的方式实现乐观锁,以及锁的非阻塞方式来实现线程之间的同步。乐观+非阻塞。读写一步完成Atom——通过硬件实现
 	* 单个变量有效，复合变量通过同步器等方法实现
 	* Volatile：保证单个变量的可见性，通过CAS保证单个共享变量的原子性，对于线程安全的有序性也有保障。——可见、原子、有序
 	* Atomic开头的代表类，比如：AtomicLong
 * @author: yangjun03
 * @date: 2015年3月27日 下午3:00:59
 */
public class JavaAtom {
	private static Logger logger = null;
	private AtomicInteger num;
	
	/**
	 * @Title:JavaAtom
	 * @Description:TODO
	 */
	public JavaAtom(int num) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(JavaAtom.class.getName());
		this.num = new AtomicInteger(num);
		logger.info("total num : " + this.num);
	}
	public void decNum(int dec) {
		Integer current = this.num.get();
		if (current > 0) {
			if (this.num.compareAndSet(current, current - dec)) {
				logger.info(Thread.currentThread().getName() + " decNum : " + current);
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

	}

}
