package day03;
import java.util.*;
/*����2] ***������� ���***************
-�޴� (1 ~ 3), ��뷮 (liter)
   1. ������ (liter�� 50��)
   2. ����� (liter�� 45��)
   3. ������ (liter�� 30��)
   =>�޴� ������ ��뷮�� �Է¹޴´�.
 -��µ� ����
  1) ����� �ڵ�, ��뷮, �Ѽ������
   cf)�����=��뷮 * ���ʹ� ����
      �Ѽ������=���������+����(�����
          5%)
*/

public class SwitchTest3 {
	
	public static void main(String[]args) {
		System.out.println("----------Menu----------");
		System.out.println("1. ������ (liter�� 50��)");
		System.out.println("2. ����� (liter�� 45��)");
		System.out.println("3. ������ (liter�� 30��)");
		System.out.println("------------------------");
		System.out.println("�޴��� �����ϼ��� =>");
		System.out.println("------------------------");
		Scanner sc=new Scanner(System.in);
		
		
		int no=sc.nextInt();//�޴���ȣ
		System.out.println("��뷮�� �Է��ϼ���=>");
		int use=sc.nextInt();
		
		int result=0;
		
		switch(no) {
		case 1:
			result = use*50;
			break;
		case 2:
			result = use*45;
			break;
		case 3:
			result = use*30;
			break;
		default:
				System.out.println("���� Menu �Դϴ�.");
				return;
		}
		System.out.println("------------------------");
		System.out.println("Menu code : "+no);
		System.out.println("�����: "+result+"�� �Դϴ�.");
		System.out.println("�Ѽ������: "+result*1.05+"�� �Դϴ�.");
		System.out.println("------------------------");
	}
}
