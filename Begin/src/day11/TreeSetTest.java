package day11;
import java.util.*;
public class TreeSetTest {
/* TreeSet
 * - �߰��� �����͵��� ���ĵȴ�.
 * - ������ �ߺ��� ��������ʴ´�.
 * - ���������� ���� Ʈ���� ����� �����͸� �����ϰ� ������.
 * */
	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<>();
		tree.add("ȫ�浿");
		tree.add("�谨��");
		tree.add("��ö��");
		tree.add("�̼���");
		tree.add("�����");
		tree.add("ȫ�浿");//<<������ �ߺ� ��� x
		
		System.out.println("tree.size(): "+tree.size());
		
		//Ȯ�� for���������� ����غ���
		for(String s:tree) 
			System.out.println(s);

	}
}
