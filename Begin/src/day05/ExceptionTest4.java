package day05;
/*try�� �ϳ��� catch���� ������ �� �� �ִ�.
 * �׷��� �̶� catch������ �����ؾ��Ѵ�.
 * -�θ��ڽ��� ��Ӱ��谡 �ִ� ������ ���
 * 	�ڽ��� ���� catch�ϰ� �θ� ���ܸ� ���߿� catch�ؾ��Ѵ�.
 **/
public class ExceptionTest4 {

	public static void main(String[] args) {
		//args : StringŸ���� �迭, ����� �μ�
		//������ : javac ExceptionTest4.java
		//���� : java ExceptionTest4 �ȳ� �߰�
		//						args[0] args[1]
		try {
			System.out.println("����= "+args[0]);//����
			System.out.println("����= "+args[1]);//����
			//�� �հ� ������ ���� ����ϼ���
			//������� ���� ����ϼ���
			System.out.println("-------------------------");
			System.out.println("����: "+(args[0]+args[1]));
			System.out.println("-------------------------");
			//java.lang.IntegerŬ����==>Wrapper class
			//int(�⺻�ڷ���) ===> Integer
			//public static int parseIn(String s):
			//���ڿ� s�� ������ ��ȯ���� ��ȯ���ִ� �޼ҵ�
			//����
			//�������
			int kor=Integer.parseInt(args[0]);//NumberFormatException
			int eng=Integer.parseInt(args[1]);
			int sum=kor+eng;
			int avg=sum/args.length;
			
			System.out.println("����: "+sum);
			System.out.println("���: "+avg);
			System.out.println(avg/0);//ArithmeticException
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����� �μ��� �Է��ؾ� �մϴ�!");
		}catch(NumberFormatException e) {
			System.out.println("������ ���ڷ� �Է��ؾ� �ؿ�!");
		}catch(Exception e) {
			System.out.println("��Ÿ ����ġ ���� ���� �߻�"+e);
		}
		
	}//main----

}//class-----------
