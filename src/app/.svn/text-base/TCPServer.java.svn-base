/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: TCPServer.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月26日 下午8:36:43
 * @version: V1.0  
 */
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: TCPServer
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月26日 下午8:36:43
 */
public class TCPServer {
	private static Logger logger = null;
	
	static class Worker implements Runnable {
		private Socket clientSocket;
		
		/**
		 * @Title:TCPServer.Worker
		 * @Description:TODO
		 */
		public Worker(Socket clientSocket) {
			// TODO Auto-generated constructor stub
			this.clientSocket = clientSocket;
		}
		public void handleSocket() {
			BufferedReader reader = null;
			BufferedWriter writer = null;
			try {
				reader = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
				writer = new BufferedWriter(new OutputStreamWriter(this.clientSocket.getOutputStream()));
				
				char[] readbuf = new char[1024];
				int len;
				String temp = null;
				int index;
				StringBuilder sb = new StringBuilder();
				while((len = reader.read(readbuf)) != -1) {
					temp = new String(readbuf, 0, len);
					logger.info("fregment recv from client : " + temp);
					if ((index = temp.indexOf("eof")) != -1) {
						sb.append(temp.substring(0, index));
						break;
					}
					sb.append(temp);

				}
				logger.info("total recv from client : " + sb.toString());
				
				//没有机会执行，上面的循环体在clientSocket关闭之后才会退出，需要加上长度或者关键符号判断是否已经读取完毕
				String responseLine = "hello, junneyang client : " + this.clientSocket.getInetAddress().toString();
				writer.write(responseLine);
				writer.write("eof");
				writer.flush();
				logger.info("send to client : " + responseLine);
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			} finally {
				try {
					reader.close();
					writer.close();
					this.clientSocket.close();
					logger.info("client socket closed success...");
				} catch (Exception e2) {
					// TODO: handle exception
					logger.catching(e2);
				}
			}
		}
		/* (non Javadoc)
		 * @Title: run
		 * @Description: TODO
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			this.handleSocket();
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
		LogHandler.logInit();
		logger = LogManager.getLogger(TCPServer.class.getName());
		int port = 8888;
		ServerSocket serverSocket = null;
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		try {
			int backlog = 2;
			serverSocket = new ServerSocket(port, backlog);
			logger.info("create server socket success on port " + port);
			
			while (true) {
				Socket clientSocket = serverSocket.accept();
				logger.info("client socket connected : " + clientSocket.getInetAddress().toString());
				//new Thread(new Worker(clientSocket)).start();
				Thread worker = new Thread(new Worker(clientSocket));
				executorService.execute(worker);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		} finally {
			//关闭线程池
			executorService.shutdown();
			try {
				serverSocket.close();
				logger.info("server socket closed success...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.catching(e);
			}
		}
		
	}

}
