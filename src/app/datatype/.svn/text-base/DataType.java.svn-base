/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: DataType.java
 * @Prject: effectiveJava
 * @Package: app.datatype
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月2日 下午2:26:33
 * @version: V1.0  
 */
package app.datatype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: DataType
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月2日 下午2:26:33
 */
public class DataType {
	private int num;
	private String name;
	private static Logger logger = null;
	
	public DataType() {
		// TODO Auto-generated constructor stub
	}
	public DataType(int num, String name) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.name = name;
	}
	public void disInfo() {
		logger.info("num:\t" + this.num);
		logger.info("name:\t" + this.name);
	}
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(DataType.class.getName());
		DataType dt = new DataType();
		dt.disInfo();
		dt = new DataType(123, "junneyang");
		dt.disInfo();
		
		String str = "abc";
		logger.info(str.hashCode());
		logger.info(str);
		int i = 123;
		logger.info(i);
	}

}
