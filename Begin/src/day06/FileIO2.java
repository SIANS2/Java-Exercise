package day06;
import java.io.*;
/*Exception
 * 		+--------IOException
 * 					+------------FileNotException
 * try ~ catch로 발생한 예외를 처리하세요
 * 
 * */

public class FileIO2 {

	public static void main(String[] args) {
		if(args.length!=1) {
		System.out.println("명령줄 인수로 읽을 파일명을 입력하세요");
		System.out.println("[예] C:myjava/01/Hello.java");
		return;
	}

		String fileName=args[0];
		System.out.println("읽을 파일명: "+fileName);
		try {
			String contents=FileIO2.reading(fileName);
			System.out.println(contents);
		}catch(IOException e) {
			System.out.println("파일 읽는 중 예외 발생: "+e.getMessage());
		}
		
	}//main----------
	
	/**파일을 읽어서 파일 내용을 문자열로 반환하는 메소드 
	 * */
	
	public static String reading(String fname)
	throws FileNotFoundException, IOException
	{
		FileReader fr=null;
		
		char[] data=new char[1000];
		
		fr=new FileReader(fname);//FileNotFoundException
		//파일과 노드 연결
		
		fr.read(data,0, 1000);//IOException
		//파일을 읽어서 char타입 배열 data에 담아준다.
		
		fr.close();//IOException
		//노드 연결 끊기
		
		//파일 내용은 data배열에 담긴다.=>문자열로 만들자
		String contents=new String(data);
		
		return contents;
		
	}

}