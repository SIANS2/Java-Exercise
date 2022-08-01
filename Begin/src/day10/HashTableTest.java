package day10;
/*Map�迭- Hashtable, HashMap, Properties
 * - Object������ ������ �� ������
 * - key�� value�� �����Ͽ� �����Ѵ�.
 * - �����Ͱ� 75% ���� �ڵ����� ���� ������ Ȯ���Ѵ�.
 * - key���� �ߺ��� ������� �ʴ´�.
 * - ������
 * - ������ ����: Object put(Object key, Object val)
 * - ������ ����: Object get(Object key) 
 * */
import java.util.*;
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> h1=new Hashtable<>();
	//key:Strimg, value :Integer
	h1.put("����",2012);
	h1.put("����", Integer.valueOf(20));
	h1.put("����", 5000);
	h1.put("����", 30);//key���� �ߺ��Ǿ �ȵȴ�. ���߿� ������ ������ ��������.
	//Map�迭�� �˻��� ���� �ϴ�
	
	Integer age=h1.get("����");
	System.out.println(age+"��");
	System.out.println("h1.size(): "+h1.size());
	//Enumeration<K> 	Keys() : key���鸸 Enumeration��ü�� ��ȯ��
	//key ���� �����ؼ� ����� �� , value�� ���� ����� ������
	Enumeration<String> en=h1.keys();
			for(;en.hasMoreElements();) {
				String key=en.nextElement();
				System.out.println(key+">>"+h1.get(key));
			}
	
	//Set<K>	keySet() : key���鸸 Set��ü�� ��ȯ
	Set<String> set=h1.keySet();
	for(String ky:set) {
		System.out.println(ky);
	}
	//Collection<V>  values() : value ���鸸 ��ȯ
	Collection <Integer> cl= h1.values();
	for(Integer val:cl) {
		System.out.println(val);
	}//for ---
	
	//boolean	containsKey(Object key): key���� �����ϰ� ������ true
	//boolean	containsValue(Object value)
	
	System.out.println(h1.containsKey("����"));
	System.out.println(h1.containsValue(2013));

}//main--

}
	