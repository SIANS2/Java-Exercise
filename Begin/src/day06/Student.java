package day06;

public class Student {
	int num;
	String name;
	String department;
	
	public void showInfo2() {
		System.out.println("-----Student����-----");
		System.out.println("�й� : "+num);
		System.out.println("�̸� : "+name);
		System.out.println("�а� : "+department);
	}
	public String existAt(int inform) {
		String str=name+"�л��� �й��� "+num+", �а���"+department+"�Դϴ�.";
		return str;
	}
	
	public void study(String type, int time) {
		switch(type) {
		case "�����ʼ�":
			System.out.println("�����ʼ�: "+time+"�ð�");
			break;
		default:
			System.out.println("�����ʼ�: "+time+"�ð�");
		}
	}
}
