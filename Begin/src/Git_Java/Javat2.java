package Git_Java;
import java.util.*;
public class Javat2 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("��� �ΰ���?");
		int month =sc.nextInt();
		String season="";
		
		switch(month) {
		case 12,1,2:
			season="�ܿ�";;
			break;
		case 3,4,5:
			season="��";
			break;
		case 6,7,8:
			season="����";
			break;
		case 9,10,11:
			season="����";
			break;
		default:
			System.out.println("���� �� �Դϴ�.");
			return;
		}
		System.out.println(month+"���� "+season+"�Դϴ�.");
		
	}
		


}
