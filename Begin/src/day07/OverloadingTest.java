package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		//���۸� ��ü 2�� �����ѵ� getIFo() ȣ���ؼ� ���� ����ϱ�
		Superman s1=new Superman();
		System.out.println("���۸� �̸�: "+s1.name);
		System.out.println("���۸� Ű: "+s1.height);
		System.out.println("���۸� �ʴɷ�: "+s1.power);
		
		Superman s2=new Superman();
		System.out.println(s2.getInfo());
		
		
		//����Ƹ� ��ü1�� ������ �� getIfo()ȣ���ؼ� ���� ����ϱ�
		Aquaman a1=new Aquaman();
		System.out.println(a1.getInfo());
		
		/*���۸� ��ü4���� �迭�� �����ϼ���.
		 * �׷��� for���� �̿��ؼ� ���۸ǵ��� ������ ����ϼ���.
		 * */
		Superman s3=new Superman();
		System.out.println(s3.getInfo());
		
		Superman s4=new Superman();
		System.out.println(s4.getInfo());
		
		Superman s5=new Superman();
		System.out.println(s5.getInfo());
		
		Superman s6=new Superman();
		System.out.println(s6.getInfo());
		
		Superman arr[] = {s3,s4,s5,s6};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getInfo());
		}
	}
}
