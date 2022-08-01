package day02;

public class MyOperate {
	
	public static void main(String[]args) {
		System.out.println("1. ��� ������----");
		//+, -, *, /(���� ���� ���ϴ� ������), %(������ ���� ���ϴ� ������)
		int a=10;
		System.out.println(a-6);//4
		System.out.println(a*3);//30
		System.out.println(a/3);//3 int/int ==> ����� int
		System.out.println(a%3);//1
		
		double b=10;
		System.out.println(b/3);//double/int ==> ����� double
		
		System.out.println("2. shift ������ (<<, >>, >>>)----");
		// 42 : 00000000 00000000 00000000 00101010
		System.out.println(42<<3);
		//00000000 00000000 00000001 01010000 => 2^8 + 2^6 +2^4 => 336
		System.out.println(42>>3);
		//00000000 00000000 00000000 00000101 => 2^2 + 1 => 5
		System.out.println(42>>>3);
		//00000000 00000000 00000000 00000101 => 2^2 + 1 => 5
		
		/* ����Ʈ ������
		1) << : �������� ��Ʈ�� ��ŭ �̵�
					�ڿ� ���� ��ĭ�� 0���� ä���.
	    2) >> :  ���������� ��Ʈ�� ��ŭ �̵�
					�տ� ���� ��ĭ�� ��ȣ��Ʈ�� ä���.
		3) >>> : ���������� ��Ʈ�� ��ŭ �̵�
					�տ� ���� ��ĭ�� ������ 0���� ä���.
	*/
		//-43 : 11111111 11111111 11111111 11010101
		System.out.println(-43<<2);
		// 11111111 11111111 11111111 01010100 => 101010100 => -256 + 64 + 16 + 4 = -172
		System.out.println(-43>>2);
		// 11111111 11111111 1111111 11110101 => 10101 => -16 + 4 + 1 = -11
		System.out.println(-43>>>2);
		// 00111111 11111111 1111111 11110101 => 1073741813
		
		System.out.println("3. �񱳿����� : ==, !=, >, <, >=, <=, instanceof");
		int m=60;
		int n=160;
		/* 1) > : ū��?
		 * 2) >= : ũ�ų� ������?
		 * 3) < : ������?
		 * 4) <= : �۰ų� ������?
		 * 5) == : ������?
		 * 6) != : �ٸ���?
		 * 7) �������� instanceof Ŭ������ : ���������� Ŭ������ ��ü�ΰ�?
		 * */
		
		System.out.println(m>n);//false
		System.out.println(m>=n);//false
		System.out.println(m<=n);//true
		
		if(m>n) {
			System.out.print("@@@@");
		} 
		else if(m<n) {
			System.out.println("####");
		}
	}
}


