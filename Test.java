package intertest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)   {   
		 
		//�����ӿڱ���
		 StudentInterface student;				
		 TeacherInterface teacher;				
		 
		 //����ʵ����
		 Doctorate g = new Doctorate();
		 
		 //�ӿڱ����д�Ŷ��������
		 student = new Doctorate();
		 teacher = new Doctorate();
		 		 
		 //��Scanner��ʵ������
		 Scanner reader = new Scanner(System.in);
		 
		 //�쳣����
		 try {
			 g.setName("zhangsan");
			 g.setSex("��");
			 g.setAge(26);
			 System.out.println("-------------------------ѧ��1-------------------------");
			 System.out.println("������"+g.getName()+"  �Ա�"+g.getSex()+ "  ���䣺"+g.getAge());
			 System.out.println("�轻ѧ�ѣ�Ԫ����");
			 g.pay= reader.nextInt();					//����ѧ��
			 student.setPay(g.pay);						//�ӿڻص�
			 System.out.println("ÿ�¹��ʣ�Ԫ����");
			 g.salary = reader.nextInt();
			 teacher.setSalary(g.salary);	

			 int yearS = teacher.getSalary()*12;		//������=������*12����
			 int pain =yearS-student.getPay();			//ʵ��������=������-ѧ��
			 final double tax =(pain-5000*12)*0.1;		//Ӧ�ɸ�������˰
			 
			 System.out.println("\n"+"----------------------------��Ϣ��ѯ----------------------------");
			 System.out.println("������"+g.getName()+" �Ա�"+g.getSex()+ " ���䣺"+g.getAge()+ " ����ѧ�ѣ�"+student.getPay()+" �����룺"+teacher.getSalary()+" �����룺"+yearS);
			 	 
			 if(pain<=5000*12)
				 System.out.println("��������ʵ��������("+pain+")С�ڵ���6��Ԫ, ���Բ�����������˰��"+"\n");    
			 else     
				 System.out.println("����ʵ��������Ϊ"+pain+"Ԫ, ����˰��"+tax+"Ԫ"+"\n");
			 
			 g.setName("Susan");
			 g.setSex("Ů");
			 g.setAge(28);
			 System.out.println("-------------------------ѧ��2-------------------------");
			 System.out.println("������"+g.getName()+"  �Ա�"+g.getSex()+ "  ���䣺"+g.getAge());
			 System.out.println("�轻ѧ�ѣ�Ԫ����");
			 g.pay = reader.nextInt();
		 	 System.out.println("ÿ�¹��ʣ�Ԫ����");
			 g.salary = reader.nextInt();
			 teacher.setSalary(g.salary);	
			 
			 int year = teacher.getSalary()*12;		//������
			 int pains =year-student.getPay();			//��������˰
			 final double taxs =(pains-5000*12)*0.1;

			 System.out.println("\n"+"-------------------------��Ϣ��ѯ-------------------------");
			 System.out.println("������"+g.getName()+" �Ա�"+g.getSex()+ " ���䣺"+g.getAge()+ " ����ѧ�ѣ�"+student.getPay()+" �����룺"+teacher.getSalary()+" �����룺"+year);
			 
			 if(pains<=5000*12)
				 System.out.println("��������ʵ��������("+pains+")С�ڵ���6��Ԫ,���Բ�����������˰��"+"\n");    
			 else     
				 System.out.println("����ʵ��������Ϊ"+pains+"Ԫ, ����˰��"+taxs+"Ԫ"+"\n");
		 }
		 catch(Exception e) {
			 System.out.println("������������Ƿ�����");
			 reader.close();
		 }
	}
		 
}
