package day04;
import java.util.*;
//while for if 사용하여 만들기.
		//System.out.println("1과 100사이의 값을 입력하세요 :");//random 사용
		//System.out.println("더 큰 수를 입력하세요.")
		//System.out.println("더 작은 수를 입력하세요.")
		//System.out.println("맞췄습니다.")
		//System.out.println("시도 횟수는 "++""번입니다.")
public class MyGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		double q =Math.random();
		int comp=(int)(Math.random()*100+1);// 1<= com <101 사이의 임의의 정수값을 발생시킨다.
		int count=0;//시도횟수를 세기위한 변수
		while(true) {
			System.out.println("1과 100사이의 값을 입력하세요 :");
			int input=sc.nextInt();//정수를 하나 입력받기
			if(input<1|| input > 100) {
				continue;
			}
			count++;
			if(count>7) {
				System.out.println("시도 횟수(7번) 초과 :  다음기회에~~~");
				//break;
				return;
			}
			if(comp == input) {
				System.out.println("맞췄습니다.");
				break;
			} else if(comp>input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(comp<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
		}
		System.out.println("게임 시도 횟수는 "+count+"번입니다.");
		
		
		//////////////////////////////////////////////////
		//System.out.println("******Game Menu*******");
		//System.out.println("**********************");
		
	}//main=======

}//class=============
