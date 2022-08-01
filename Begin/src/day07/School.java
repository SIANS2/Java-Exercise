package day07;

public class School {

	public static void main(String[] args) {

		
		/*[1] 학생 객체를 생성하고, 학번,이름,전공값을 할당하세요*/
		Student s1=new Student();
		s1.setNo(101);
		s1.setName("강시안");
		s1.setMajor("자바");
		
		
		/*[2] 교사 객체를 생성하고, 교번,이름,담당과목값을 할당하세요*/
		Teacher t1=new Teacher();
		t1.setNo(201);
		t1.setName("멀티캠퍼스");
		t1.setSubject("자바");
		
		
		/*[3] 직원 객체를 생성하고, 사번,이름,소속부서값을 할당하세요*/
		Staff s2=new Staff();
		s2.setNo(301);
		s2.setName("MLP");
		s2.setDept("운영");
		
		System.out.println("****학생 정보****");
		
		System.out.println("학번: "+s1.getNo());
		System.out.println("이름: "+s1.getName());
		String mj=s1.getMajor();
		System.out.println("전공: "+mj);
		
		System.out.println("****교사 정보****");
		
		t1.showInfo();
		
		System.out.println("****직원 정보****");
		
		s2.showInfo();
		
		
		//문제1]학생 객체를 2개 더 생성하고...
				//        각각 이름,학번,전공 값을 넣어준뒤...
				//			배열에 저장하자.
				//			for루프 돌리면서 저장된 학생 객체들의
				//         정보를 출력해보자.
		Student s3=new Student();
		s3.setNo(111);
		s3.setName("장채민");
		s3.setMajor("간호");
		
		Student s4=new Student();
		s4.setNo(121);
		s4.setName("강소령");
		s4.setMajor("패션");
		
		Student[] arr1=new Student[3];
		arr1[0]=s1;
		arr1[1]=s3;
		arr1[2]=s4;
		
		for(int i=0;i<arr1.length;i++) {
			Student st=arr1[i];
			//System.out.println(st);
			st.showInfo();
		}
		
		
		
	
		//문제2] 교사 객체 1개 더 생성
		//    값 할당 후 배열에 저장후, 확장 for루프 이용해서 교사정보 출력하기
		Teacher t2=new Teacher();
		t2.setNo(211);
		t2.setName("부산학원");
		t2.setSubject("빅데이터");
		
		Teacher arr2[] = {t1, t2};
		for(Teacher tc: arr2) {
			tc.showInfo();
		}
		
	}

}
