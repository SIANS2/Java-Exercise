package day11;

public class InnerClassTest {

	public static void main(String[]args) {
				//1) OuterŬ������ a,b�������� ����ϼ���
				Outer o1 = new Outer();
				System.out.println("o1.a : "+o1.a);
				System.out.println("Outer.b : "+Outer.b);
				
				//2) InnerŬ������ c������ ����ϰ�
				//			sub()�޼ҵ� ȣ���ϱ�
				Outer o2 = new Outer();
				Outer.Inner oi = o2.new Inner();
				System.out.println("oi.c : "+oi.c);
				oi.sub();
				
				Outer.Inner oi2=new Outer().new Inner();
				
				//3) SInnerŬ������ d, e ���
				//			foo(), bar()ȣ���ϱ�
				Outer.SInner os = new Outer.SInner();
				System.out.println("os.d : "+os.d);
				os.foo();
				
				System.out.println("Outer.SInner.e : "+Outer.SInner.e);
				Outer.SInner.bar();
				

	}
	
}
