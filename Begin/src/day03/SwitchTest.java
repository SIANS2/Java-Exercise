package day03;
/* Swutch ~ case �� :
 * 
 * switch() ��ȣ�ȿ� ���� ��, ����, ���� --> int������ �ڷ���(byte,short,char,int) �Ǵ� string �� ��밡�� �ϴ�. long, float, double(x)
 * 
 * switch(��|����|����){
 *		case ��1:
 *			���๮;
 *			break;
 *		case ��2:
 *			���๮;
 *			break;
 *		...
 *		default:
 *			���๮; 
 * }
 * 
 * */
import java.util.*;
public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����ڸ� �Է��ϼ���[+,-,*,/]=>");
		String operation =sc.next();
		//char oper ='+';
		
		char oper=operation.charAt(0);
		System.out.println("����1 �Է�=>");
		int a=sc.nextInt();
		
		System.out.println("����2 �Է�=>");
		int b=sc.nextInt();
		
		int result=0;
		switch(oper) {
		case'+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'*':
			result=a*b;
			break;
		case'/':
			result=a/b;
			break;//�Ҽӵ� ��{}�� ��Ż�Ѵ�.(�����.)
		default:
			System.out.println("���� ������ �Դϴ�.");
			return;//������� : �����帧�� �ǵ�����.(return���� ���� �޼ҵ�-main()�� ȣ����������
					//			���ư���.*
		}
		System.out.println(a+operation+b+"="+result);
		//System.out.println("result: "+result);
	}//main()-----------------------------
}////////////////////////////////////////////////////
