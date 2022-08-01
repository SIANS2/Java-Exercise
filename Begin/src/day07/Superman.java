package day07;

public class Superman {
	String name;
	int height;
	String power;//초능력
	//기본생성자
	public Superman() { 
		this("슈퍼맨",190,"flying");
		//this() : 자기자신의 생성자를 호출할 때 사용한다.
		//			생성자 안에서만 호풀할 수 있으며,
		//			제일 첫번째 문자이여야 한다.
		/*name="슈퍼맨";
		height=190;
		power="flying";*/
	}
	//인자 생성자 3개 만드세요
	
	public Superman(String name) {
		/*this.name=name;
		height=190;
		power="flying";*/
		this(name,190,"flying");
	}
	
	public Superman(String name,int height) {
		/*this.name=name;
		this.height=height;
		power="flying";*/
		this(name,height,"flying");
	}
	
	//target : 여기서 초기화를 하자
	public Superman(String name,int height,String power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public String getInfo() {
		System.out.println("-----SUPER MAN-----");
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
	}



	
}//class/////////////////////
