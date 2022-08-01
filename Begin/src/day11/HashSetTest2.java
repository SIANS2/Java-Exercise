package day11;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		// Member ��ü 3�� �����ؼ� HashSet�� �����ϼ���
		Member m1=new Member("ȫ�浿",22);
		Member m2=new Member("�����",23);
		Member m3=new Member("�̼���",24);
		Member m4=new Member("ȫ�浿",22);
		Member m5=new Member("ȫ�浿",33);
		
		//iterator()�޼���� ����� ȸ������ ������ ����ϼ���
		Set<Member> set=new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		
		System.out.println("ste.size : "+set.size());
		
		//iterator()�޼���� ����� ȸ������ ������ ����ϼ���
		Iterator<Member> it=set.iterator();
		for(int i=1;it.hasNext();i++) {
			Member user=it.next();
			System.out.println(i+": "+user.name+", "+user.age+"��");
		}
	System.out.println("m1.hashcode(): "+m1.hashCode());	
	System.out.println("m4.hashcode(): "+m4.hashCode());	
	System.out.println("m2.hashcode(): "+m2.hashCode());	
	System.out.println("m5.hashcode(): "+m5.hashCode());	
	}

}
