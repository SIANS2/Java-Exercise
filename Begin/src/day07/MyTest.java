package day07;

public class MyTest {

	public static void main(String[] args) {
		//MyDemoŬ������ ���� x,y���� ����ϼ���
		System.out.println("MyDemo.y: "+MyDemo.y);
		MyDemo md=new MyDemo();
		System.out.println("md.x: "+md.x);
		
		//MyDemo�� foo(), bar() �޼ҵ� ����ϱ�
		MyDemo.foo();
		md.bar();
		
		String s= MyDemo.snail();
		System.out.println("md.snail: "+md.snail());
		
		String st= md.star(3);
		System.out.println("md.star: "+st);
		System.out.println("md.star: "+md.star(4));
		
		
	}

}
