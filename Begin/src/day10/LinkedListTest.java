package day10;
import java.util.*;
/*LinkedList : ���� ������ ��ũ�ؼ� ü��ó�� �����ϴ� �÷���
 * 				�����͸� ������ �� ���÷� �����͸� �����ϰų� ����, �����ؾ� �� ��� ����
 * ArrayList : ���������� �����͸� ������ �� ������, �˻��� �� ��������� ����
 * */
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		//ArrayList ������ 1������ ���� �� ����ð� ����

	long startTime = System.nanoTime();
	for (int i=0;i<10000;i++){
		list1.add(0,"Hello "+i);
	}
	long endTime=System.nanoTime();
	
	long gapTime=endTime-startTime;
	System.out.println("***ArrayList �ɸ� �ð�: "+gapTime+" ns");
	System.out.println("list1.size : "+ list1.size());
	System.out.println("****************************************** ");
	
	
	startTime = System.nanoTime();
	for(int i=0;i<10000;i++) { 
		list2.add(0,"Hello "+i);
	}
	endTime =System.nanoTime();
	gapTime=endTime-startTime;
	System.out.println("***LinkedList �ɸ� �ð�: "+gapTime+" ns");
	/**
	 * 				���������� �߰�, ����  |�߰��� ����, ����    |����
	 * ArrayList	������			   ������				������
	 * LinkedList	������			   ������				������
	 * **/
	
	}

}
