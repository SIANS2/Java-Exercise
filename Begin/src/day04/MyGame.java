package day04;
import java.util.*;
//while for if ����Ͽ� �����.
		//System.out.println("1�� 100������ ���� �Է��ϼ��� :");//random ���
		//System.out.println("�� ū ���� �Է��ϼ���.")
		//System.out.println("�� ���� ���� �Է��ϼ���.")
		//System.out.println("������ϴ�.")
		//System.out.println("�õ� Ƚ���� "++""���Դϴ�.")
public class MyGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		double q =Math.random();
		int comp=(int)(Math.random()*100+1);// 1<= com <101 ������ ������ �������� �߻���Ų��.
		int count=0;//�õ�Ƚ���� �������� ����
		while(true) {
			System.out.println("1�� 100������ ���� �Է��ϼ��� :");
			int input=sc.nextInt();//������ �ϳ� �Է¹ޱ�
			if(input<1|| input > 100) {
				continue;
			}
			count++;
			if(count>7) {
				System.out.println("�õ� Ƚ��(7��) �ʰ� :  ������ȸ��~~~");
				//break;
				return;
			}
			if(comp == input) {
				System.out.println("������ϴ�.");
				break;
			} else if(comp>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(comp<input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
			
		}
		System.out.println("���� �õ� Ƚ���� "+count+"���Դϴ�.");
		
		
		//////////////////////////////////////////////////
		//System.out.println("******Game Menu*******");
		//System.out.println("**********************");
		
	}//main=======

}//class=============
