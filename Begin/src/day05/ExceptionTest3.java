package day05;
/*�Ʒ� ���α׷����� �߻��ϴ� ������ try~catch���� ó���غ�����
 * ��)ExceptionTest2������ for������ �ٱ��ʿ��� try ~ catch�� ��ƺ���
 *	 ExceptionTest3������ for������ ���ʿ��� try ~ catch�� ��ƺ�����
 * */
public class ExceptionTest3 {

	public static void main(String[] args) {

	for(int i=1;i<=5;i++) {
		try {
			int a=50/(i-3);
			System.out.println("a= "+a);
		} catch(ArithmeticException e) 
	{ 
		System.out.println("������� : �и� 0�̾ �ȵǿ�!");
		}
	}//for===
		System.out.println("###�ſ� �߿��� �ڵ�###");
	} 
	
		
	}

		

