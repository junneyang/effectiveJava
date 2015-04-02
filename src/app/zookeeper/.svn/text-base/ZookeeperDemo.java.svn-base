/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ZookeeperDemo.java
 * @Prject: effectiveJava
 * @Package: zookeeper
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月1日 下午2:26:27
 * @version: V1.0  
 */
package app.zookeeper;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

import com.LogHandler;

/**
 * @ClassName: ZookeeperDemo
 * @Description: ZooKeeper使用
 	* Zookeeper 从设计模式角度来看，是一个基于观察者模式设计的分布式服务管理框架，它负责存储和管理大家都关心的数据，
 	* 然后接受观察者的注册，一旦这些数据的状态发生变化，Zookeeper 就将负责通知已经在 Zookeeper 上注册的那些观察者做出相应的反应，
 	* 从而实现集群中类似 Master/Slave 管理模式
 	* ZooKeeper 典型的应用场景如下：
 	* 统一命名服务（Name Service）
 	* 配置管理（Configuration Management）
 	* 集群管理（Group Membership）
 	* 共享锁（Locks）
 	* 队列管理
 * @author: yangjun03
 * @date: 2015年4月1日 下午2:26:27
 */
public class ZookeeperDemo {
	private static Logger logger = null;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(ZookeeperDemo.class.getName());
		logger.info("just a zookeeper demo");
		String connectString = "10.48.55.39:2181";
		int sessionTimeout = 5000;
		CountDownLatch connectedSignal = new CountDownLatch(1);
		ZooKeeper zk = null;
		try {
			zk = new ZooKeeper(connectString, sessionTimeout, new ZKWatcher(connectedSignal));
			connectedSignal.await();
			zk.create("/testRoot", "testRootData".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
			logger.info(zk.getChildren("/", true));
			logger.info(zk.getChildren("/testRoot", true));
			logger.info(new String(zk.getData("/testRoot", true, null)));
			zk.setData("/testRoot", "testRootDataMod".getBytes(), -1);
			logger.info(new String(zk.getData("/testRoot", true, null)));
			zk.delete("/testRoot",-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		} finally {
			try {
				zk.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.catching(e);
			}
		}
		/*zk = new ZooKeeper(connectString, sessionTimeout, new ZKWatcher(connectedSignal));
		connectedSignal.await();
		zk.close();*/
	}

}
