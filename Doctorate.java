package intertest;

import java.util.Scanner;

interface StudentInterface{				//ѧ���ӿڣ��ɷѺͲ�ѵĳ����෽��
	abstract void setPay(int pay);		
	abstract int getPay();
}
interface TeacherInterface{				//��ʦ�ӿڣ������ʺͲ鹤�ʵĳ��󷽷�
	abstract void setSalary(int salary);
	abstract int getSalary();
}

public class Doctorate implements StudentInterface,TeacherInterface {
	String name;	//����
	String sex;		//�Ա�
	int age;		//����
	int pay;		//ѧ��
	int salary;		//����
	int i;
	String a;
	
	Scanner reader = new Scanner(System.in);
	
	//���幤�ʵķ���
	public void setSalary(int salary) {
		while(salary<=0){		
			System.out.println("���ʲ���Ϊ0�����������룺");
			salary = reader.nextInt();
		}
		this.salary=salary;
}
	public int getSalary(){
		return salary;
	}
	
	//����ѧ�ѵķ���
	public void setPay(int pay) {
		while(pay<=0){
			System.out.println("ѧ�Ѳ���Ϊ0�����������룺");
			pay= reader.nextInt();
		}
		this.pay=pay;	
	}
	public int getPay(){
		return pay;
	}
	
	//���������ķ���
	public void setName(String n) {
		this.name=n;
	}
	public String getName() {
		return name;
	}
	
	//�����Ա�ķ���
	public void setSex(String s) {
		this.sex=s;
	}
	public String getSex() {
		return sex;
	}
		
	//��������ķ���
	public void setAge(int a) {
		this.age=a;
	}
	public int getAge() {
		return age;
	}
	
}


