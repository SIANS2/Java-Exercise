package day02;
import java.util.Date;

public class ReferenceType {

	public static void main(String[] args) {
		System.out.println("--������(reference type)--------");
		/* [1] Ŭ������ : Strring, Date, ...
		 * [2] �������̽��� 
		 * [3] �迭 : String[], int[]...
		 * : �������� �ݵ�� new �����ڷ� ��ü�� �����ؼ� ����ؾ� �Ѵ�.
		 *	�� ���ܰ� �ִ�. String�� ��� ���� ���Ǵ� �����̹Ƿ�
		 *	�⺻�ڷ��� ó�� ���ڿ� ��(literal)�� ���� �Ҵ��� �� �ִ�.
		 * */
		String s1=new String("Java");
		System.out.println("s1="+s1);
		//java.util��Ű��
		Date today =new Date();//������
		System.out.print("today="+today);
		
		String s2="Hello";
		System.out.println("s2="+s2);
		System.out.println(s2.toUpperCase());//�빮��
		System.out.println(s2.toLowerCase());//�ҹ���
		/*�⺻�ڷ��� : �ַο��꿡 ����
		 * ������ : [������(����) + ���(�޼ҵ�)] �޼ҵ带 ���� �پ��ϰ� ����.
		 * */
		
		int a=20;
		int b=30;
		System.out.println(a+b+"<=��");//���ڿ��� ���� ���ͼ� 20+30=50���� ����� �� ���ڸ� ����.
		System.out.println("��=>"+a+b);//���ڿ� ����� ���� �ؾ���. 20 �� 30�� ���ڷ� �ν��ϰ� �̾����.
		System.out.println("��=>"+(a+b));
		
		
	}

}
