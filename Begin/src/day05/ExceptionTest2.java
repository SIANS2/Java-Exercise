package day05;

public class ExceptionTest2 {

	public static void main(String[] args) {

		try {
			for(int i=1;i<=5;i++) {
				int a=50/(i-3);
				System.out.println("a= "+a);
			}//for===
			
		} catch(ArithmeticException e) {
			System.out.println("������� : �и� 0�̾ �ȵǿ�!");
		}
		System.out.println("###�ſ� �߿��� �ڵ�###");
			
		}

	}