package day09;
interface Inter1{
	void a();
}/////////

interface Inter2{
	String b();
}//////////////////////
abstract class AbsClass{
	abstract void c();
}////////////////////////////
//�������̽��� �������̽��� ��ӹ��� ���� extends�� ��ӹް�, ���� ��ӵ� �����ϴ�
interface HisInter extends Inter1, Inter2{
	String STR="Hello";
}/////////////////////////////////////////
//[1] MyClass2�� AbsClass�� HisInter�� ��ӹ޵��� �ϼ���
//	  ���� ���� ó���ϼ���

public class MyClass2 extends AbsClass implements HisInter {
	
	void c() {
		System.out.println("c()@@@");
	}
	public void a() {
		System.out.println("a()###");
	}
	public String b() {
		return "b()$$$$";
	}

	public static void main(String[] args) {
		//[2] MyClass2Ÿ���� ��ü �����ؼ� �޼��� ���� ȣ���ϰ� STR���� ����غ���
		MyClass2 mc=new MyClass2();
		mc.c();
		mc.a();
		System.out.println(mc.b());
		System.out.println("-------------------");
		
		//[3] HisInterŸ���� ���� �����ϰ� MyClass2��ü �����ؼ�  �޼��� ���� ȣ���ϰ� STR���� ����غ���
		HisInter hi=new MyClass2();
		hi.a();
		System.out.println(hi.b());
		System.out.println(HisInter.STR);
		System.out.println(MyClass2.STR);
		System.out.println("-------------------");
		//hi.c();[x]
		//[4] AbsClassŸ���� ���� �����ϰ� MyClass2��ü �����ؼ�  �޼��� ���� ȣ���ϰ� STR���� ����غ���
		AbsClass ac =new MyClass2();
		ac.c();
		((MyClass2)ac).a();//
		//ac.b();//[x]

	}
	
	
}


