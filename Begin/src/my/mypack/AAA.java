package my.mypack;
//��Ű�� ���� : ���� ù �������� ����ؾ� �Ѵ�.
//��Ű�� ��� ���丮 ���� ��ҹ��ڱ��� ���ƾ� �Ѵ�.
public class AAA {//publicŬ���� : ��𼭵� ���� ���� �� ������
	
	public static void main (String[]args) {
		BBB b=new BBB();
		b.funcB();
	
		AAA a=new AAA();
		a.funkA();
	}
	
	public void funkA() {
		System.out.println("AAA");
	}
	
}///////

class BBB{//������ ������
	
	public void funcB() {
		System.out.println("BBB");
	}
}///////

