package day07;

public class Student {

	private int no;//<<�������
	private String name;
	private String major;
			
	public void setNo(int no) {//<<��������
		//��������� ���������� �̸��� ������ ��� 
		//���������� �켱���� �ִ�.
		//�̷��� ��������� ���������� �����ϱ� ����
		//������� �տ� this.�� ���δ�.
		//this : �ڱ��ڽ��� ��ü(Instnce)�� ������ �� ����ϴ� Ű����
		this.no=no;
		
	}
	public void setName(String name) {
		this.name=name;
	}

	public void setMajor(String major) {
		this.major=major;
	}
	
	public int getNo() {
		return no;//this.no
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	
	public void showInfo() {
		System.out.println("****�л� ����****");
		System.out.println("�й�: "+no);
		System.out.println("�̸�: "+name);
		System.out.println("����: "+major);
	}
	
}
