package day10;
import java.util.*;

import javax.swing.JButton;
public class VectorTest {
/*Java Collection Framework
 * 	- Collection : ��ü�� �����ؼ� �����ϴ� ����
 *  - Framework : ������� �̸� ���س��� ���̺귯���� �ǹ�
 *  - Vector, ArrayList, Hashtable, HashMap, HzchSet,TreeSet...
 *  # Vector
 *  - List�迭
 *  - �Է� ������ ����Ѵ�
 *  - ������ �ߺ����� ����
 *  - ���� Ŭ���� : ArrayList
 * 
 * */
	public static void main(String[] args) {
		//jdk-1.4 ��������
		//Vector v= new Vector();//�ʱ�뷮 : 10��, �������� 2��� ��������� �ø���.	
		
		//�����͸� ���� �Ҷ��� add(), addEliment�� ���
		//����Ʈ�� ���� ���� Object get(int index), Object elementAt(int index)
		Vector v =new Vector(5,3);//5:�ʱ�뷮, 3:����ġ
		System.out.println("���� v�� ���� �뷮: "+v.capacity());
		System.out.println("���� v�� ���� ũ��: "+v.size());//<=� �����ߴ��� �� �� ����.
		
		//Vector�� ������ ���� add�� ����Ѵ�. object�����̸� ��� ������ �� �ִ�.
		v.add("Hello");
		v.add(new Integer(20));
		v.add(Integer.valueOf(22));//<=static �޼ҵ�
		v.add(3.14);//double�� ���� �Ǵ� ���� �ƴ϶� Double -> Wrapper class�� 
					//auto boxing�Ǿ ����ȴ�.
		
		System.out.println("���� v�� ���� �뷮2: "+v.capacity());
		System.out.println("���� v�� ���� ũ��2: "+v.size());
		
		v.add(new Object());
		v.add(new javax.swing.JButton("ok"));
		
		System.out.println("���� v�� ���� �뷮3: "+v.capacity());
		System.out.println("���� v�� ���� ũ��3: "+v.size());
	
		//Object obj=v.get(0);
		String obj=(String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Double dbl=(Double)v.get(3);
		System.out.println(dbl);
		
		JButton str=(JButton)v.get(5);
		System.out.println(str);//str.toString()
		//jdk5.0���� ���� Generic�� �����
		//vector�� ������ �� � ������ �����ϰڴ� ��� ���� ��ü�� �����Ѵ�.
		Vector<String> v2=new Vector<>(); // <=�̷������� <String>ó�� ���´�
		//7.0 ���ĺ��ʹ� <String>�� �������� �������൵ �ȴ�.
		v2.add(new String("java"));
		v2.add(Integer.valueOf(5).toString());
		
		String s2=v2.get(0);//���ʸ��� �̿��ϸ� ����ȯ�� �ʿ��ϴ�
		System.out.println(s2.toLowerCase());
		
		//[1] for���� �̿��ؼ� v2�� ����� ��ü�� ����ϱ�
		for(int i=0; i<2;i++) {
			System.out.print(v2.get(i)+" ");
		} System.out.println();

		//[2] float ������ ������ ���� v3�� �����ϰ�
		//	  float��ü 3�� �̻� �����ϵ�
		// 	  Ȯ�� for������ �̿��ؼ� v3�� ����� ������ �԰踦 ���� ����ϱ�
		Vector<Float> v3 =new Vector<>();
		v3.add(1.24f);
		v3.add(9.12f);
		v3.add(Float.valueOf(5));
		
		float sum =0;
		for(float i:v3)//auto unboxing 
			sum+=i;
			
		System.out.println("��="+ sum);
	}

}
