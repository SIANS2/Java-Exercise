package day09;
//사각형 클래스
public class Rectangle extends Shape {
	
	@Override
	public void area(int x, int y) {
		int k=x*y;
		System.out.println("사각형 면적: "+k);
	}
}
