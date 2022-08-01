package Git_Java;


	import java.util.Scanner;

	// 문자 한개를 입력받아 자음, 모음을 구분
	// switch문 사용
	public class Javat3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("문자를 입력하세요 : ");  // a
			s = scan.next();
			
			char c = s.charAt(0);
			
			switch(c){
			case 'a':
			case 'i':
			case 'o':
			case 'u':
			case 'e':
				System.out.println("모음입니다.");
				break;
			default: 
				System.out.println("자음입니다.");
			}

		}

	}


