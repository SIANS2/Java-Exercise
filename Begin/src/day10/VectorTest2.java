package day10;
//java.util.List�迭 => list []
import java.util.*;
public class VectorTest2 {

	public static void main(String[] args) {
		//[1] Student��ü�� 3�� �����ϼ���
		Student s1=new Student(1, "��ö��");
		Student s2=new Student(2, "�̿���");
		Student s3=new Student(3, "ȫ�浿");
		
		//[2] Student�� ������ Vector�� �����ϼ���
		Vector<Student> v=new Vector<>(5,3);
		
		//[3] ���Ϳ� �����ü 3���� �����ϼ���
		v.add(s1);
		v.addElement(s2);
		v.add(s3);
		System.out.println("v.size(): "+v.size());
		
		//[4] for���� �̿��ؼ� ���Ϳ� ����� �л��� ����(�й�,�̸�)�� ����ϼ���.
		
		for(Student a : v) {
			System.out.println("�й� : "+a.getId()+", �̸� : "+a.getName());
		}
		//public Enumeration<E> elements()
		//public Iterator<E> iterator()	
		
		/*Enumeration<E> elements()
		 * : ���Ϳ� ����� ��ü���� �Ѳ����� ���������� �� �� ���.
		 * Enumeration�� Iterator�������̽��� ��ü���� ����ü��
		 * �����ϵ��� ���ִ� �������̽��̴�.
		 * �̵� �������̽������� ������ ��ü���� �� ������ �ϳ���
		 * ó���� �� �ִ� �޼ҵ带 �����Ѵ�.
		 * # Enumeration�� ���**********************************
		 * 	- boolean hasMoreElements() : ���� Ŀ��(ù��° ��� ������
		 * 				��ġ) ���Ŀ� ��ҵ��� �ִ��� ��� ������true
		 * 				������ false�� ��ȯ
		 *  - E nextElement(): ���� Ŀ���� ���� ��ҷ� �̵��ϰ�
		 *  			���� ����Ű�� �ִ� ��Ҹ� ��ȯ�Ѵ�.
		 * # Iterator�� ���**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		Enumeration<Student> en=v.elements();
		while(en.hasMoreElements()) {
			Student e=en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}
		System.out.println("*********************");
		while(en.hasMoreElements()) {
			Student e=en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
	}
		//public Iterator<E>  iterator()
		//iterator()�޼��� �̿��ؼ� v�� ����� �л����� �̸��� ��� ����ϼ���
		Iterator<Student> it=v.iterator();
		while(it.hasNext()) {
			Student i=it.next();
			System.out.println(i.getName()+"^"+i.getId());
	}
		//clear(), removeAll() : ����Ҹ� �����Ѵ�
		v.clear();
		System.out.println("��� ������ *************");
		it=v.iterator();
		for(;it.hasNext();) {
			Student i=it.next();
			System.out.println(i.getName());
		}
	}
}
