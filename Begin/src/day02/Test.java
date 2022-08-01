package day02;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("--------------");
		
		System.out.println("1"+"2");
		//쌍따옴표 안에 있기 때문에 문자열로 인식. 12		
		System.out.println(true+ "");
		// true는 boolean이 아니라 String문자열로 인식. 쌍다옴표와 합해지기 때문.		
		System.out.println('A' + 'B');
		//char이기 때문에 아스키 코드 A =65, B=66 => 131		
		System.out.println('1'+2);
		//char + int => int : 49 +2 => 51
		System.out.println('1'+'2');
		// 99
		System.out.println('J'+"ava");
		//char+String (문자열하고 합해지면 무조건 문자열로 됨) => String 따라서, Java
		System.out.println(true+" null");
		//boolean + String => String

		
		System.out.println("----------------문제 답----------------");
		System.out.println("[2-6] 정답 = b,c,d,e");//d랑e는 java.lang패키지에있는 클래스 이다.
		System.out.println("[2-7] 정답 = a,d,g");
		System.out.println("[2-8] 정답 = a,d");
		System.out.println("[2-9] 정답 = e");
		System.out.println("[2-11] 정답 = a,b,c,d");
		System.out.println("[2-12] 정답 = a,b,c,e");//public과 static은 위치 바꿔도 됨.
		System.out.println("[2-13] 정답 = c,e,f");
		//기본자료형에는 기본값이 있습니다.
		//byte : 0
		//short : 0
		//int : 0
		//long : 0L
		//float : 0.0f
		//double : 0.0
		//char : '\u0000'
		//boolean = false
		//참조형 = null
		//String = null
	}
}
