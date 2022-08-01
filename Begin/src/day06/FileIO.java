package day06;
import java.io.*;
/*Exception
 * 		+--------IOException
 * 					+------------FileNotException
 * throws �� �߻��� ���ܸ� ó���ϼ���
 * 
 * */
public class FileIO {

	public static void main(String[] args) {
		if(args.length!=1) {
		System.out.println("����� �μ��� ���� ���ϸ��� �Է��ϼ���");
		System.out.println("[��] C:myjava/01/Hello.java");
		return;
	}

		String fileName=args[0];
		System.out.println("���� ���ϸ�: "+fileName);
		String contents=FileIO.reading(fileName);
		System.out.println(contents);
	}//main----------
	
	/**������ �о ���� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
	 * */
	public static String reading(String fname)
	{
		FileReader fr=null;
		
		char[] data=new char[1000];
		
		try {
		fr=new FileReader(fname);//FileNotFoundException
		//���ϰ� ��� ����
		
		fr.read(data,0, 1000);//IOException
		//������ �о charŸ�� �迭 data�� ����ش�.
		
		fr.close();//IOException
		//��� ���� ����
		//���� ������ data�迭�� ����.=>���ڿ��� ������
		String contents=new String(data);
		return contents;
		} catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch(IOException e) {
			System.out.println("����� ���� �߻�");
		}
		return fname;
	
		
		
	}

}