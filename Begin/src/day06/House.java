package day06;

public class House {
	int room;
	String addr;
	String owner;
	
	public void showInfo() {
		System.out.println("-----House����-----");
		System.out.println("������ : "+owner);
		System.out.println("�� �� : "+room);
		System.out.println("�ּ� : "+addr);
	}
	public String existAt(int bunji) {
		String str=owner+"�� ���� "+addr+" "+bunji+"������ ��ġ�մϴ�.";
		return str;
	}
//� ����(����, ����, �Ÿ�)���� �󸶿� ���� ���ƿ� (�Ÿ��ؿ�) => �޼ҵ带 ��������
	public void rent(String type, int money) {
		switch(type) {
		case "�Ÿ�":
			System.out.println("�ŸŰ�: "+money+"����");
			break;
		default:
			System.out.println("�Ӵ밡: "+money+"����");
			
		}
	}
}
