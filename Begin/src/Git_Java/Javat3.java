package Git_Java;


	import java.util.Scanner;

	// ���� �Ѱ��� �Է¹޾� ����, ������ ����
	// switch�� ���
	public class Javat3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("���ڸ� �Է��ϼ��� : ");  // a
			s = scan.next();
			
			char c = s.charAt(0);
			
			switch(c){
			case 'a':
			case 'i':
			case 'o':
			case 'u':
			case 'e':
				System.out.println("�����Դϴ�.");
				break;
			default: 
				System.out.println("�����Դϴ�.");
			}

		}

	}


