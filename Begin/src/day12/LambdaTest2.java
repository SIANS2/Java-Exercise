package day12;

//�Ű������� ���ϰ��� ���� ���ٽ�
@FunctionalInterface
interface MyFunc{
	void func();
}////////////////////////

//�Ű������� �ִ� ���ٽ�
@FunctionalInterface
interface YourFunc{
	void foo(int x);
}///////////////////////////

//�Ű������� �޾� ���� ��ȯ�ϴ� ���ٽ�
@FunctionalInterface
interface HerFunc{
	String makeStr(String a, String b);
}///////////////////////
public class LambdaTest2 {

	public static void main(String[] args) {
		//[1] ���ٽ� ###�� ����ϴ� ���ٽ��� ������ �ڿ� �Լ��� ȣ���غ�����
		MyFunc mf=()-> System.out.println("###");
		mf.func();
		//[2] ���ٽ� \\(^^)// ����ϴ� ���ٽ� �����ϰ� �Լ� ȣ��
		MyFunc mf2=()-> System.out.println("\\\\(^^)//");
		mf2.func();
		//[3] YourFunc  �Ű������� ������ �ŵ��������� ����ϴ� ���ٽ� ������ �� �Լ� ȣ���ϱ�
		YourFunc yf1=(x) -> System.out.println(x*x);
		yf1.foo(5);
		//[4] YourFunc  �Ű��������� 3�� ���ִ� ���� ����ϴ� ���ٽ� ������ �� �Լ� ȣ���ϱ�
		YourFunc yf2=(int x) -> System.out.println(x-3);
		yf2.foo(10);
		
		//[5] HerFunc  ���ڿ� 2���� �޾Ƽ� 2���� ���ڿ��� �����ؼ� ��ȯ�ϴ� ���ٽ� ����, ȣ���ϱ�
		HerFunc hf1=(str1, str2)-> str1+", "+str2;
		System.out.println(hf1.makeStr("hi", "java"));
		
		//[6] HerFunc  ���ڿ� 2���� �޾Ƽ� 2���� ���ڿ��� �����ؼ� ��ȯ�ϵ� ù���ڴ� �빮�ڷ� ��������
		//				�ҹ��ڷ� ���� ��ȯ�ϴ� ���ٽ� ���� ȣ���ϱ�
		// hello,  world ==> Hello World 
		HerFunc hf2=(str1, str2)->{
			char c1=str1.charAt(0);
			char c2=str2.charAt(0);
			String s1=str1.substring(1);
			String s2=str2.substring(1);
			
			String allStr=(c1+"").toUpperCase()+s1+" "+String.valueOf(c2).toUpperCase()+s2;
			return allStr;
		};
		
		System.out.println(hf2.makeStr("hi", "java"));

	}

}

