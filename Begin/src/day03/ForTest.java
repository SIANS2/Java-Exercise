package day03;
/*loop��
 * [1] for������
 * 
 * 	for(���� ����;���ǽ�;������)
 * {
 * 			���๮;
 * }
 * ���ǽ��� true�� ���� ���๮�� �ݺ��ؼ� �����Ѵ�.
 * 
 * */
public class ForTest {
	int k;//�������=> �ʱ�ȭ ���� ������ �⺻��(0)�� �Ҵ�ȴ�.
	
	public static void main(String[] args) {
		
		System.out.println("Hello World~");
		
		for(int i=1;i<=7;i++)
		{
			//�������� i�� scope(����)=> for������������ �������.
			System.out.println("Hi World~ : "+i);			
		}//for��
		System.out.println("~~~~~The End~~~~~");
		
		int j=10;//main�̶�� �޼ҵ� �ȿ� ������ ��������
		//j�� scope�� main()�޼ҵ������ ����ִ�.
		for(;j>3;j--) {
			System.out.println("Java: "+ j);
			
		}
		System.out.println("###The End ###"+ j);
		//���ѷ���
		//for(;;)
			//System.out.println("@@@@");
	}//main ��

}//class��
