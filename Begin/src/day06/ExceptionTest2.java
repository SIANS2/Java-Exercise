package day06;
import java.io.IOException;
public class ExceptionTest2 {
	//[1] Handle�ϴ� ���
	public void input()
	{
		//IOException : ������ Ÿ�� ����
		try {
		//int n=System.in.read();
			char n=(char)System.in.read();
			System.out.println("n: "+n);
		}catch (IOException e) {
			System.out.println("����� ���� �߻�:"+e);	
		}
	}//--------------------------------------------
	//[2] Declare �ϴ¹�� : tnrows ���� �̿�
	//=> sub()�޼ҵ带 ȣ���� ������ ����ó���� �ѱ��.
	public static void sub() throws IOException
	{
		int n=System.in.read();
		System.out.println("n: "+n);
				
	}
	
	
	
	public static void main(String[] args)
	throws IOException
	{
		//input()�޼ҵ� ȣ���غ���
		System.out.println("�Է��ϼ���=>");
		//ExceptionTest2.input();
		//sub()�޼ҵ� ȣ���غ���
		ExceptionTest2.sub();
		
	}
		
	}


