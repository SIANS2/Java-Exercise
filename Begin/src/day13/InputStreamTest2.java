package day13;
import java.io.*;
//System.in :Ű����� ��� ����
//System.out : �ý����� ǥ�� �����ġ(=�ܼ�)�� ��� ����
public class InputStreamTest2 {

	public static void main(String[] args) 
	throws IOException
	{
		int n=0;
		int cnt=0;
		System.out.println("�Է��ϼ���==>");
		//�ް�(������)�� 1���� �̵�(1����Ʈ�� �̵�)
		while((n=System.in.read())!= -1) {//Ctrl+C �� �Է��ϸ� -1�� ��ȯ
			//System.out.println("n: "+((char)+n));
			System.out.write(n);
			cnt++;
		}
		System.out.println(cnt+"bytes ����");
		
		System.in.close();
		System.out.close();
	}

}
