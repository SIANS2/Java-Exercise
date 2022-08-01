package multicampus;
import java.util.*;
public class School {
	//School has a students[배열]
	//String arr[] = new String[3]; [x]
	static Student[] arr=new Student[3];//배열==> DB같은 역할을 함
	static int count=0;//배열의 인덱스 번호로 사용할 경우
	
	public static void showMenu() {
		System.out.println("*****SchoolApp v1.1*****");
		System.out.println("**	1. 등	록			**");
		System.out.println("**	2. 출	력			**");//<숙제
		System.out.println("**	3. 검	색			**");
		System.out.println("**	4. 삭	제			**");
		System.out.println("**	9. 종	료			**");
		System.out.println("**************************");
		System.out.println("메뉴 번호를 입력하세요=>=");
		System.out.println("**************************");
	}
	
	
	//public static void main(String[] args) {
		Student s1=new Student();
		/*
		s1.no=100;
		s1.name="임철수";
		s1.major="빅데이터";
		s1.phone="010-2222-3333";
		*/
		//s1.inputIfo();
		//s1.showInfo();
		
	//}
		public static void register() {
			Student s1=new Student();
			s1.inputIfo();
			System.out.println("---등록한 정보---");
			s1.showInfo();
			
			System.out.println("입력한 학생 정보를 저장할까요? [1. yes 2. no]");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
		if(num==1) {
			//s1을 배열에 저장한다.==> arr에 저장하기
			try {
				arr[count] =s1;
				count++;
				System.out.println("현재 등록된 인원: "+count+"명");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("등록 마감 됐습니다!");
			}
		
		}
	}//----------------------------------------
		/** 등록된 모든 학생정보를 등록하는 메소드*/
		public void printAll() {
			//배열 arr에 저장된 학생 정보를 for로프 이용해서 꺼내어 출력해보기
			for(int i=0;i<count;i++) {
				Student s=arr[i];
				//System.out.println(s);//이렇게 하면 s의 주소값이 출력된다.
				System.out.println("--학생 정보---");
				s.showInfo();
			}
		}//-----
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			School obj=new School();
			int num=0;
			do {
				//showMenu()호출하기
				School.showMenu();
				num=sc.nextInt();
				//메뉴에 없는 번호를 입력했을경우 "메뉴에 없는 번호에요. 다시 입력 하세요"
				if((num <= 0) || (num > 4)&&num!=9) {
					System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요.");
					continue;
				}
				switch(num) {
				case 1://학생 등록===> register()메소드 출력하기
					School.register();
					break;
				case 2://출력 printAll()==> arr에 저장된 학생들의 정보를
						// 반복문 돌면서 출력한다.
					obj.printAll();//메소드 호출 non static 메소드(인스천스 메소드)
					break;
				case 3://검색
					break;
				case 4://삭제
					break;
				}
				
			}while(num!=9);
			System.out.println("잘가세요~~~");
		}
}
