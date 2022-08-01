package day09;

public class SubCircle extends Circle {
	
	@Override
	public void area(int x, int y)
	{}
	//빈블럭 으로라도 재정의 해야한다.
	
	//오버 로드
	public void area(int r) {
		System.out.println("원의 법칙: "+(Circle.PI*r*r));
	}
}
