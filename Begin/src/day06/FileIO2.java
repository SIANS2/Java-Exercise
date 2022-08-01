package day06;
import java.io.*;
/*Exception
 * 		+--------IOException
 * 					+------------FileNotException
 * try ~ catch�� �߻��� ���ܸ� ó���ϼ���
 * 
 * */

public class FileIO2 {

	public static void main(String[] args) {
		if(args.length!=1) {
		System.out.println("����� �μ��� ���� ���ϸ��� �Է��ϼ���");
		System.out.println("[��] C:myjava/01/Hello.java");
		return;
	}

		String fileName=args[0];
		System.out.println("���� ���ϸ�: "+fileName);
		try {
			String contents=FileIO2.reading(fileName);
			System.out.println(contents);
		}catch(IOException e) {
			System.out.println("���� �д� �� ���� �߻�: "+e.getMessage());
		}
		
	}//main----------
	
	/**������ �о ���� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
	 * */
	
	public static String reading(String fname)
	throws FileNotFoundException, IOException
	{
		FileReader fr=null;
		
		char[] data=new char[1000];
		
		fr=new FileReader(fname);//FileNotFoundException
		//���ϰ� ��� ����
		
		fr.read(data,0, 1000);//IOException
		//������ �о charŸ�� �迭 data�� ����ش�.
		
		fr.close();//IOException
		//��� ���� ����
		
		//���� ������ data�迭�� ����.=>���ڿ��� ������
		String contents=new String(data);
		
		return contents;
		
	}

}