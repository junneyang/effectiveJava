/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ConcreteClass.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月28日 下午10:40:08
 * @version: V1.0  
 */
package app.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: ConcreteClass
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年2月28日 下午10:40:08
 */
public class ConcreteClass extends AbstractClass {
	private static Logger logger = null;
	private String strstr;
	
	public ConcreteClass(String str, String strstr) {
		super(str);
		this.strstr = strstr;
		LogHandler.logInit();
		logger = LogManager.getLogger(ConcreteClass.class.getName());
	}
	public void disStr() {
		super.disStr();
		logger.info(this.strstr);
	}
	/* (non Javadoc)
	 * @Title: abstractMethod
	 * @Description: TODO
	 * @see app.AbstractClass#abstractMethod()
	 */
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		logger.info("abstractMethod");
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ab = new ConcreteClass("str", "strstr");
		ab.disStr();
		ab.abstractMethod();
		ab.upperStr();
	}

}
