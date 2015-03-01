/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: StreamGobbler.java
 * @Prject: effectiveJava
 * @Package: com
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月1日 下午12:12:25
 * @version: V1.0  
 */
package com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName: StreamGobbler
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月1日 下午12:54:16
 */
public class StreamGobbler extends Thread {
	private static Logger logger = null;
	private InputStream ins;
	private StringBuffer output;
	
	public StreamGobbler(InputStream ins, StringBuffer output) {
		this.ins = ins;
		this.output = output;
		LogHandler.logInit();
		logger = LogManager.getLogger(StreamGobbler.class.getName());
	}
	public void run() {
		try {
			InputStreamReader isr = new InputStreamReader(this.ins);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line=br.readLine()) != null) {
				this.output.append(line + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
	}
}
