package day11;
import java.io.*;
import java.util.*;

/*Promperties : Map �迭
 *	-- �ý����� �������� ���� xxx.propertiees ���Ͽ� ������ ��,
 *		�� ������ �о �ش� ���Ͽ� ����� ������ ����ϰ��� �� �� �̿��Ѵ�.
 * */


public class PropertiesTest {

	public static void main(String[]aegs) throws IOException {
		String loc="src/day11/mysystem.properties";
		
		FileReader fr=new FileReader(loc);//���ϰ� ��� �����Ͽ� �о���� �غ� �Ѵ�.
		//������ ������ Properties��ü�� �Ű� ����.
		
		Properties prop=new Properties();
		prop.load(fr);
		fr.close();
		//properties ���� ������ �о Properties() ��ü�� �Ű� �����س��´�.
		
		//void setProperties(String key, String value): ����
		//String getProperties(String key) : ������
		String os=prop.getProperty("Os");
		System.out.println("�ü�� : "+os);
		
		String dbms=prop.getProperty("DbType");
		System.out.println("DBMS: "+dbms);
		
		System.out.println("User: "+prop.getProperty("Dbms","king"));
		System.out.println("Password: "+prop.getProperty("Dbpwd"));
		System.out.println("Msg:"+prop.getProperty("Msg","�޼����� �����ϴ�."));

		prop.setProperty("Lang", "Java");
		System.out.println("Lang : "+prop.getProperty("Lang"));
	}

}
