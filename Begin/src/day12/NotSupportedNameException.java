package day12;
//사용자 정의 예외 클래스 만들기
//[1] Exception을 상속 받는다.
//[2] 생성자를 구성해서 생성지안에서 super("예외 메세지")를 호출해서 예외 메세지를 등록한다.
public class NotSupportedNameException extends Exception{

	public NotSupportedNameException() {
		super("NotSupportedNameException");//예외메세지
	}
	
	public NotSupportedNameException(String msg) {
		super(msg);
	}
	
}//////////////////////////////////////////////////

