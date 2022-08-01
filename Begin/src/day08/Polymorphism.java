package day08;
// Polymorphism : ������
public class Polymorphism {

	public static void main(String[] args) {
		
		Human h1=new Human("��ö��",171);
		System.out.println(h1.getInfo());
		
		Superman s1=new Superman("�̼Ҷ�",170,600);
		System.out.println(s1.getInfo("---���۸� ����---"));
		
		Aquaman a1=new Aquaman("�ξ����",155,200);
		System.out.println(a1.getInfo());
		
		//�θ� �ڽ��� ��Ӱ��谡 ���� ���
		//�θ�Ÿ�� ��������= new �ڽ� ��ü();
		/* -�θ�Ÿ���� ������ �����ϰ� ��ü�� �ڽİ�ü�� �����ϴ� ���� ���� �ϴ� ==> ������
		 * 
		 * - �̷� ��� �θ�Ÿ���� ���������� ���� �� �� �ִ� ������ �޼ҵ�� ������ �ִ�.
		 *	[1] �θ�� ���� �������� ������ �޼ҵ�� ���� ���� �ϴ�.
		 *	[2] �ڽĸ� ���� ������ ������ �����Ҽ� ����.
		 *	[3] ��, �������̵��� �޼ҵ尡 ���� ���� �ڽ��� ���� �켱 �����Ѵ�. 
		 * */
		
		Human hs=new Superman("������",175,300);
		System.out.println("hs.name: "+hs.name);
		System.out.println("hs.height: "+hs.height);
		//System.out.println("hs.power: "+hs.power);
		System.out.println(hs.getInfo());
		//�������� �޼ҵ��� ��� hs�� ȣ���ϸ� �ڽ��� ���� �켱����
		
		
		System.out.println("s1.power: "+s1.power);
		
		System.out.println("((Superman)hs).power: "+((Superman)hs).power);//hs�� �θ�Ÿ��
		
		//�θ��ڽ��� ��Ӱ��谡 ���� ��� ����ȯ�� �����ϴ�.
		
		
		//Superman sm=new Human();//[x]
		//Human hm=new String("Hello");//[x]
		
		//hs���������� "@@@���۸� ����@@@" ������ ���� getInfo()ȣ���ؼ� ������ ����غ���
		String info = ((Superman)hs).getInfo("@@@���۸� ����@@@");
		System.out.println(info);
		
		//[����1]
		System.out.println("---------------");
		//HumanŸ�� ���� ���� ha, Aquaman ��ü�� �����ϼ���
		//getInfo()ȣ���ϱ�
		//name,height,speed ���� ����غ���
		Human ha=new Aquaman("�����",50,30.25);
		System.out.println(ha.getInfo());
		System.out.println("ha.name: "+ha.name);
		System.out.println("ha.height: "+ha.height);
		System.out.println("ha.speed: "+((Aquaman)ha).speed);
		
		
		//[����2] h1,s1,a1,hs,ha ��ü���� ������ �迭�� �����ϰ�,
		//������ �ڿ� for�������� �̿��ؼ� �迭�� ����� ��ü���� ������ ����ϼ���.
		System.out.println("---------------");
		Human [] arr = {h1,s1,a1,hs,ha};
		//arr[i] : Human�迭�� ��ü��
		//instanceof �����ڸ� �̿��ϸ� ���������� � Ŭ������ ��ü ���� �� �� �ִ�.
		//�������� instanceof Ŭ������ : ���������� Ŭ������ ��ü�̸� true�� ��ȯ,
		//							�ƴϸ� false�� ��ȯ
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] instanceof Superman) {
				System.out.println(((Superman)arr[i]).getInfo("##���۸� ����##"));
			}else {
			System.out.println(arr[i].getInfo());
			}

		}
	}
}
