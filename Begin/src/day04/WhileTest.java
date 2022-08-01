package day04;
/*
 * 변수선언문
 * while(조건식)
 * {
 * 		실행문;
 * 		증감식;
 * }
 * 조건식이 true이면 실행문을 실행한다.
 * 		false이면 while블럭을 벗어난다.
 * 
 * */
import java.util.*;

public class WhileTest {
	public static void main(String[] args) {
		int a=1;
		while(a<5) {
			System.out.println("Hello: "+a);
			a++;
		}//while--------
		System.out.println("The End~~~"+a);
		
		int b=10;
		while(b>0) {
			System.out.println("Java : "+b);
				b-=2;
		}
		//[문제1] 구구단에 단을 입력받아서 구구단을 출력하기
		System.out.println("구구단 몇단을 출력할까요?");
		Scanner sc=new Scanner(System.in);
		int dan=sc.nextInt();
		int c=1;
		while (10>c) {
			System.out.println(dan+"x"+c+"="+(dan*c));
			c++;
		}
		//[문제2] 구구단 전체를 출력하되 while문을 중첩해서 출력하세요.
	
		int gu=1;
		int gudan=1;
		while (10>gudan) {
			while(10>gu) {
				System.out.print(gu+"x"+gudan+"="+gu*gudan+"	");
				gu++;
			}
			System.out.println();//줄바꿈
			gu=1;
			gudan++;
			}
		
		//while(true) {
			//System.out.println("무한루프 입니다.");
		//}
			
			
		
	}//main----------------------

}//class----------------------------------------
