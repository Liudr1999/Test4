package intertest;

import java.util.Scanner;

interface StudentInterface{				//学生接口，缴费和查费的抽象类方法
	abstract void setPay(int pay);		
	abstract int getPay();
}
interface TeacherInterface{				//教师接口，发工资和查工资的抽象方法
	abstract void setSalary(int salary);
	abstract int getSalary();
}

public class Doctorate implements StudentInterface,TeacherInterface {
	String name;	//姓名
	String sex;		//性别
	int age;		//年龄
	int pay;		//学费
	int salary;		//工资
	int i;
	String a;
	
	Scanner reader = new Scanner(System.in);
	
	//定义工资的方法
	public void setSalary(int salary) {
		while(salary<=0){		
			System.out.println("工资不能为0，请重新输入：");
			salary = reader.nextInt();
		}
		this.salary=salary;
}
	public int getSalary(){
		return salary;
	}
	
	//定义学费的方法
	public void setPay(int pay) {
		while(pay<=0){
			System.out.println("学费不能为0，请重新输入：");
			pay= reader.nextInt();
		}
		this.pay=pay;	
	}
	public int getPay(){
		return pay;
	}
	
	//定义姓名的方法
	public void setName(String n) {
		this.name=n;
	}
	public String getName() {
		return name;
	}
	
	//定义性别的方法
	public void setSex(String s) {
		this.sex=s;
	}
	public String getSex() {
		return sex;
	}
		
	//定义年龄的方法
	public void setAge(int a) {
		this.age=a;
	}
	public int getAge() {
		return age;
	}
	
}


