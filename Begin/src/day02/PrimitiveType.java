package day02;

public class PrimitiveType {
	
	public static void main(String[] args) {
		System.out.println("�⺻�ڷ���---------------");
		System.out.println("");//Ctrl + D : ���� Ŀ������ �����Ѵ�.
		//Ctrl + S : ���� => �ڵ����� ������ �ȴ�.(javac)
		//Ctrl + F11 : ���� ������ �����Ų��.(java)
		//Alt + ����Ű : ���� ��ġ�� ���������ϴ�.
		int a=10;
		int b=010;//�̰͵� ����(8����) : 8������ �տ� 0�� ���ξ�� ���δ�.(0 ~ 7 )
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=0123;//1*8^2 + 2*8^1 + 3*8^0 = 83
		System.out.println("c="+c);
		
		int d=0x12;//����(16����) : 16������ �տ� 0x�� ���ξ�� ���δ�.
		//1*16 + 2 => 18
		//0 ~ 15 : 0 ~ 9 A,B,C,D,E,F(���ĺ��� �빮�� �ҹ��� ���� ����)
		int e=0x2ac;
		// 2*16^2 + 10*16^1 + 12*16*0 
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		char c1='a';
		System.out.println("c1="+c1);
		char c2='0';
		System.out.println("c2="+c2);
		//int �̸��� �ڷ��� (byte,short,char) =>���꿡 ���Ǹ� int�� �ڵ���ȯ�� �Ͼ��.
		char c3=(char)(c2+1);//97+48(�ƽ�Ű�ڵ�) = 145
		System.out.println(c3);
		
		double d2=.456E+2;
		System.out.println(d2);
		
	}

}
