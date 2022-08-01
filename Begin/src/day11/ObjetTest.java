package day11;
import java.util.*;
import day10.*;
public class ObjetTest {

	public static void main(String[] args) {
		//java.lang.ObjectŬ���� :  ��� Ŭ������ �θ� �ȴ�.
		Object o1=new Object();
		Object o2=new Object();
		System.out.println("o1: "+o1);
		System.out.println("o1.toString(): "+o1.toString());
		/*toString()�޼���� �ش� ��ü�� ���� ������ ���ڿ��� ��ȯ�Ѵ�.
		 * ������ ���� �ʾҴٸ� "Ŭ���� �̸�@�ؽ��ڵ�� ��ȯ�Ѵ�.��
		 * */
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println("s1: "+s1);
		System.out.println("s1.toString "+s1.toString());
		//StringŬ���������� toString()����������(������) �ϰ� �ִ�.
		
		Date d1=new Date();
		System.out.println(d1);
		
		Student st1=new Student(100,"���л�");
		Student st2=new Student(101,"��ö��");
		Student st3=st2;
		Student st4=new Student(101,"��ö��");
		
		
		System.out.println(st1);
		// == : �⺻�ڷ����� �� ���� ��, �������� ���� �ּҰ��� ���Ѵ�.
		System.out.println("st1==st2 : "+(st1==st2));//false
		System.out.println("st3==st2 : "+(st3==st2));//true
		
		//Object Ŭ������ equals() �޼���: �ּҰ��� ���Ͽ� ������ true��ȯ
		System.out.println("st1.equals(st2): "+st1.equals(st2));
		System.out.println("st3.equals(st2): "+st3.equals(st2));
		//st4,st2 equals() ���غ���
		System.out.println("st4.equals(st2): "+st4.equals(st2));
		
		//StudentŬ�������� equals()�޼��带 �������̵� �ϼ���
		//id���� name ���� ������ true�� ��ȯ �ϵ��� ������ �ϼ���
		System.out.println("---------String Ŭ����----------");
		String a1="Hello";
		String a2="Hello";
		String a3=new String("Hello");
		String a4=new String("Hello");
		// == : �ּҰ���
		//a1==a2 : true

		//a1==a3 : false

		//a3==a4 : false
		
		System.out.println("a1==a2 : "+(a1==a2));
		System.out.println("a1==a2 : "+(a1==a3));
		System.out.println("a3==a4 : "+(a3==a4));
		
		
		
		// equals() : ���ڿ� �񱳳���
		//a1.equals(a2)
		//a1.equals(a3)
		//a3.equals(a4)
		
		System.out.println("a1.equals(a2): "+a1.equals(a2));
		System.out.println("a1.equals(a3): "+a1.equals(a3));
		System.out.println("a3.equals(a4): "+a1.equals(a4));
		

	}
	
}
