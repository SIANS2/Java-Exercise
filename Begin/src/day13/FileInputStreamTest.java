package day13;
import java.io.*;
/*FileInputStream
 * - 1byre ��� ��Ʈ��
 * - node ��Ʈ�� => ���ϰ� ��� �����Ѵ�.
 * - �̹���, ��Ƽ�̵��, ���̳ʸ� ���ϵ��� ���� �� ����Ѵ�.
 * */

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException
	{
		String fileName="src/day13/InputStreamTest.java";
		//���ϰ� ��� ����
		FileInputStream fis=new FileInputStream(fileName);
		int n=0;
		int cnt=0;
		while((n=fis.read())!=-1) {//n: ���ϵ����Ͱ� ����.
				//������ ���� �����ϸ� -1�� ��ȯ�Ѵ�.
				System.out.write(n);
				System.out.flush();
				cnt++;
			}
		System.out.println("�� ������ ũ��: "+cnt+"bytes");
		fis.close();
		System.out.close();
		}
		
	}
