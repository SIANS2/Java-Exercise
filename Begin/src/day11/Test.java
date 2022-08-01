package day11;
import day10.Student;

public class Test {
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.s1.getName());
		//System.out.println(t.s2.getName());
	}

}

class Test2{
	Student s1=new Student(1,"±è¼º½Ç");//¸â¹ö(member)
	
	void sub() {
		Student s2=new Student(2,"ÀÌ¶Ê¶Ê");//Áö¿ª(local)
		System.out.println(s2.getName());
	}
	
}

