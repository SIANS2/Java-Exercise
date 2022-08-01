package day04;
/*
 * 변수 선언문;
 * do{
 * 	실행문;  <<먼저
 * 	증감식;	
 * } while(조건식);
 * 
 * while문의 경우 조건식이 true일 경우 반복 실행한다.
 * do while문의 경우 조건식이 true가 아닐지라도(false) 한 번은 실행을 하고
 * 루프문을 벗어 난다.(true이면 계속 반복 실행)
 * 
 * */

public class DoWhileTest {

	public static void main(String[] args) {
		
		int a=5;
		do {
			System.out.println("Hi~ "+a);
			a--;
		}while(a>2);
		//--------------------------------------------
		int b=0;
		do  {
			System.out.println("Java: "+b);
			b-=10;
			
		}while(0<b);//false이지만 1번은 실행한다.
		System.out.println("~~~The End~~~");
		//--------------------------------------------
		
		

	}//main-------------------------------------------

}//class--------------------------------------------------------------------------------------
