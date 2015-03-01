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
