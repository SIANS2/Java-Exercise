package day02;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("--------------");
		
		System.out.println("1"+"2");
		//�ֵ���ǥ �ȿ� �ֱ� ������ ���ڿ��� �ν�. 12		
		System.out.println(true+ "");
		// true�� boolean�� �ƴ϶� String���ڿ��� �ν�. �ִٿ�ǥ�� �������� ����.		
		System.out.println('A' + 'B');
		//char�̱� ������ �ƽ�Ű �ڵ� A =65, B=66 => 131		
		System.out.println('1'+2);
		//char + int => int : 49 +2 => 51
		System.out.println('1'+'2');
		// 99
		System.out.println('J'+"ava");
		//char+String (���ڿ��ϰ� �������� ������ ���ڿ��� ��) => String ����, Java
		System.out.println(true+" null");
		//boolean + String => String

		
		System.out.println("----------------���� ��----------------");
		System.out.println("[2-6] ���� = b,c,d,e");//d��e�� java.lang��Ű�����ִ� Ŭ���� �̴�.
		System.out.println("[2-7] ���� = a,d,g");
		System.out.println("[2-8] ���� = a,d");
		System.out.println("[2-9] ���� = e");
		System.out.println("[2-11] ���� = a,b,c,d");
		System.out.println("[2-12] ���� = a,b,c,e");//public�� static�� ��ġ �ٲ㵵 ��.
		System.out.println("[2-13] ���� = c,e,f");
		//�⺻�ڷ������� �⺻���� �ֽ��ϴ�.
		//byte : 0
		//short : 0
		//int : 0
		//long : 0L
		//float : 0.0f
		//double : 0.0
		//char : '\u0000'
		//boolean = false
		//������ = null
		//String = null
	}
}
