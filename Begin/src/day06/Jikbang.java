package day06;
//�ε��� ���� ��
//��ü : ��, �߰���, �ŵ���, �ż���, �Ӵ���...
//�߻�ȭ : ���Ǽ��Կ� �����ϴ� ��ü�� ���α׷� ����� ǥ���ϴ°�
//Ŭ������ :House
//		 �Ӽ�(has a) : ���ǰ���, �ּ�, ������...
//		 ���(����) :�󸶿� ���� ����, �󸶿� �ŵ��ϴ�, ~�� ��ġ�ϴ�,
public class Jikbang {

	public static void main(String[] args) {
		//��ü 2�� �����ؼ� ���� �Ӽ����� �ְ�
		//�޼ҵ� ���� ȣ���غ���(showInfo(), existAt(), XXX())
		House h1=new House(); // ��ü ����
		
		House h2=new House();
		
		h1.showInfo();
		
		h2.showInfo();
		
		h1.owner="ȫ�浿";
		h1.room=2;
		h1.addr="�λ�� �ؿ�뱸";
		
		h2.owner="�迵��";
		h2.room=5;
		h2.addr="�λ�� ������";
		
		h1.showInfo();
		h2.showInfo();
		
		String s1=h1.existAt(100);
		
		String s2=h2.existAt(200);
		
		System.out.println(s1);
		System.out.println(s2);
				
		//rent()�޼ҵ� ȣ���غ���
		h1.rent("�Ÿ�", 8000);
		h1.rent("����", 5000);
		
	}

}
