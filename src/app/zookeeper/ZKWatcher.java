/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: ZKWatcher.java
 * @Prject: effectiveJava
 * @Package: app.zookeeper
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年4月1日 下午3:25:14
 * @version: V1.0  
 */
package app.zookeeper;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;

import com.LogHandler;

/**
 * @ClassName: ZKWatcher
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年4月1日 下午3:25:14
 */
public class ZKWatcher implements Watcher {
	private static Logger logger = null;
	private CountDownLatch connectedSignal;
	/**
	 * @Title:ZKWatcher
	 * @Description:TODO
	 */
	public ZKWatcher(CountDownLatch connectedSignal) {
		// TODO Auto-generated constructor stub
		LogHandler.logInit();
		logger = LogManager.getLogger(ZKWatcher.class.getName());
		this.connectedSignal = connectedSignal;
	}
	/* (non Javadoc)
	 * @Title: process
	 * @Description: TODO
	 * @param event
	 * @see org.apache.zookeeper.Watcher#process(org.apache.zookeeper.WatchedEvent)
	 */
	@Override
	public void process(WatchedEvent event) {
		// TODO Auto-generated method stub
		logger.info("触发 : " + event.getType() + " 事件");
		if (event.getState() == KeeperState.SyncConnected) {
			logger.info("connect to server success");
			this.connectedSignal.countDown();
		}
	}

}
