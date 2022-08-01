package Git_Java;
import java.util.*;
public class Javat2 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("몇월 인가요?");
		int month =sc.nextInt();
		String season="";
		
		switch(month) {
		case 12,1,2:
			season="겨울";;
			break;
		case 3,4,5:
			season="봄";
			break;
		case 6,7,8:
			season="여름";
			break;
		case 9,10,11:
			season="가을";
			break;
		default:
			System.out.println("없는 달 입니다.");
			return;
		}
		System.out.println(month+"월은 "+season+"입니다.");
		
	}
		


}
