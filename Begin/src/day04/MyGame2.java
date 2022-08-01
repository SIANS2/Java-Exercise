package day04;
import java.util.*;
public class MyGame2 {

	public static void showMenu() {
		System.out.println("******Game Menu*******");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("**********************");
		System.out.println("입력하세요=> ");
		System.out.println("**********************");
		
	}//------------------------------------
	public static String show(int num) {//1, 2, 3
		String str="";
		switch(num) {
		case 1: str="(가위)"; break;
		case 2: str="(바위)"; break;
		case 3: str="(보)";break;
		default: str="";
		}
		return str;
	}//------------------------------------
	
	/* [1]
	 * 당신 : 1 (가위)
	 * 컴퓨터: 2 (바위)
	 * ---------------
	 * 당신이 졌군요 ㅠㅠ
	 * 
	 * [2] 9를 입력하면 Bye Bye ~~ 종료
	 * 
	 * [3] 메뉴에 없는 번호를 입력하면 "입력오류! 메뉴에 없는 번호입니다" 
	 * 출력후 입력기회를 다시 준다
	 * */

	public static void main(String[] args) {
		MyGame2.showMenu();
		Scanner sc=new Scanner(System.in);
		for(;;) {
			MyGame2.showMenu();
			int comp=(int)(Math.random()*3+1);
			int my=sc.nextInt();
			if(my==9) {
				System.out.println("Bye~~~Bye~~~ 종료 합니다.");
				break;
			}
			if(my<1|3>my) {
				System.out.println("입력오류!! 메뉴에 없는 번호입니다.");
				continue;
			}
			String msg="";
			if(comp==my) {
				msg="비겼군요!";
			}
			else if((comp==1&&my==2)||(comp==2&&my==3)||(comp==3&&my==1)) {
				msg="당신이 이겼군요!";
			}
			else if((comp==1&&my==3)||(comp==2&&my==1)||(comp==1&&my==3)) {
				msg="당신이 졌군요ㅠ";
			}
			System.out.println("당신: "+my+MyGame2.show(my));
			System.out.println("당신: "+comp+MyGame2.show(comp));
			System.out.println(msg);
			
			
			
		
		
		}
	}
}

