package day02;
import java.util.Date;

public class ReferenceType {

	public static void main(String[] args) {
		System.out.println("--참조형(reference type)--------");
		/* [1] 클래스형 : Strring, Date, ...
		 * [2] 인터페이스형 
		 * [3] 배열 : String[], int[]...
		 * : 참조형은 반드시 new 연산자료 객체를 생성해서 사용해야 한다.
		 *	단 예외가 있다. String의 경우 자주 사용되는 유형이므로
		 *	기본자료형 처럼 문자열 값(literal)을 직접 할당할 수 있다.
		 * */
		String s1=new String("Java");
		System.out.println("s1="+s1);
		//java.util패키지
		Date today =new Date();//참조형
		System.out.print("today="+today);
		
		String s2="Hello";
		System.out.println("s2="+s2);
		System.out.println(s2.toUpperCase());//대문자
		System.out.println(s2.toLowerCase());//소문자
		/*기본자료형 : 주로연산에 사용됨
		 * 참조형 : [데이터(변수) + 기능(메소드)] 메소드를 통해 다양하게 가능.
		 * */
		
		int a=20;
		int b=30;
		System.out.println(a+b+"<=합");//숫자열이 먼저 나와서 20+30=50으로 계산한 뒤 문자를 붙임.
		System.out.println("합=>"+a+b);//문자열 연산시 주의 해야함. 20 과 30을 문자로 인식하고 이어붙임.
		System.out.println("합=>"+(a+b));
		
		
	}

}
