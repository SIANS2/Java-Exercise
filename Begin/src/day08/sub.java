package day08;
//�ڽ� Ŭ���� : sub class, derived class
public class sub extends Super{
	int b=30;
	int c=40;
	
	@Override //annotation
	public void func() {
		System.out.println("func() @@@@");
	}
	//Overload
	public String func(int a) {
		return "func() : a="+a;
	}
}
