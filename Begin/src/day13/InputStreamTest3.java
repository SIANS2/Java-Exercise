package day13;
import java.io.*;
//System.in :Ű����� ��� ����
//System.out : �ý����� ǥ�� �����ġ(=�ܼ�)�� ��� ����
public class InputStreamTest3 {

	public static void main(String[] args) 
	throws IOException
	{
		int n=0;
		int cnt=0;
		
		System.out.println("�Է��ϼ���==>");
		//�����͸� �ް���(�迭)�� ��Ƽ� �а� �Ẹ��
		byte[] arr=new byte[6];//�ް���
		int total=0;
		while((n=System.in.read(arr))!= -1) {
			//�迭 arr�� �����Ͱ� ����.
			//n : �ް����� (���� ����Ʈ��)
			//System.out.write(n); <-�迭�� �� ���� �̷��� �ϸ� �ȵȴ�.
			System.out.write(arr, 0, n);
			System.out.flush();//��Ʈ���� �����ִ� �����͸� �о�� ���ش�.
			cnt++;//�ݺ��� Ƚ��
			total+=n;//�Է¹��� ����Ʈ ��
		}
		System.out.println(total+"bytes ����");
		
		System.in.close();
		System.out.close();
	}

}
