package day03;
import java.util.*;
public class IfTest4 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("0~9. ���ĺ�, ��Ÿ ���ڸ� 1�ڸ� �Է��ϼ��� =>");
		
		String input=sc.next();
		//next()�� ���ڿ��� �Է¹���
		System.out.println("input: "+input);
		//String Ŭ������ ���� �޼ҵ�:
		/*
		 * char charAt(int undex): ���ڿ��� Ư¡ index��ġ�� ���ڸ� �����Ͽ� ��ȯ�Ѵ�.
		 * 
		 * "Hello"
		 * 	01234 (���� �ϳ��ϳ� ���ڰ� �پ�����. �̰��� �ε��� ��ȣ)
		 * */
		char ch=input.charAt(0);//ù ���ڸ� ����
		System.out.println("ch: "+ch);
		/*ch���� 0 ~ 9 ���̸� "�����Դϴ�"�� ���
		 * ���ĺ� �빮�� �Ǵ� �ҹ����̸� "���ĺ��̱���"���
		 * �� ���� ���ڴ� "��Ÿ ���� �Դϴ�"���
		 */
		//�������� Ctrl+Shift+/ : �ּ�ó��
		//if(ch >= 48 && ch <= 57) {
			//System.out.println("�����Դϴ�");
		//}
		//else if((ch >= 65 && ch <= 90)||(ch>=97 && ch<=122)) {
			//System.out.println("���ĺ��̱���");
		//}
		//else {
			//System.out.println("��Ÿ �����Դϴ�");
		//}
		
		if(ch>='0'&& ch<='9') {
			System.out.println("����");
		} else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println("���ĺ�");
		} else {
			System.out.println("��Ÿ ����");
		}
		
		
		
		
	}

}
