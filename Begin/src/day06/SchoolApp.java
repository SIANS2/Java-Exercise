package day06;
/*�л���� ���α׷�
 *	- ��ü ����
 *	  �л�, ����, ���� ...
 *	  ==> class �� �����ϱ�
 *	  �л�=> Student
 *	  |
 *	  �Ӽ�: �й�, �̸�, �б�, ����ó ...
 *	  ���: ������ �����ִ�, �����ϴ�...
 *
 *	  ����=> Teacher
 *	  �Ӽ�:
 *	  ���:
 *
 *	  ����=> Staff
 * */
public class SchoolApp {

	public static void main(String[] args) {
		//�л�, ����, ���� ��ü ���� 1���� �����ؼ�
		// �Ӽ��� �ְ� �޼ҵ� ȣ���غ���
		Student s1=new Student();
		
		s1.showInfo2();
		
		s1.num=201812345;
		s1.name="���þ�";
		s1.department="����";
		
		s1.showInfo2();
		
		String d1=s1.existAt(50);
		
		
		System.out.println(s1);
		
				
		//rent()�޼ҵ� ȣ���غ���
		//s1.rent("�����ʼ�", 8000);
		//h1.rent("�����ʼ�", 5000);
	}

}
