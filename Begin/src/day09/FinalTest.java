package day09;
class Super {
	
	void foo() {
		System.out.println("Super's foo()");
	}
}//////////////////////
//final + class :�ٸ� Ŭ�������� ��� ���� ���ϵ���
class Sub extends Super{
	@Override
	protected void foo() {
		System.out.println("Sub's foo()");
	}
}/////////////////////
//final�� Sub�� ��ӹ��� ����
//ex) java.lang.StringŬ���� =>finalŬ����
public class FinalTest//extends Sub {
{
	public static void main(String[] args) {

	}

}
