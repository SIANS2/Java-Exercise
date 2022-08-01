package day06;

public class Student {
	int num;
	String name;
	String department;
	
	public void showInfo2() {
		System.out.println("-----Student정보-----");
		System.out.println("학번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+department);
	}
	public String existAt(int inform) {
		String str=name+"학생의 학번은 "+num+", 학과는"+department+"입니다.";
		return str;
	}
	
	public void study(String type, int time) {
		switch(type) {
		case "전공필수":
			System.out.println("전공필수: "+time+"시간");
			break;
		default:
			System.out.println("교양필수: "+time+"시간");
		}
	}
}
