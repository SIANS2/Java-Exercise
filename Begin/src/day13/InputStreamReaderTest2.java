package day13;
/* InputStreamReader
 * - 2byte(����) ��� ��Ʈ��
 * - �긴�� ��Ʈ��
 * - 1byte�� �о� ���� �����͸� 2byte�� �����ؼ� �о� ���δ�.
 * - charset�� ���ߴ� ����� �ִ�.
 * */
import java.io.*;
public class InputStreamReaderTest2 {

	public static void main(String[] args) 
	throws IOException
	{
		//String fname="C:\\javawsp\\Begin\\src\\day13\\FileInputStreamTest.java";
		String fname="C:/myjava/readme.txt";//ANSI�� ���� ==> CP949 ==> EUC-KR
		
		File file =new File(fname);
		long fsize=file.length();//������ ũ�⸦ ��ȯ �Ѵ�.
		System.out.println("������ ũ��: "+fsize+"bytes");
		
		//FileReader fr=new FileReader(file);//��忬��
		FileInputStream fis=new FileInputStream(file);//��� ����
		InputStreamReader fr=new InputStreamReader(fis,"EUC-KR");
		
		OutputStreamWriter ow=new OutputStreamWriter(System.out, "EUC-KR");
		
		
		int n=0;
		while((n=fr.read())!=-1) {
			ow.write(n);
			ow.flush();
			//System.out.write(n);
			//System.out.flush();
		}
		fr.close();
	}

}
