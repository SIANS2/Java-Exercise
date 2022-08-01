package day11;
import java.util.*;
/* Set �迭
 * 	������ ������� ����
 * 	������ �ߺ��� ������� �ʴ´�.
 * 	���� Ŭ���� = HashSet, TreeSEt...
 * 	�ؽü��� ��ü�� �����ϱ� ���� ��ü�� hashCode()�� ȣ���ؼ�
 * 	�ؽ��ڵ带 ��� ����. �׸��� �̹� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�.
 * 	���� ������ �ؽ��ڵ尡 �ִٸ�, �ٽ� equals() �޼���� �� ��ü�� ���ؼ�
 * 	true�� ������ ������ ��ü�� �Ǵ��ϰ� �ߺ������� ���� �ʴ´�.
 * 
 * */


public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>();
		//������ ����
		//add(E)
		set.add("Java");
		set.add("HTML");
		set.add("CSS");
		set.add("Python");
		set.add("MySQL");
		set.add("Java");
		System.out.println("set.size(): "+set.size());
	
		//����Ŀ ������
		//Iterater<E>	iterator()
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String val =it.next();
			System.out.println(val);
		}
		
		set.remove("CSS");
		System.out.println("set.size(): "+set.size());
		
		for(String str:set)
			System.out.println(str);
		
		//clear(),removeAll()
		set.clear();
		System.out.println("set.size(): "+set.size());
	}

}
