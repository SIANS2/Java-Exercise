package multicampus;

public class JobHunter {
	String name;
	int age;
	int career;
	
	public JobHunter() { 
		name="강시안";
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
		System.out.println("****지원자 정보****");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"세");
		System.out.println("경력: "+career+"년");
	}
	public static void wish() {
		System.out.println("희망연봉: ");
	}
	public static void advantage() {
		System.out.println("장점: ");
	}

}
