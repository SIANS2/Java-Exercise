package day09;
//���ﰢ�� : (����*����)/2
//Shape �߻�Ŭ������ ��ӹ޾Ƽ� ���� ���� �޼��� ������ �ϱ�
public class Triangle extends Shape {
	
	@Override
	public void area(int x, int y) {
		int q=(x*y)/2;
		System.out.println("���ﰢ�� ����: "+q);
	}
}
