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
		System.out.println("****직원 정보****");
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("소속부서: "+dept);
	}
}

