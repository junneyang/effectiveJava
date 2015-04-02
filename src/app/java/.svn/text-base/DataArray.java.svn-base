/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: DataArray.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月1日 上午9:21:11
 * @version: V1.0  
 */
package app.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: DataArray
 * @Description: java数组
 	* 概念、声明以及初始化(new方式初始化-运行时初始化或者声明就初始化、直接静态初始化)
 	* ArrayList:	动态扩展
 * @author: yangjun03
 * @date: 2015年3月1日 上午9:21:11
 */
public class DataArray {
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
		logger = LogManager.getLogger(DataArray.class.getName());
		//new方式初始化
		int [] data = new int[10];
		for(int i = 0; i < 10; i++) {
			data[i] = i+1;
		}
		for (int i = 0; i < data.length; i++) {
			logger.info(data[i]);
		}
		//直接赋值初始化
		int [] data2 = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < data2.length; i++) {
			logger.info(data2[i]);
		}
		//二维数组初始化
		int [][]data3 = new int[2][5];
		for (int i = 0; i < data3.length; i++) {
			for (int j = 0; j < 5; j++) {
				data3[i][j] = (i+1)*j;
			}
		}
		for (int i = 0; i < data3.length; i++) {
			for (int j = 0; j < 5; j++) {
				logger.info(data3[i][j]);
			}
		}
		//二维数组直接初始化
		int [][]data4 = {{1,3,5,7,9},{2,4,6,8,10}};
		for (int i = 0; i < data4.length; i++) {
			for (int j = 0; j < data4[i].length; j++) {
				logger.info(data4[i][j]);
			}
		}
		//new时候静态初始化
		int [][]data5 = new int[][]{new int[]{1,2,3},new int[]{4,5}};
		for (int i = 0; i < data5.length; i++) {
			for (int j = 0; j < data5[i].length; j++) {
				logger.info(data5[i][j]);
			}
		}
		
		//ArrayList动态扩展功能
		List<Integer> data_list = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			data_list.add(i+1);
		}
		for (Iterator<Integer> iterator = data_list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			logger.info(integer);
		}
	}

}
