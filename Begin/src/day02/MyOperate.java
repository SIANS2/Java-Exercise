package day02;

public class MyOperate {
	
	public static void main(String[]args) {
		System.out.println("1. 산술 연산자----");
		//+, -, *, /(나눈 몫을 구하는 연산자), %(나머지 값을 구하는 연산자)
		int a=10;
		System.out.println(a-6);//4
		System.out.println(a*3);//30
		System.out.println(a/3);//3 int/int ==> 결과는 int
		System.out.println(a%3);//1
		
		double b=10;
		System.out.println(b/3);//double/int ==> 결과는 double
		
		System.out.println("2. shift 연산자 (<<, >>, >>>)----");
		// 42 : 00000000 00000000 00000000 00101010
		System.out.println(42<<3);
		//00000000 00000000 00000001 01010000 => 2^8 + 2^6 +2^4 => 336
		System.out.println(42>>3);
		//00000000 00000000 00000000 00000101 => 2^2 + 1 => 5
		System.out.println(42>>>3);
		//00000000 00000000 00000000 00000101 => 2^2 + 1 => 5
		
		/* 시프트 연산자
		1) << : 왼쪽으로 비트수 만큼 이동
					뒤에 남은 빈칸은 0으로 채운다.
	    2) >> :  오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 부호비트로 채운다.
		3) >>> : 오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 무조건 0으로 채운다.
	*/
		//-43 : 11111111 11111111 11111111 11010101
		System.out.println(-43<<2);
		// 11111111 11111111 11111111 01010100 => 101010100 => -256 + 64 + 16 + 4 = -172
		System.out.println(-43>>2);
		// 11111111 11111111 1111111 11110101 => 10101 => -16 + 4 + 1 = -11
		System.out.println(-43>>>2);
		// 00111111 11111111 1111111 11110101 => 1073741813
		
		System.out.println("3. 비교연산자 : ==, !=, >, <, >=, <=, instanceof");
		int m=60;
		int n=160;
		/* 1) > : 큰가?
		 * 2) >= : 크거나 같은가?
		 * 3) < : 작은가?
		 * 4) <= : 작거나 같은가?
		 * 5) == : 같은가?
		 * 6) != : 다른가?
		 * 7) 참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체인가?
		 * */
		
		System.out.println(m>n);//false
		System.out.println(m>=n);//false
		System.out.println(m<=n);//true
		
		if(m>n) {
			System.out.print("@@@@");
		} 
		else if(m<n) {
			System.out.println("####");
		}
	}
}


