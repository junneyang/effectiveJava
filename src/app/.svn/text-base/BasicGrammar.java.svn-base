/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: BasicGrammar.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年2月27日 下午9:49:08
 * @version: V1.0  
 */
package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

/**
 * @ClassName: BasicGrammar
 * @Description: java基础语法
	 * 基础:		格式、大小写、标识符、注释、作用域{}、初始化(作用域中使用变量就需要初始化)
	 * 关键字:		if/else switch/case while for foreach do/while break continue return
	 * 数据类型:	基本数据类型(数字byte short int long float double、字符char、bool)	
	 * 			引用类型(类class、接口interface、数组[])
	 * 类型转换:	自动类型转换(源数据范围小于目标数据范围，赋值语句或者表达式语句中)、强制类型转换(源数据范围大于目标数据范围)
	 * 运算符:		算术运算符、赋值运算符、复合运算符、比较运算符、逻辑运算符、位运算符
	 * 程序结构:	顺序分支循环、辅助控制关键字
 * @author: yangjun03
 * @date: 2015年2月27日 下午9:49:08
 */
public class BasicGrammar {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		Logger logger = LogManager.getLogger(BasicGrammar.class.getName());
		//数据类型
		logger.info("byte:\t" + Byte.SIZE/8);
		logger.info("short:\t" + Short.SIZE/8);
		logger.info("int:\t\t" + Integer.SIZE/8);
		logger.info("long:\t" + Long.SIZE/8);
		logger.info("float:\t" + Float.SIZE/8);
		logger.info("double:\t" + Double.SIZE/8);
		logger.info("char:\t" + Character.SIZE/8);
		//数据类型
		float f = 12.21f;
		double d = 12.21d;
		long l = 123l;
		logger.info("f:\t\t" + f);
		logger.info("d:\t\t" + d);
		logger.info("l:\t\t" + l);
		//强制类型转换
		int i = 255;
		byte b = (byte) i;
		logger.info("i:\t\t" + i);
		logger.info("b:\t\t" + b);
		//默认数据类型，表达式中低范围数据自动转化为最大范围数据类型
		byte y = 12;
		y = (byte) (y - 2);
		logger.info("y:\t\t" + y);
		//比较运算符
		logger.info("1<2\t\t" + (1<2));
		//逻辑运算符
		logger.info("1<2&&2>3:\t" + (1 < 2 && 2 > 3));
		//位运算符
		logger.info("7&7:\t\t" + (7 & 7));
		logger.info("7<<2:\t" + (7 << 2));
		logger.info("-7<<2:\t" + (-7 << 2));
		logger.info("8>>2:\t" + (8 >> 2));
		logger.info("-8>>2:\t" + (-8 >> 2));
		logger.info("3<<29:\t" + (3 << 29));
		logger.info("3<<30:\t" + (3 << 30));
		logger.info("3>>2:\t" + (3 >> 2));
		logger.info("-3>>2:\t" + (-3 >> 2));
		logger.info("-3>>2:\t" + (-3 >>> 2));
		//switch-case语句
		switch (4) {
		case 3:
			logger.info("case:\texecute 3 brance");
			break;
		case 4:
			logger.info("case:\texecute 4 brance");
			break;
		default:
			logger.info("case:\texecute default brance");
			break;
		}
		//while循环
		int a[] = {1,2,3,4,5};
		logger.info("a.len:\t" + a.length);
		int index = 0;
		while (index < a.length) {
			logger.info("a.item:\t" + a[index]);
			index++;
		}
		//for循环
		for (int item : a) {
			logger.info("a.item:\t" + item);
		}
	}

}
