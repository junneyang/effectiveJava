/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: TCPClient.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月26日 下午8:07:08
 * @version: V1.0  
 */
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: TCPClient
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月26日 下午8:07:08
 */
public class TCPClient {
	private static Logger logger = null;
	
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(TCPClient.class.getName());
		String host = "127.0.0.1";
		int port = 8888;
		Socket clientSocket = null;
		try {
			clientSocket = new Socket(host, port);
			logger.info("create client socket success...");
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			String tempinput = null;
			int indexinput;
			StringBuilder sbinput = new StringBuilder();
			while (true) {
				tempinput = input.readLine();
				writer.write(tempinput);
				writer.flush();
				//clientSocket.setSoTimeout(5*1000);
				logger.info("fregment request send to server : " + tempinput);
				if ((indexinput = tempinput.indexOf("eof")) != -1) {
					sbinput.append(tempinput.substring(0, indexinput));
					break;
				}
				sbinput.append(tempinput);
			}
			logger.info("total request send to server : " + sbinput.toString());
			
			char[] readBuf= new char[1024];
			int len;  
			String temp;
			int index;
			StringBuffer sb = new StringBuffer();  
			while ((len=reader.read(readBuf)) != -1) {  
				temp = new String(readBuf, 0, len);  
				if ((index = temp.indexOf("eof")) != -1) {  
					sb.append(temp.substring(0, index));
					break;  
				}
				sb.append(temp);  
			}
			logger.info("recv from server : " + sb.toString());
			writer.close();
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		} finally {
			try {
				clientSocket.close();
				logger.info("client socket closed success...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.catching(e);
			}
		}
	}

}
