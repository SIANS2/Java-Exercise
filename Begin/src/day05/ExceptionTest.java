package day05;
/*����ó�� ���
 * 	[1]Handle : try ~ catch�� ���
 *  [2]Declare : throw ���� ���
 *  
 *  
 * */
public class ExceptionTest {

	public static void main(String[] args) {
		String[] fruits= {"����","���","���","��"};
		try {
			for(int i=0;i<5;i++) {
				System.out.println(fruits[i]);
			}//for---
		}catch(ArrayIndexOutOfBoundsException e) {
			//���� ó�� �ڵ�
			System.out.println("�迭�� �ε��� ������ �ʰ��Ǿ����ϴ�!!!");
		}
			
		System.out.println("###�ݵ�� ����Ǿ�� �ϴ� �߿��� �ڵ� �Դϴ�.###");
	}

}
