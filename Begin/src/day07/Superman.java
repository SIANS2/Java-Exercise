package day07;

public class Superman {
	String name;
	int height;
	String power;//�ʴɷ�
	//�⺻������
	public Superman() { 
		this("���۸�",190,"flying");
		//this() : �ڱ��ڽ��� �����ڸ� ȣ���� �� ����Ѵ�.
		//			������ �ȿ����� ȣǮ�� �� ������,
		//			���� ù��° �����̿��� �Ѵ�.
		/*name="���۸�";
		height=190;
		power="flying";*/
	}
	//���� ������ 3�� ���弼��
	
	public Superman(String name) {
		/*this.name=name;
		height=190;
		power="flying";*/
		this(name,190,"flying");
	}
	
	public Superman(String name,int height) {
		/*this.name=name;
		this.height=height;
		power="flying";*/
		this(name,height,"flying");
	}
	
	//target : ���⼭ �ʱ�ȭ�� ����
	public Superman(String name,int height,String power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public String getInfo() {
		System.out.println("-----SUPER MAN-----");
		String info="�̸�: "+name+"\nŰ: "+height+"\n�ʴɷ�: "+power;
		return info;
	}



	
}//class/////////////////////
