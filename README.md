# effectiveJava
effective java, deep learning and practice for java.

### 000.LogHandler
* logging initial with ./conf/log4j2.xml

### 001.HelloWorld
* HelloWorld，工程代码框架结构

### 002.BasicGrammar
* java基础语法
* 基础:		格式、大小写、标识符、注释、作用域{}、初始化(作用域中使用变量就需要初始化)
* 关键字:		if/else switch/case while for foreach do/while break continue return
* 数据类型:	基本数据类型(数字byte short int long float double、字符char、bool)	
* 			引用类型(类class、接口interface、数组[])
* 类型转换:	自动类型转换(源数据范围小于目标数据范围，赋值语句或者表达式语句中)、强制类型转换(源数据范围大于目标数据范围)
* 运算符:		算术运算符、赋值运算符、复合运算符、比较运算符、逻辑运算符、位运算符
* 程序结构:	顺序分支循环、辅助控制关键字

### 003.FunctionDesign
* java函数
* 基础:		定义、参数传递、调用、重载

### 004.OOClass
* java面向对象编程-类与对象
* 概念(面向过程更多思考的是算法的实现,这种建模方式有缺陷,通常数据结构与算法是密不可分的,面向对象对此作了改进,将方法和属性看作一个整体,
* 首先思考对象之间的关系,然后才考虑具体的过程实现)
* 构造函数(如果没有构造函数初始化,基本数据类型0,引用null)、this指针
* 函数重载
* static关键字(可以修饰属性和方法，可以通过对象也可以通过类调用，实例方法、属性只有在对象创建之后才能调用，静态方法不能调用实例方法、属性，只能调用静态方法、属性)
* final关键字(只读属性)
* 访问修饰符(private/friendly/protected/public)

### 005.OOMemory
* java内存管理
* 栈(基本数据类型、对象的引用即地址、当然包括局部变量, 函数形式参数也是局部变量，退出作用域自动释放)、
* 堆(new出来的对象、当然包括成员变量，垃圾回收器负责回收)、
* 静态存储区(字符串常量和基本数据类型常量-public static final、各种描述符都属于常量、常量在编译器优化时已经决定，堆变量在程序运行时决定)
* String/StringBuilder理解
* 垃圾回收:	自动进行/System.gc/null

### 006.OOParam
* java参数传递
* java只有值传递一种方式，如果传递的是基本数据类型，实参不会改变。如果传递的是引用，则引用不会发生改变、引用的值可以发生改变。
* 区别是：基本数据类型传递数据类型值不变，引用传递引用指向的值可以修改。

### 007.OOFeature
* java封装、继承、抽象类、接口、多态
* abstract:	抽象类可以包含私有非静态非final成员变量、抽象方法、非抽象方法，抽象类在设计上强调的是is-a关系。只支持单重继承。
* inteface:	接口只能定义static final成员变量以及抽象方法，接口在设计上强调的是like-a关系.支持多重实现。接口本质上是抽象类的特殊化。
* 抽象类是对类抽象，而接口是对行为的抽象。抽象类是对整个类整体进行抽象，包括属性、行为，但是接口却是对类局部（行为）进行抽象。
* 抽象类所跨域的是具有相似特点的类，而接口却可以跨域不同的类。

### 008.ConcreteClass
* 抽象类示例

### 009.Implement
* 接口示例

### 010.DataArray
* java数组
* 概念、声明以及初始化(new方式初始化-运行时初始化或者声明就初始化、直接静态初始化)
* ArrayList:	动态扩展

### 011.CommonAPI
* java常用API
* String:		final修饰的类，不可变(每次修改都需要创建临时的string对象)
* StringBuffer:	final修饰的类，但是可以变(修改StringBuffer不会创建新对象)
* StringBuilder:	和StringBuffer一样，但是StringBuilder是线程非安全的，StringBuffer线程安全
* System:		操作系统相关类，同时包括输入输出错误流
* Runtime:		JVM运行时属性方法
* Calendar:		日历操作类
* Date:			日期操作类
* DateFormate:	日期格式化工具
* Math/Random:	java数学计算

### 012.IOSyetem
* java IO操作
* File:		文件、目录操作抽象(信息获取、判断、创建删除等操作)
* IO结构:		输入输出流(输入输出相对于应用程序来说,应用程序写文件输出，应用程序读文件输入流)
* 分类:		字节流(InputStream/OutStream)、字符流(Reader/Writer)、flush从缓冲区到流
* InputStream/OutStream-FileInputStream/ObjectInputStream/BufferInputStream
* Reader/Writer-BufferReader/InputStreamReader-FileReader
* 字节流、字符流二者之间的桥梁是OutputStreamWriter、InputStreamReader
* 序列化:		实现Serializable接口，类对象也需要实现，Externalizable也可以实现序列化:有具体的方法
* 1.Serializable实现序列化不需要程序员手动的参与序列化的过程.JVM已经为我们实现了整个序列化的过程
* 2.Externalizable是Serializable的子类,需要程序员手动的参与序列化的过程,同时可以提供额外的数据的序列化.
* 3.Serializable序列化简单一些，但是要消耗性能,Externalizable比Serializable要高一些.
* 4.如果不需要过多的知道序列化的过程那么我们还是选者Serializable不容易出错,Externalizable比较容易出错.

### 013.ExceptionSys
* java异常处理
* Throwable:是java异常机制的超类,Exception和error是:throwable的子,Error:是程序无法解决问题. 内存溢出了,突然断电
* Exception:我们可以通过程序控制的异常.
* 不管return是否返回Finalily肯定是要被执行的.
* Throws：声明一个异常:这里可能要抛出异常了,Throw:才是真正的抛出一个异常的对象
* finally不一定是最后执行的代码，如果try/catch有return语句，finally还会回到return语句做为结束点
* 但是不管是否有return，finally肯定是会被执行的
* enum exception可以结合使用提供比较完美的国际化解决方案

### 014.JavaThread
* Java线程
* 进程与线程:	进程运行中的程序，线程运行中的代码片段
* 线程创建:	基础Thread类-重写run方法，实现Runnable接口-重写run方法，前者不利于扩展，也不利于数据共享
* 后台线程:	后台线程如果不join，立即停止。有join，都一样。
* 线程安全:	synchronized修饰代码块、修饰方法
* 线程通信:	notify/notifyall/wait，同样是对象方法
* 线程问题:	线程死锁、线程饥饿
* 线程停止:	比较复杂的问题，一种是通过run方法停止，一种是同座interrupt实现
* 经典生产者消费者模式实现方法，方法一：公共资源：put、get加锁，等待与唤醒其他线程
* 方法二：使用java阻塞队列LinkedBlockingQueue，阻塞队列内部已经实现了公共资源加锁机制，外部线程可直接使用get、put
* 方法三：使用可重入锁以及await、signal方式

### 015.JavaContainer
* Java容器
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

### 016.JavaGeneric
* Java泛型
* 好处：代码复用、编译期间安全检查、不需要强制类型转化
* 注意：必须是引用类型、泛型通配符？ ？extends A——A以及A的子类构成的集合，不能添加元素
* ？super A——A以及A的父类的列表
* 带有super超类型限定的通配符可以向泛型对易用写入，带有extends子类型限定的通配符可以向泛型对象读取

### 017.JavaReflect
* Java反射
* java vm启动时加载class文件，java对class字节码文件的描述也有专用的类Class
* 通过Class可以动态的获取类的信息，这叫做反射
* 三种方式获取Class对象：通过类名、通过类名字符串、通过类对象
* 获取Class对象之后就可以获取很多此类相关的信息如构造函数、方法、属性等、可以得到构造函数创建实例、可以执行方法

