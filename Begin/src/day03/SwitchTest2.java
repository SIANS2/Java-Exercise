package day03;
import java.util.*;
/*
 * ��(month)�� �Է��ؼ� �ش� ���� �ϼ�(days)�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 1, 3, 5, 7, 8, 10,12 : 31��
 * 2 : 28��
 * 4, 6, 9, 11 : 30��
 * 
 * switch ~ case������ �̿��ؼ� �����غ�����.
 * */
public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���[1~12]=>");
		int month=sc.nextInt();
		int days=0;//���� ¥�� �ϼ��� �޶���
		
		
		//"1���� 31�� ���� �ֽ��ϴ�."
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			days =31;
			break;
		case 4,6,9,11:
			days =30;
			break;
		case 2:
			days =28;
			break;
			default:
				System.out.println("���� �� �Դϴ�");
				return;
		}
	
		System.out.println(month+"����"+days+"�� ���� �ֽ��ϴ�.");


	}

}
