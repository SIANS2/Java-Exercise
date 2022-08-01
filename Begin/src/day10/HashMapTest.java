package day10;
import java.util.*;
import java.io.*;

//HashMap
// - Map �迭
// - ������ (�Է¼����� ��¼����� �ٸ� �� ����)
// - key���� Set���� �����Ѵ�.
public class HashMapTest {
	HashMap<String, String> map=new HashMap<>();
	
	public void join() {
		map.put("Hong", "123");
		map.put("Lee", "abc");
		map.put("Admin", "tiger");
		System.out.println(">>ȸ������ �Ϸ�<< [ȸ���� : "+map.size()+"��]");
	}//---------------------------
	public void loginCheck() {
		Console console=System.console();
		//��Ŭ�������� �׽�Ʈ�ϸ� �ȵȴ�=> consol�� null�� �ǹǷ�.
		while(true) { 
			System.out.println("���̵� :");
			String userid =console.readLine();
			//System.out.println("userid: "+userid);
			
			System.out.println("��й�ȣ: ");
			char[] pwd=console.readPassword();
			//System.out.println("pwd: "+new String(pwd));
		//1) �Է��� ���̵� map�� ����Ǿ� �ִ��� üũ
			// 	1_1)���ٸ�=>"�Է¿���! ȸ���� �ƴմϴ�."
			//	1_2)�ִٸ�
			//		<a> ��й�ȣ�� ��ġ�ϴ� ���=>"~~�� ȯ���մϴ�"
			//		<b> ��ġ���� �ʴ� ��� =>"��й�ȣ�� ��ġ�������ϴ�."
			if (!map.containsKey(userid)) {
				System.out.println("�Է¿���! ȸ���� �ƴմϴ�.");
			} else {
				String realPwd=map.get(userid);
					//==:�⺻�ڷ��� : ���� ��
					//	:������ : �ּҰ��� ��
					//boolean equals(Object o) : String�� ��� ���ڿ��� ������ ������ true��ȯ
				if (realPwd.equals(new String(pwd))) {
					System.out.println(userid + "�� ȯ���մϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}

		}
	}//-----------
	
	public static void main(String[] args) {
		//join ȣ���غ�����.
		HashMapTest hm=new HashMapTest();
		hm.join();
		hm.loginCheck();
	}

}
