package day13;
import java.io.*;
/*FileInputStream
 * - 1byre ��� ��Ʈ��
 * - node ��Ʈ�� => ���ϰ� ��� �����Ѵ�.
 * - �̹���, ��Ƽ�̵��, ���̳ʸ� ���ϵ��� ���� �� ����Ѵ�.
 * 
 * byte�迭�� ��� �а� ������
 * [�ǽ�] ������4jpg������ ī���ؼ� c:/myjava/copy.jpg�� ��������
 * */

public class FileInputStreamTest2 {
	public static void main(String[] args) throws IOException
	{
		String fileName="������4.jpg";
		String fileName2="c:/myjava/copy.jpg";
		//���ϰ� ��� ����
		FileInputStream fis=new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(fileName2);
		
		int n=0;
		int cnt=0; 
		int total=0;
		
		byte[] arr=new byte[4000];
		
		while((n=fis.read())!=-1) {//n: ���ϵ����Ͱ� ����.
				//������ ���� �����ϸ� -1�� ��ȯ�Ѵ�.
				//System.out.write(arr,0,n);
				//System.out.flush();
				
				fos.write(arr,0,n);
				fos.flush();
				
				cnt++;
				total += n;
			}
		System.out.println("�� ������ ũ��: "+total+"bytes");
		System.out.println(fileName2+"�� ī�� �Ϸ�!");
		fis.close();
		fos.close();
		System.out.close();
		
		
		}
		
	}
