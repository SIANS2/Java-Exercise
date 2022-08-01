package day09;
//직삼각형 : (가로*세로)/2
//Shape 추상클래스를 상속받아서 오류 없게 메서드 재정의 하기
public class Triangle extends Shape {
	
	@Override
	public void area(int x, int y) {
		int q=(x*y)/2;
		System.out.println("직삼각형 면적: "+q);
	}
}
