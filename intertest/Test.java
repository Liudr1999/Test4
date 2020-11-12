package intertest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)   {   
		 
		//声明接口变量
		 StudentInterface student;				
		 TeacherInterface teacher;				
		 
		 //对象实例化
		 Doctorate g = new Doctorate();
		 
		 //接口变量中存放对象的引用
		 student = new Doctorate();
		 teacher = new Doctorate();
		 		 
		 //用Scanner类实现输入
		 Scanner reader = new Scanner(System.in);
		 
		 //异常处理
		 try {
			 g.setName("zhangsan");
			 g.setSex("男");
			 g.setAge(26);
			 System.out.println("-------------------------学生1-------------------------");
			 System.out.println("姓名："+g.getName()+"  性别："+g.getSex()+ "  年龄："+g.getAge());
			 System.out.println("需交学费（元）：");
			 g.pay= reader.nextInt();					//输入学费
			 student.setPay(g.pay);						//接口回调
			 System.out.println("每月工资（元）：");
			 g.salary = reader.nextInt();
			 teacher.setSalary(g.salary);	

			 int yearS = teacher.getSalary()*12;		//年收入=月收入*12个月
			 int pain =yearS-student.getPay();			//实际年收入=年收入-学费
			 final double tax =(pain-5000*12)*0.1;		//应缴个人所得税
			 
			 System.out.println("\n"+"----------------------------信息查询----------------------------");
			 System.out.println("姓名："+g.getName()+" 性别："+g.getSex()+ " 年龄："+g.getAge()+ " 所交学费："+student.getPay()+" 月收入："+teacher.getSalary()+" 年收入："+yearS);
			 	 
			 if(pain<=5000*12)
				 System.out.println("由于您的实际年收入("+pain+")小于等于6万元, 所以不够缴纳所得税。"+"\n");    
			 else     
				 System.out.println("您的实际年收入为"+pain+"元, 需纳税："+tax+"元"+"\n");
			 
			 g.setName("Susan");
			 g.setSex("女");
			 g.setAge(28);
			 System.out.println("-------------------------学生2-------------------------");
			 System.out.println("姓名："+g.getName()+"  性别："+g.getSex()+ "  年龄："+g.getAge());
			 System.out.println("需交学费（元）：");
			 g.pay = reader.nextInt();
		 	 System.out.println("每月工资（元）：");
			 g.salary = reader.nextInt();
			 teacher.setSalary(g.salary);	
			 
			 int year = teacher.getSalary()*12;		//年收入
			 int pains =year-student.getPay();			//个人所得税
			 final double taxs =(pains-5000*12)*0.1;

			 System.out.println("\n"+"-------------------------信息查询-------------------------");
			 System.out.println("姓名："+g.getName()+" 性别："+g.getSex()+ " 年龄："+g.getAge()+ " 所交学费："+student.getPay()+" 月收入："+teacher.getSalary()+" 年收入："+year);
			 
			 if(pains<=5000*12)
				 System.out.println("由于您的实际年收入("+pains+")小于等于6万元,所以不够缴纳所得税。"+"\n");    
			 else     
				 System.out.println("您的实际年收入为"+pains+"元, 需纳税："+taxs+"元"+"\n");
		 }
		 catch(Exception e) {
			 System.out.println("请检查您输入的是否有误！");
			 reader.close();
		 }
	}
		 
}
