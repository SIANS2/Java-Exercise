package day04;
/*
 * ��������
 * while(���ǽ�)
 * {
 * 		���๮;
 * 		������;
 * }
 * ���ǽ��� true�̸� ���๮�� �����Ѵ�.
 * 		false�̸� while���� �����.
 * 
 * */
import java.util.*;

public class WhileTest {
	public static void main(String[] args) {
		int a=1;
		while(a<5) {
			System.out.println("Hello: "+a);
			a++;
		}//while--------
		System.out.println("The End~~~"+a);
		
		int b=10;
		while(b>0) {
			System.out.println("Java : "+b);
				b-=2;
		}
		//[����1] �����ܿ� ���� �Է¹޾Ƽ� �������� ����ϱ�
		System.out.println("������ ����� ����ұ��?");
		Scanner sc=new Scanner(System.in);
		int dan=sc.nextInt();
		int c=1;
		while (10>c) {
			System.out.println(dan+"x"+c+"="+(dan*c));
			c++;
		}
		//[����2] ������ ��ü�� ����ϵ� while���� ��ø�ؼ� ����ϼ���.
	
		int gu=1;
		int gudan=1;
		while (10>gudan) {
			while(10>gu) {
				System.out.print(gu+"x"+gudan+"="+gu*gudan+"	");
				gu++;
			}
			System.out.println();//�ٹٲ�
			gu=1;
			gudan++;
			}
		
		//while(true) {
			//System.out.println("���ѷ��� �Դϴ�.");
		//}
			
			
		
	}//main----------------------

}//class----------------------------------------
