package day09;

public class SubCircle extends Circle {
	
	@Override
	public void area(int x, int y)
	{}
	//��� ���ζ� ������ �ؾ��Ѵ�.
	
	//���� �ε�
	public void area(int r) {
		System.out.println("���� ��Ģ: "+(Circle.PI*r*r));
	}
}
