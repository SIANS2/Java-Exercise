package day07;

public class MyTest {

	public static void main(String[] args) {
		//MyDemo클래스의 변수 x,y값을 출력하세요
		System.out.println("MyDemo.y: "+MyDemo.y);
		MyDemo md=new MyDemo();
		System.out.println("md.x: "+md.x);
		
		//MyDemo의 foo(), bar() 메소드 출력하기
		MyDemo.foo();
		md.bar();
		
		String s= MyDemo.snail();
		System.out.println("md.snail: "+md.snail());
		
		String st= md.star(3);
		System.out.println("md.star: "+st);
		System.out.println("md.star: "+md.star(4));
		
		
	}

}
