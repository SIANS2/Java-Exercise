package day04;
/*
 * ���� ����;
 * do{
 * 	���๮;  <<����
 * 	������;	
 * } while(���ǽ�);
 * 
 * while���� ��� ���ǽ��� true�� ��� �ݺ� �����Ѵ�.
 * do while���� ��� ���ǽ��� true�� �ƴ�����(false) �� ���� ������ �ϰ�
 * �������� ���� ����.(true�̸� ��� �ݺ� ����)
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
			
		}while(0<b);//false������ 1���� �����Ѵ�.
		System.out.println("~~~The End~~~");
		//--------------------------------------------
		
		

	}//main-------------------------------------------

}//class--------------------------------------------------------------------------------------