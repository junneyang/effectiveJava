/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaAtomThread.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月29日 下午7:47:14
 * @version: V1.0  
 */
package app.java;

/**
 * @ClassName: JavaAtomThread
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月29日 下午7:47:14
 */
public class JavaAtomThread implements Runnable {
	private JavaAtom ja;
	
	/**
	 * @Title:JavaAtomThread
	 * @Description:TODO
	 */
	public JavaAtomThread(JavaAtom ja) {
		// TODO Auto-generated constructor stub
		this.ja = ja;
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
			this.ja.decNum(1);
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
		JavaAtom ja = new JavaAtom(10);
		JavaAtomThread jat = new JavaAtomThread(ja);
		Thread th0 = new Thread(jat);
		Thread th1 = new Thread(jat);
		Thread th2 = new Thread(jat);
		th0.start();
		th1.start();
		th2.start();
	}

}
