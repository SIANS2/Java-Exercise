package multicampus;
import java.util.*;
/**�л���� ���α׷����� ����ϴ� �л� Ŭ����*/
public class Student {
	int no;
	String name;
	String major;
	String phone;
	
	/**�л� ������ ����ϴ� �޼ҵ�*/
	public void showInfo() {
		System.out.println("�й�: "+no);
		System.out.println("�̸�: "+name);
		System.out.println("����: "+major);
		System.out.println("����ó: "+phone);
	}
	
	/**�л������� �Է¹޴� �޼ҵ�*/
	public void inputIfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�й� �Է�=>");
		no=sc.nextInt();
		
		System.out.println("�̸� �Է�=>");
		name=sc.next();
		
		System.out.println("���� �Է�=>");
		major=sc.next();
		
		System.out.println("����ó �Է�=>");
		phone=sc.next();
		
	}
	
	
}/////////////////////////////
