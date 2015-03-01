/**  
 * Copyright © 2015 JunneYang. All rights reserved.
 *
 * @Title: IOSyetem.java
 * @Prject: effectiveJava
 * @Package: app
 * @Description: TODO
 * @author: yangjun03  
 * @date: 2015年3月1日 下午5:04:15
 * @version: V1.0  
 */
package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LogHandler;

class Person implements Serializable {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 276271507190337365L;
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}

/**
 * @ClassName: IOSyetem
 * @Description: TODO
 * @author: yangjun03
 * @date: 2015年3月1日 下午5:04:15
 */
public class IOSyetem {
	private static Logger logger = null;
	/**
	 * @Title: main
	 * @Description: java IO操作
	 	* File:		文件、目录操作抽象(信息获取、判断、创建删除等操作)
	 	* IO结构:		输入输出流(输入输出相对于应用程序来说,应用程序写文件输出，应用程序读文件输入流)
	 	* 分类:		字节流(InputStream/OutStream)、字符流(Reader/Writer)、flush从缓冲区到流
	 	* InputStream/OutStream-FileInputStream/ObjectInputStream/BufferInputStream
	 	* Reader/Writer-BufferReader/InputStreamReader-FileReader
	 	* 字节流、字符流二者之间的桥梁是OutputStreamWriter、InputStreamReader
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		logger = LogManager.getLogger(IOSyetem.class.getName());
		File file = new File("file.txt");
		logger.info(file.getAbsolutePath());
		logger.info(file.exists());
		logger.info(file.isDirectory());
		logger.info(file.isFile());
		file = new File("./log/com.log");
		logger.info(file.getAbsolutePath());
		logger.info(file.exists());
		logger.info(file.isDirectory());
		logger.info(file.isFile());
		file = new File("./log");
		logger.info(file.getAbsolutePath());
		logger.info(file.exists());
		logger.info(file.isDirectory());
		logger.info(file.isFile());
		file = new File("file.txt");
		try {
			/*FileWriter fw = new FileWriter(file, false);
			fw.write("Hello,World !!!\n");
			fw.write("this is junneyang\n");
			fw.write("欢迎您\n");
			fw.close();*/
			
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file, false), "UTF-8");
			osw.write("Hello,World !!!\n");
			osw.write("this is junneyang\n");
			osw.write("欢迎您\n");
			osw.close();
			//file.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line=br.readLine()) != null) {
				logger.info(line);
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		file = new File("fileobject.txt");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(new Person("junneyang", 26));
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Person person = (Person) ois.readObject();
			logger.info(person.getName());
			logger.info(person.getAge());
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.catching(e);
		}
		
	}

}
