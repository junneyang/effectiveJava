/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaSocket.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月26日 下午7:28:22
 * @version: V1.0  
 */
package app;

/**
 * @ClassName: JavaSocket
 * @Description: Java 网络通信
 	* TCP：面向连接，三次握手保证正确连接，之后才正式发送数据——打手机、rpc
 	* UDP：数据报协议，通信不需要建立连接，不保证数据可以确定到达——发短信、心跳
 	* 套接字：对IP、端口进行抽象，实现端到端通信
 	* 对于TCP，客户端Socket、服务端ServerSocket。基于getInputStream、getOutputSteam进行通信
 	* 对于UDP协议客户端服务端都是DatagramSocket,SendTo/RecvFrom，完全依赖于数据包
 	* 示例采用简单的线程池方式实现异步，buf粗放型设计。以后再加入基于事件的网络设计开发示例
 * @author: yangjun03
 * @date: 2015年3月26日 下午7:28:22
 */
public class JavaSocket {

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
