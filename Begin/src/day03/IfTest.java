package day03;

public class IfTest {
	
	public static void main(String[]args) {
		/* if(조건식){
		 * 		실행문;
		 * 		실행문;
		 * 		실행문;
		 * }
		 * 조건식이 true면 실행문을 실행
		 * */
		int a=3;
		if(a>0)//if조건문이 1개면 중괄호 없이 적어도 괜찮다.
			System.out.println("a는 양수입니다.");
		System.out.println("The End~~~~~");//위 조건과 상관없음. 
		
		int a2=-3;
		if(a2>0) {
			System.out.println("a는 양수입니다.");
			System.out.println("The End~~~~~");
		//tab키 : 들여쓰기
		//shift+tab : 내어쓰기
		}
		
		
		
		
	}

}
