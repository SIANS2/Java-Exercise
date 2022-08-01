package day07;

public class MyDemo {
	int x=50;
	static int y=70;
	
	/*public MyDemo() { 
		this(50,70);
	}
	public MyDemo(int a,int b) {
		x=a;
		y=b;
	}
	public String yoInfo() {
		System.out.println("-----MY DEMO-----");
		String info="x: "+x+"\ny: "+y;
		return info;
	}*/
	
	public static void foo() {
		System.out.println("foo()...");
	}
	public static void bar() {
		System.out.println("bar()...");
	}
	public String star(int n) {
		String a="";
		for(int i=0;i<n;i++) {
			a+="¡Ú";
		}
		return a;
	}//--------------------------
	
	public static String snail() {
		return "@@@@";
	}
}
