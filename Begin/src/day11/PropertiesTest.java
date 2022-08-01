package day11;
import java.io.*;
import java.util.*;

/*Promperties : Map 계열
 *	-- 시스템의 설정정보 등을 xxx.propertiees 파일에 저장한 뒤,
 *		이 파일을 읽어서 해당 파일에 저장된 내용을 사용하고자 할 때 이용한다.
 * */


public class PropertiesTest {

	public static void main(String[]aegs) throws IOException {
		String loc="src/day11/mysystem.properties";
		
		FileReader fr=new FileReader(loc);//파일과 노드 연결하여 읽어들일 준비를 한다.
		//파일의 내용을 Properties객체로 옮겨 보자.
		
		Properties prop=new Properties();
		prop.load(fr);
		fr.close();
		//properties 파일 내용을 읽어서 Properties() 객체로 옮겨 저장해놓는다.
		
		//void setProperties(String key, String value): 저장
		//String getProperties(String key) : 꺼내기
		String os=prop.getProperty("Os");
		System.out.println("운영체제 : "+os);
		
		String dbms=prop.getProperty("DbType");
		System.out.println("DBMS: "+dbms);
		
		System.out.println("User: "+prop.getProperty("Dbms","king"));
		System.out.println("Password: "+prop.getProperty("Dbpwd"));
		System.out.println("Msg:"+prop.getProperty("Msg","메세지는 없습니다."));

		prop.setProperty("Lang", "Java");
		System.out.println("Lang : "+prop.getProperty("Lang"));
	}

}
