package multicampus;

public class JobHunter {
	String name;
	int age;
	int career;
	
	public JobHunter() { 
		name="���þ�";
		age=25;
		career=1;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	public void setAge(int age) {
		this.age=age;
	}

	public void setField(int career) {
		this.career=career;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getCareer() {
		return career;
	}
	
	public JobHunter(String name,int age) {
		this.name=name;
		this.age=age;
		career=1;
	}
	public JobHunter(String name,int age,int career) {
		this.name=name;
		this.age=age;
		this.career=career;
	}
	
	public void jobInfo() {
		System.out.println("****������ ����****");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age+"��");
		System.out.println("���: "+career+"��");
	}
	public static void wish() {
		System.out.println("�������: ");
	}
	public static void advantage() {
		System.out.println("����: ");
	}

}
