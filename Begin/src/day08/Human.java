package day08;
//�θ�Ŭ���� : Super class, Base class
public class Human {//���������� extends Object�ϰ� ����(object�� ��� Ŭ������ �ֻ���)
	String name;
	int height;
	
	public Human() {
		this("�ƹ���",155);
	}
	
	public Human(String n, int h) {
		name=n;
		height =h;
	}
	
	public String getInfo() {
		
		return "�̸�: "+name+"\nŰ: "+height;
	}
}
