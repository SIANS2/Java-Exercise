package day02;

public class MyOperator3 {

	public static void main(String[] args) {
		System.out.println("---6. ���ǿ�����(���׿�����)----");
		/* ���� ���� = (���ǽ�)? ��1:��2;
		 * => 	���ǽ��� true�̸� ��1�� ������ ����.
		 * 			  false�̸� ��2�� ������ �����Ѵ�.
		 * �̶� ����. ������ ��1, ��2�� ���� �ڷ����̾�� �Ѵ�.
		 * */
		int a=50;
		int b=60;
		int result=(a>b)?a:b;
		System.out.println("result="+result);
		
		int a2=50;
		int b2=60;
		int result2=(a2<b2)?a2:b2;
		System.out.println("result2="+result2);
		
		String str=(a>b)?a+"":b+"";
		System.out.println("str="+str);
		
		System.out.println("---7. �Ҵ翬����(������ ���Կ�����)---");
		/* =, +=, -=, *=, /=, %=, >>=, <<=, >>>=, &=, |=, ^=
		 * */
		int i=1;
		i+=3; // i = i+3 => 4
		System.out.println("i="+i);
		
		int j=15;
		j-=7; //j=j-7 => 8
		System.out.println("j="+j);
		
		int k=24;
		k/=2;
		System.out.println("k="+k);
		//k= 12
		
		k%=5;
		System.out.println("k="+k);
		//k =19
		
		
		int x=3;
		x^=2;
		System.out.println("x="+x);
		// x =
		
		
		
		
	}

}
