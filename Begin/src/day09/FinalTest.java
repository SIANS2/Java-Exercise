package day09;
class Super {
	
	void foo() {
		System.out.println("Super's foo()");
	}
}//////////////////////
//final + class :다른 클래스에서 상속 받지 못하도록
class Sub extends Super{
	@Override
	protected void foo() {
		System.out.println("Sub's foo()");
	}
}/////////////////////
//final인 Sub를 상속받지 못함
//ex) java.lang.String클래스 =>final클래스
public class FinalTest//extends Sub {
{
	public static void main(String[] args) {

	}

}
