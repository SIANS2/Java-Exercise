package day09;

class SuperDemo{
	
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
}//////////////////////
class SubDemo extends SuperDemo{
	//sub()��������¡ �ϱ�
	@Override
	void sub() {
		System.out.println("sub() @@@@");
	}
	//final _ method : �������̵��� �� �� ����.
	//bar()�������̵� �ϱ�
	//@Ovverride
	//final void bar() {
		
	//}
}//////////////////////

public class FinalTest2 {

	public static void main(String[] args) {
		//SuperDemo��
		// sub(),barȣ���غ���

		SuperDemo sd = new SuperDemo();
		sd.sub();
		sd.bar();
		
		//SubDemo�� sub()ȣ���غ���
		SubDemo sb=new SubDemo();
		sb.sub();
		sb.bar();
		}

}
