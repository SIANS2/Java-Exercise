package day07;

public class Aquaman {
	String name;
	int height;
	double speed;//속도
	
	public Aquaman() { 
		this("아쿠아 맨", 187, 172.54);		
		/*name="아쿠아 맨";
		height=187;
		speed=172.54;*/

	}
	/*
	public Aquaman(String name) {
		this.name=name;
		height=187;
		speed=170;}/*/
	
	
	public Aquaman(String n,int h,double s) {
		name=n;
		height=h;
		speed=s;
	}
	
	
	
	/*생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공해준다.
	 * 한개라도 생성자를 구성하게 괴면, 제공되던 디폴트 생성자는 사라진다.
	 *가능 하면 기본생성자를 구성한 뒤에 다른 생성자를 구성하는 습관을 들이자.
	 * */
	public String getInfo() {
		System.out.println("-----AQUA MAN-----");
		String info="이름: "+name+"\n키: "+height+"\n스피드: "+speed+" km/h";
		return info;
	}
}
