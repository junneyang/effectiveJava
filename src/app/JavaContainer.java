/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: JavaContainer.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月23日 下午6:44:59
 * @version: V1.0  
 */
package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: JavaContainer
 * @Description: Java容器
 	* 线性表:ArrayList && LinkedList
 	* 集合:HashSet && TreeSet
 	* map:HashMap && TreeMap
 	* 队列:Queue
 	* List的vector是线程安全的-早期版本-源码中所有方法都经过sychornized关键字进行修饰,ArrayList非线程安全，但是
 	* Collections.synchronizedList(l);可以将ArrayList转化成线程安全的List。Set/Map雷同
 	* CopyOnWriteArrayList读大于写的时候性能较好，是Collections.synchronizedList另外一种替代思路，可以应用于缓存
 	* Queue:ConcurrentLinkedQueue:提供的并发queue,无界线程安全队列,非阻塞的队列,没有 Take和put成对出现.
 	* ArrayBlockingQueue:阻塞的队列,当queue满的时候，会阻塞指导queue可以插入数据为止,当queue为空的时候会一直阻塞直到有元素为止. Take和put  成对出现.
 	* Collections同步方式比较老的方式，流行的方式是java并发包提供的线程安全版本
 	* JAVA迭代异常：java.util.ConcurrentModificationException 对于 
 	* hashset  ArrayList   LinkedList   TreeSet  hashMap   treeMap  linkedHashMap
 	* 在迭代元素的时候  是不允许去修改我们的集合的.一旦修改会出现迭代异常.后来并发包下的集合解决了这个问题，引入弱迭代器.
 	* 或者使用CopyOnWrite方式
 * @author: yangjun03
 * @date: 2015年3月23日 下午6:44:59
 */
public class JavaContainer {
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
		logger = LogManager.getLogger(JavaContainer.class.getName());
		
		//ArrayList && LinkedList
		logger.info("//ArrayList && LinkedList");
		List<Object> list = new ArrayList<Object>();
		list.add(123);
		list.add(123.321);
		list.add("hello,junneyang");
		for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
		}
		
		//HashSet && TreeSet
		logger.info("//HashSet && TreeSet");
		Set<Object> set = new TreeSet<Object>();
		set.add(123);
		set.add(321);
		set.add(123);
		for (Iterator<Object> iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
		}
		
		//HashMap && TreeMap
		logger.info("//HashMap && TreeMap");
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(1, "junne,yang");
		map.put(2, "ahuang");
		map.put(3, "chaohui");
		map.put(1, "junne,yang");
		for (Map.Entry<Object, Object> entry:map.entrySet()) {
			logger.info(entry.getKey() + ":\t" + entry.getValue());
		}
		Iterator<Object> it = map.keySet().iterator();
		while(it.hasNext()){
			Object key = it.next();
			logger.info(key + ":\t" + map.get(key));
		}
		
		//Queue
		logger.info("//Queue");
		Queue<Object> queue = new LinkedBlockingQueue<Object>();
		queue.add(123);
		queue.add(123.321);
		queue.add(6789);
		for (Iterator<Object> iterator = queue.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
		}
		
		//ArrayList与Collections.synchronizedList
		logger.info("//ArrayList与Collections.synchronizedList");
		List<Object> l = new ArrayList<Object>();
		l.add(123);
		l.add(456);
		l.add("junne");
		for (Iterator<Object> iterator = l.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
		}
		List<Object> ll = Collections.synchronizedList(l);
		ll.add("yang");
		for (Iterator<Object> iterator = ll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
		}
		for (Iterator<Object> iterator = l.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
		}
		
		//ArrayList线程安全问题
		List<Object> lista = new ArrayList<Object>();
		//List<Object> lista = new CopyOnWriteArrayList<Object>();
		final int SIZE = 10;
		for (int i = 0; i < SIZE; i++) {
			lista.add(i);
		}
		/*for (Object object : lista) {
			lista.remove(object);
		}*/
		//ERROR accures
		try {
			for (Object object : lista) {
				lista.remove(object);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
		//Iterator forbid
		for (Iterator<Object> iterator = lista.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			logger.info(object);
			iterator.remove();
		}
		logger.info(lista.size());
		
	}

}
