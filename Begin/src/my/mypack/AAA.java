package my.mypack;
//패키지 선언문 : 제일 첫 문장으로 기술해야 한다.
//패키지 명과 디렉토리 명은 대소문자까지 같아야 한다.
public class AAA {//public클래스 : 어디서든 접근 가능 한 지정자
	
	public static void main (String[]args) {
		BBB b=new BBB();
		b.funcB();
	
		AAA a=new AAA();
		a.funkA();
	}
	
	public void funkA() {
		System.out.println("AAA");
	}
	
}///////

class BBB{//생략형 지정자
	
	public void funcB() {
		System.out.println("BBB");
	}
}///////

