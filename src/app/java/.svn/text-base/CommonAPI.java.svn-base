/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: CommonAPI.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月1日 上午10:15:46
 * @version: V1.0  
 */
package app.java;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;
import com.StreamGobbler;

/**
 * @ClassName: CommonAPI
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月1日 上午10:15:46
 */
public class CommonAPI {
	private static Logger logger = null;
	/**
	 * @Title: main
	 * @Description: java常用API
	 	* String:		final修饰的类，不可变(每次修改都需要创建临时的string对象)
	 	* StringBuffer:	final修饰的类，但是可以变(修改StringBuffer不会创建新对象)
	 	* StringBuilder:	和StringBuffer一样，但是StringBuilder是线程非安全的，StringBuffer线程安全
	 	* System:		操作系统相关类，同时包括输入输出错误流
	 	* Runtime:		JVM运行时属性方法
	 	* Calendar:		日历操作类
	 	* Date:			日期操作类
	 	* DateFormate:	日期格式化工具
	 	* Math/Random:	java数学计算
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(CommonAPI.class.getName());
		String stra = new String("CommonAPI-String");
		logger.info(stra);
		StringBuffer strb = new StringBuffer("CommonAPI");
		strb.append("-StringBuffer");
		logger.info(strb);
		StringBuilder strc = new StringBuilder("CommonAPI");
		strc.append("-StringBuilder");
		logger.info(strc);
		
		//String cmdStr = "dir /B";
		String cmdStr = "java -version";
		Runtime r = Runtime.getRuntime();
		Process p = null;
		StringBuffer error = new StringBuffer();
		StringBuffer output = new StringBuffer();
		try {
			String osName = System.getProperty("os.name");
			logger.info(osName);
			if (osName.equals("Windows NT") || osName.equals("Windows 7")) {  
				p = r.exec("cmd.exe /C " + cmdStr);
			} else if (osName.equals("Windows 95")) {
				p = r.exec("command.com /C " + cmdStr);
			} else if (osName.equals("Linux")) {
				p = r.exec(cmdStr);
			}
			StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), error);
			StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), output);
			errorGobbler.start();
			outputGobbler.start();
			p.waitFor();
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
		logger.info(p.exitValue());
		logger.info("error:\n" + error);
		logger.info("output:\n" + output);
		
		//java日期操作
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date date = cal.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:mm");
		String dateStr = df.format(date);
		logger.info(dateStr);
		
		//java数学计算
		int num = -12;
		logger.info(Math.abs(num));
		for (int i = 0; i < 10; i++) {
			logger.info(new Random().nextInt(10));
		}
	}

}
