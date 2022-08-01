package day02;

public class UnaryOperator {

	//main
	public static void main(String[] args) {
		System.out.println("1. ���� ������ (��ȣ������ : +, -)");
		int a=8;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2. ���������� : ++, --");
		int b=5;
		long c=9;
		b++; //b = b+1
		c--; //c = c-1
		System.out.println(b); //6
		System.out.println(c); //8
		++b;
		--c;
		
		System.out.println(b); //7
		System.out.println(c); //7
		//++�̳� --�� �ܵ����� ���� ���� ���� ���̳� �ڿ� ���̰� ����.
		//�׷��� �ٸ� ���İ� �Բ� ����� ������ ++,-- �� �տ� ���� �Ͱ� �ڿ� ���� ���� ���̰� �ִ�.
		
		float d=5.3f;
		double e=7.3;
		System.out.println(d++); //5.3
		System.out.println("d: "+d); //6.3
		
		System.out.println(--e); //6.3
		System.out.println("e: "+e); //6.3
		
		int x=10;
		int y=x++;
		System.out.println("x= "+x);//x= 11
		System.out.println("y= "+y);//y= 10
		
		x=10;
		int z= ++x;
		System.out.println("x= "+x);//x= 11
		System.out.println("z= "+z);//z= 11
		
		System.out.println("3. ��Ʈ�� not������ : ~");
		//�������� ��Ʈ(2����)�� �ٲٰ� ������ �����ϴµ�, ��Ʈ�� not�����ڴ� 1�� 0���� �ٲٰ�,
		//0�� 1�� �ٲٴ� ������ �̴�.
		//~3 : 11 (��Ʈ)
		// 3 : 0011 (4����)
		// 3 : 0000 0011 (8��Ʈ)
		// 3 : 00000000 00000000 00000000 00000011 (32��Ʈ)
		//~3 :11111111 11111111 11111111 11111100
		//	-1*2^31 + (1*2^30) + (1*2^29) ..... = -4
		int m=3;
		System.out.println(m);
		System.out.println(~m);
		
		//����1]
		int n=0xfffffff1; //f : 1111
		//1111 1111 1111 1111 1111 1111 1111 0001
		//11111111 11111111 11111111 11110001
		//00000000 00000000 00000000 00001110
		//1110 = 14
		System.out.println("~n: "+(~n));
		
		//������ : 2�γ��� ������ �� ���� �� ����. 
		// 42 : 00000000 00000000 00000000 00101010 (32��Ʈ)
		//~42 : 11111111 11111111 11111111 11010101 
		//~42 : 1010101 : -64 + 16 + 4 + 1 => -43 (ù ��Ʈ�� 1 = - , 0 = +)
		//~42 : -1*2^6 + 1*2^4 + 1*2^2 + 1*2*0 => -43
		System.out.println(~42);
		
		System.out.println("4. �� ���� ������ : !");
		//boolean������ ��밡���ϴ�. int������ ����� �� ����.
		//true => false��, false = > true�� �ٲ۴�.
		boolean bo=true;
		System.out.println(bo);//true
		System.out.println(!bo);//false
		System.out.println(!(3<2));//true
		
		int fo=5;
		System.out.println(fo==5.0);// ==(�������) : �⺻�ڷ��������� ���� ������ ���Ѵ�.
		System.out.println(fo!=5.0);// != : �⺻�ڷ��������� ���� �ٸ��� true, ������ false
		
		
		
		
	}
	
}
