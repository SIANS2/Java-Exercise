package day08;

/*/��Ӽ� :Inheritance
 * �θ� Ŭ����
 * 
 * �ڽ� Ŭ���� extends �θ� Ŭ����
 * => �θ�Ŭ������ ���� �ɹ�����, �޼ҵ带 �ڽ� Ŭ�����ּ� �״�� �����޾� �� �� �ִ�.
 * ����� "is a" ���谡 �����ؾ� �Ѵ�.
 * �ڹٴ� 1���� Ŭ������ ��ӹ��� �� �ִ�.(���� ���)
 * C++ (���߻��  ����)
 * */
public class Inheritance {

	public static void main(String[] args) {
		Human h1=new Human("ȫ�浿",177);
		
		//h1�� ��������ϱ�=> getInfo()
		String s=h1.getInfo();
		System.out.println(s);
		
		//���۸� ��ü �����ؼ� �̸�, Ű, �ʴɷ°��� �Ҵ��ϰ�
		//���� ����ϱ� => getInfo()
		Superman s1=new Superman();
		s1.name="�轴��";
		s1.height=180;
		s1.power=500;
		
		System.out.println(s1.getInfo());
		
		
		//����Ƹ� ��ü �����ؼ� �̸�, Ű, �ʴɷ°��� �Ҵ��ϰ�
		//���� ����ϱ� => getInfo()
		Aquaman a1=new Aquaman();
		a1.name="����";
		a1.height=140;
		a1.speed=87.123;
		
		System.out.println(a1.getInfo());
		
		//���۸� ��ü 1�� �� �����ؼ� �̸�, Ű, �ʴɷ� �ְ�
		//������ ���� ���۸� ���� ����ϱ�
		System.out.println("-----���۸� ����-----");
		
		Superman s2=new Superman();
		s2.name="�ʰ���";
		s2.height=190;
		s2.power=550;
		
		System.out.println(s2.getInfo());
		
		//������ ���� ���۸� ���� ����ϱ� => �ʴɷ��� 100 �����ؼ� ����ϱ�
		System.out.println("-----���۸� ����-----");
		Superman s3=new Superman("������",250,1000);
		s3.getInfo("---���۸� �Ŀ���---",1000);
	}

}
