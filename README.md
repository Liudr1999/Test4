# Test4-interface
计G202 2020322114 刘冬蕊

# 一、实验目的
1、掌握Java中抽象类和抽象方法的定义；   
2、掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；  
3、了解异常的使用方法，并在程序中根据输入情况做异常处理。  

# 二、实验要求
1、在博士研究生类中实现各个接口定义的抽象方法;  
2、对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3、国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4、实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5、根据输入情况，要在程序中做异常处理。  

# 三、实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1、设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2、设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3、编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。  

# 四、流程图
![Image text](https://github.com/Liudr1999/Test4-interface/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.JPG)

# 五、实验过程
1、阅读实验要求，明确编写内容；  
2、根据实验的要求，完成代码；  
3、检查不合理的地方，并完善代码；    
4、运行代码，实验结束。

# 六、核心代码
1、定义接口
```
interface StudentInterface{				
	abstract void setPay(int pay);		
	abstract int getPay();
}
```
定义了学生接口，并在方法体中声明缴费和查询的抽象类方法。（教师接口类同）  


2、继承接口
```
public class Doctorate implements StudentInterface,TeacherInterface
```
定义了一个研究生类，并继承StudentInterface接口和TeacherInterface接口。  


3、while循环
```
while(salary<=0){		
	System.out.println("工资不能为0，请重新输入：");
	salary = reader.nextInt();
}
```
当输入的salary（工资）<=0时，将会跳出“工资不能为0，请重新输入：”的语句，直到salary>0时程序继续进行。  


4、在Test主类中声明接口变量
```
     		 StudentInterface student;				
		 TeacherInterface teacher;	
```  


5、接口变量中存放对象的引用
```
     student = new Doctorate();
     teacher = new Doctorate();
```


6、Scanner类
```
      Scanner reader = new Scanner(System.in);
      ……
      reader.close();
```
利用Scanner类，实现交互式输入。  


7、实现输入
```
       g.pay= reader.nextInt();					//输入学费
       student.setPay(g.pay);	          			//接口回调
```
令Doctorate的实例化对象g中的变量pay实现输入，并让Student接口变量中的setPay方法回调。  


8、定义变量
```
       int yearS = teacher.getSalary()*12;		//年收入=月收入*12个月
       int pain =yearS-student.getPay();		//实际年收入=年收入-学费
       final double tax =(pain-5000*12)*0.1;		//应缴个人所得税
```
字Test主类中定义了三个变量分别代表年收入、实际年收入和应缴的个人所得税。根据国家规定，年收入在36000~144000之间的收入对应10%的税率。  


9、判断
```
	 if(pain<=5000*12)
		System.out.println("由于您的实际年收入("+pain+")小于等于6万元, 所以不够缴纳所得税。"+"\n");    
	 else     
		System.out.println("您的实际年收入为"+pain+"元, 需纳税："+tax+"元"+"\n");
```
同样根据国家规定，每月的起征点是5000元，按年算就是6万元一年，故有此判断出现。  


10、异常处理
```
try{
    //主函数里所有的代码
}
catch(Exception e){
    System.out.println("请检查您输入的是否有误！");
}
```
当try中的语句出现异常时，会显示"请检查您输入的是否有误！"。  

# 七、实验结果
1、当学费为0时，输入的结果  
![Image text](https://github.com/Liudr1999/Test4-interface/blob/main/%E5%AD%A6%E7%94%9F%E4%B8%80.JPG)  

2、正常输入  
![Image text](https://github.com/Liudr1999/Test4-interface/blob/main/%E5%AD%A6%E7%94%9F%E4%BA%8C.JPG)

3、异常处理  
![Image text](https://github.com/Liudr1999/Test4-interface/blob/main/%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86.JPG)


# 八、实验感想
经过上两次的实验，执着直接输出结果的我，本次实验尝试了交互式输入，并为完善加了不少以前学过的内容。比如if else选择语句  
、while循环语句等等。在实现交互式输入时，参考了书上的例子，当出现错误时，便上网寻求解答，最终找到了解决的办法。根据实  
验要求，一开始我没有实现异常处理，而是用学过的if else语句进行实现，然后经过查资料、问同学，终找到了实现的方法。用事实  
验证，想要真正的学会编程，需要自己不断地编写代码，在错误中不断完善代码，让它变得丰富多彩。


