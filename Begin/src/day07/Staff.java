package day07;

public class Staff {

	private int no;
	private String name;
	private String dept;
	
	public void setNo(int no) {
		this.no=no;
		
	}
	public void setName(String name) {
		this.name=name;
	}

	public void setDept(String d) {
		dept=d;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	
	public void showInfo() {
		System.out.println("****���� ����****");
		System.out.println("���: "+no);
		System.out.println("�̸�: "+name);
		System.out.println("�ҼӺμ�: "+dept);
	}
}

