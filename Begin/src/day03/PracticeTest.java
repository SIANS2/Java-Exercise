package day03;
import java.util.*;
public class PracticeTest {
	
	
	public static void main(String[]args)
	{
		System.out.println("=====연습문제 1-1=====");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a>10 & 20>a) {
			System.out.println("true");	
		}
		
		System.out.println("=====연습문제 1-2======");
		char ch ='a';
		if (!(ch==' ')||(ch=='\t'))
		{
			System.out.println("공백도 아니고 탭도 아님");
		}
		
		if(ch!=' '&&ch!='\t') {
			System.out.println("공백도 아니고 탭도 아님");	
		}
		
		System.out.println("=====연습문제 1-3=========");
		char ch2 ='X';
		if(ch2=='x'||ch2=='X') {
			System.out.println("Bye Bye~~~");	
		}
	System.out.println("======연습문제 1-4========");
		
		if(ch>='0'&& ch<='9') {
			System.out.println("숫자");
		} else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println("알파벳");
		} else {
			System.out.println("기타 문자");
		}
		System.out.println("======연습문제 1-5========");
		
		
		System.out.println("======연습문제 1-6========");
		int year=2020;
		if(year%400==0||(year%4==0 && year%100!=0)) {
			System.out.println(year+"년은 윤년 입니다.");
		}
		System.out.println("======연습문제 1-7========");
		boolean poweron=false;
		if(poweron==false) {
			System.out.println("poweron은 false");
		}
		if(!poweron)
			System.out.println("poweron은 false");
		System.out.println("======★연습문제 1-8★======");
		//== : 참조형에서는 주소값을 비교한다. 기본자료형에서는 값을 비교
		//String str="yes";
		String str=new String("yes");
		//문자열의 내용값을 비교하는 메소드:
		//boolean equal(object o) : 문자열의 내용이 같으면 true로 변환한다.
		if(str.equals("yes")) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
	}

}
