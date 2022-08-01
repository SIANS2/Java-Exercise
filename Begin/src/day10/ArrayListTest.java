package day10;
import java.util.*;
/*ArrayList�� java.util.List�迭
 * -Vector�� ����� ����
 * -�� ���ʹ� ��Ƽ �����尡 �����ϴ� ȯ���� �� ����ȭ�� �����Ǿ� �־�
 * �����̶� ���� ������ ��ü�� ���������� ����Ǵ� ���,
 * ArrayList�� ����ȭ�� �����Ǿ� ���� ����
 * 
 * LinkedList : List�迭
 * 	ArrayList�� ���������� ������ ������ �� ����. �߰��� ���� �Ǵ� ���� ==> �������� ����
 * */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList();
		//Object������ ����, ���� ������ �ڵ����� Ȯ���Ѵ�.
		arrList.add("����");
		arrList.add("�ݰ�����");
		arrList.add("^^");
		System.out.println("arrList.size():"+arrList.size());
		
		//Iterator<E> iterator() �̿��ؼ� ArrList�� ����� ��Ҹ� �Ѳ����� ����ϱ�
		Iterator<String> it=arrList.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		
		}
		
		String s2=arrList.get(2);
		System.out.println(s2);
		
		List<Integer> arrList2=Arrays.asList(40,10,20,50);
		
		//for, get �̿��ؼ� ����ϱ�
		for(int i=0;i<arrList2.size();i++) {
			System.out.println(arrList2.get(i));
		}
		
		//Collections.sort()�޼��带 �̿��ؼ� ����
		//Collections.sort(arrList2);<=�������� ����
		Collections.sort(arrList2, Collections.reverseOrder());//�������� ����
		
		
		System.out.println("===���� ����===");
		
		for(Integer val: arrList2) {
			System.out.println(val);
		}
		
		//arrList2.remove(0);<=���� �߻�
		arrList.remove(0);//��������
		System.out.println("===0���� ���� ����===");
		for(String val: arrList) {
			System.out.println(val);
		}
		//List<E>arr=new ArrayList<E>(); ==> ������ �÷���(������ �߰�, ���� ����)
		//List<E>arr=Arrays.asList(E,E,E...); ==>
	}

}
