package day03;
import java.util.*;
public class PracticeTest {
	
	
	public static void main(String[]args)
	{
		System.out.println("=====�������� 1-1=====");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a>10 & 20>a) {
			System.out.println("true");	
		}
		
		System.out.println("=====�������� 1-2======");
		char ch ='a';
		if (!(ch==' ')||(ch=='\t'))
		{
			System.out.println("���鵵 �ƴϰ� �ǵ� �ƴ�");
		}
		
		if(ch!=' '&&ch!='\t') {
			System.out.println("���鵵 �ƴϰ� �ǵ� �ƴ�");	
		}
		
		System.out.println("=====�������� 1-3=========");
		char ch2 ='X';
		if(ch2=='x'||ch2=='X') {
			System.out.println("Bye Bye~~~");	
		}
	System.out.println("======�������� 1-4========");
		
		if(ch>='0'&& ch<='9') {
			System.out.println("����");
		} else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println("���ĺ�");
		} else {
			System.out.println("��Ÿ ����");
		}
		System.out.println("======�������� 1-5========");
		
		
		System.out.println("======�������� 1-6========");
		int year=2020;
		if(year%400==0||(year%4==0 && year%100!=0)) {
			System.out.println(year+"���� ���� �Դϴ�.");
		}
		System.out.println("======�������� 1-7========");
		boolean poweron=false;
		if(poweron==false) {
			System.out.println("poweron�� false");
		}
		if(!poweron)
			System.out.println("poweron�� false");
		System.out.println("======�ڿ������� 1-8��======");
		//== : ������������ �ּҰ��� ���Ѵ�. �⺻�ڷ��������� ���� ��
		//String str="yes";
		String str=new String("yes");
		//���ڿ��� ���밪�� ���ϴ� �޼ҵ�:
		//boolean equal(object o) : ���ڿ��� ������ ������ true�� ��ȯ�Ѵ�.
		if(str.equals("yes")) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
	}

}
