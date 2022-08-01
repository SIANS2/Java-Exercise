package day13;
/* FileReader/FileWriter
 * - 2byte(����) ��� ��Ʈ��
 * - ��� ��Ʈ�� (���ϰ� ��� ����)
 * */
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) 
	throws IOException
	{
		//String fname="C:\\javawsp\\Begin\\src\\day13\\FileInputStreamTest.java";
		String fname="C:/myjava/readme.txt";
		
		File file =new File(fname);
		File file2=new File("C:/myjava/readme_copy2.txt");
		
		
		long fsize=file.length();//������ ũ�⸦ ��ȯ �Ѵ�.
		System.out.println("������ ũ��: "+fsize+"bytes");
		
		FileReader fr=new FileReader(file);//��忬��
		
		FileWriter fw=new FileWriter(file2,true);//true�� �ָ� ���� ���Ͽ� ���� ���� ���� �ƴ϶� �E�ٿ��� ����.
		int n=0;
		char[] data=new char[1000];
		
		while((n=fr.read(data))!=-1) {
			fw.write(data,0,n);
			fw.flush();
			//System.out.write(n);
			//System.out.flush();
		}
		fr.close();
	}

}
