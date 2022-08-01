package day04;
import java.util.*;
public class MyGame2 {

	public static void showMenu() {
		System.out.println("******Game Menu*******");
		System.out.println("1.���� 2.���� 3.�� 9.����");
		System.out.println("**********************");
		System.out.println("�Է��ϼ���=> ");
		System.out.println("**********************");
		
	}//------------------------------------
	public static String show(int num) {//1, 2, 3
		String str="";
		switch(num) {
		case 1: str="(����)"; break;
		case 2: str="(����)"; break;
		case 3: str="(��)";break;
		default: str="";
		}
		return str;
	}//------------------------------------
	
	/* [1]
	 * ��� : 1 (����)
	 * ��ǻ��: 2 (����)
	 * ---------------
	 * ����� ������ �Ф�
	 * 
	 * [2] 9�� �Է��ϸ� Bye Bye ~~ ����
	 * 
	 * [3] �޴��� ���� ��ȣ�� �Է��ϸ� "�Է¿���! �޴��� ���� ��ȣ�Դϴ�" 
	 * ����� �Է±�ȸ�� �ٽ� �ش�
	 * */

	public static void main(String[] args) {
		MyGame2.showMenu();
		Scanner sc=new Scanner(System.in);
		for(;;) {
			MyGame2.showMenu();
			int comp=(int)(Math.random()*3+1);
			int my=sc.nextInt();
			if(my==9) {
				System.out.println("Bye~~~Bye~~~ ���� �մϴ�.");
				break;
			}
			if(my<1|3>my) {
				System.out.println("�Է¿���!! �޴��� ���� ��ȣ�Դϴ�.");
				continue;
			}
			String msg="";
			if(comp==my) {
				msg="��屺��!";
			}
			else if((comp==1&&my==2)||(comp==2&&my==3)||(comp==3&&my==1)) {
				msg="����� �̰屺��!";
			}
			else if((comp==1&&my==3)||(comp==2&&my==1)||(comp==1&&my==3)) {
				msg="����� �������";
			}
			System.out.println("���: "+my+MyGame2.show(my));
			System.out.println("���: "+comp+MyGame2.show(comp));
			System.out.println(msg);
			
			
			
		
		
		}
	}
}

