package day13;
import java.io.*;
/*FileInputStream
 * - 1byre 기반 스트림
 * - node 스트림 => 파일과 노드 연결한다.
 * - 이미지, 멀티미디어, 바이너리 파일등을 읽을 때 사용한다.
 * 
 * byte배열에 담아 읽고 쓰세요
 * [실습] 아이콘4jpg파일을 카피해서 c:/myjava/copy.jpg로 내보내기
 * */

public class FileInputStreamTest2 {
	public static void main(String[] args) throws IOException
	{
		String fileName="아이콘4.jpg";
		String fileName2="c:/myjava/copy.jpg";
		//파일과 노드 연결
		FileInputStream fis=new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(fileName2);
		
		int n=0;
		int cnt=0; 
		int total=0;
		
		byte[] arr=new byte[4000];
		
		while((n=fis.read())!=-1) {//n: 파일데이터가 담긴다.
				//파일의 끝에 도달하면 -1을 반환한다.
				//System.out.write(arr,0,n);
				//System.out.flush();
				
				fos.write(arr,0,n);
				fos.flush();
				
				cnt++;
				total += n;
			}
		System.out.println("총 파일의 크기: "+total+"bytes");
		System.out.println(fileName2+"에 카피 완료!");
		fis.close();
		fos.close();
		System.out.close();
		
		
		}
		
	}
