package day06;
/*학사관리 프로그램
 *	- 객체 추출
 *	  학생, 교사, 직원 ...
 *	  ==> class 로 구성하기
 *	  학생=> Student
 *	  |
 *	  속성: 학번, 이름, 학급, 연락처 ...
 *	  기능: 정보를 보여주다, 공부하다...
 *
 *	  교사=> Teacher
 *	  속성:
 *	  기능:
 *
 *	  직원=> Staff
 * */
public class SchoolApp {

	public static void main(String[] args) {
		//학생, 교사, 직원 객체 각각 1개씩 생성해서
		// 속성값 주고 메소드 호출해보기
		Student s1=new Student();
		
		s1.showInfo2();
		
		s1.num=201812345;
		s1.name="강시안";
		s1.department="예술";
		
		s1.showInfo2();
		
		String d1=s1.existAt(50);
		
		
		System.out.println(s1);
		
				
		//rent()메소드 호출해보기
		//s1.rent("전공필수", 8000);
		//h1.rent("교양필수", 5000);
	}

}
