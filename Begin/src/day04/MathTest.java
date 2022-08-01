package day04;

public class MathTest {

	public static void main(String[] args) {
		//java.lang.Math클래스의 멤버변수
		//public static final double PI : 상수 원주율
		System.out.println(Math.PI);
		//static붙은 변수들은 앞에 클래스명을 붙여준다. "클래스명.변수" 식으로 접근 한다.
		
		//메소드 : 기능을 가지고 있다.
		//static메소드(클래스 메소드): 클래스명.메소드명(값)
		//public static double sqrt​(double a) : 매게변수 a의 제곱근을 구해서 반환한다.
		double b=Math.sqrt(64);
		System.out.println("64의 제곱근: "+b);
		
		double num=45.678;
		//num의 올림값, 내림값, 반올림값 을 구하세요.
		
		//public static double ceil​(double a) : a의 올림값을 반환
		double o=Math.ceil(num);
		System.out.println(num+"의 올림값: "+o);
		//public static double floor​(double a) : a의 내림값을 반환
		double n=Math.floor(num);
		System.out.println(num+"의 내림값: "+n);
		//public static int round​(float a) : a의 반올림 값을 int로 반환
		int ban=Math.round((int)num);
		System.out.println(num+"의 반올림값: "+ban);
		
		//public static double random()
		//:0.0<= r < 1.0 사이의 임의 난수를 발생시켜 반환해준다.
		double r3=Math.random();
		System.out.println("r3: "+r3);
		
		//[문제1] 0 <= r4 < 10 사이의 임의의 정수를 발생시켜 출력하세요 => random()활용
		double r4=Math.random();
		int t = (int)(r4*10);
		System.out.println("랜덤 정수1: "+t);
		//[문제2] 5 <= r5 ,15 사이의 임의의 정수를 발생시켜 출력하세요
		double r5=Math.random();
		int i =(int)(t+5);
		System.out.println("랜덤 정수2: "+i);
		//int x = (int)(Math.random() *범위+시작수)
		
		//[문제3] 16<= r6 , 48 사이의 임의의 정수
		double r6=Math.random();
		int k=(int)(Math.random()*32+16);
		System.out.println("랜덤 정수3: "+k);
		
		//[문제4] 알파벳 대문자를 무작위로 추출해서 아래와 같은 형태로 출력되도록 하세요.
		/*		W I P O A
		 * 		T B P W Z
		 * 		C E R Y I
		 * 
		 * */
		double r7=Math.random();
		char Al=(char)(Math.random()*26+65);
		System.out.println("랜덤 알파벳: "+Al);
		//3행 5열
		for(int h=0;h<3;h++) {
			for(int j=0;j<5;j++) {
				char ch=(char)(Math.random()*26+'A');
				System.out.print(ch+"   ");
			}
			System.out.println();//줄바꿈
		}
		
	}

}
