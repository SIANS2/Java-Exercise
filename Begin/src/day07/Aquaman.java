package day07;

public class Aquaman {
	String name;
	int height;
	double speed;//�ӵ�
	
	public Aquaman() { 
		this("����� ��", 187, 172.54);		
		/*name="����� ��";
		height=187;
		speed=172.54;*/

	}
	/*
	public Aquaman(String name) {
		this.name=name;
		height=187;
		speed=170;}/*/
	
	
	public Aquaman(String n,int h,double s) {
		name=n;
		height=h;
		speed=s;
	}
	
	
	
	/*�����ڸ� �������� ������ �����Ϸ��� �⺻������ ����Ʈ �����ڸ� �������ش�.
	 * �Ѱ��� �����ڸ� �����ϰ� ����, �����Ǵ� ����Ʈ �����ڴ� �������.
	 *���� �ϸ� �⺻�����ڸ� ������ �ڿ� �ٸ� �����ڸ� �����ϴ� ������ ������.
	 * */
	public String getInfo() {
		System.out.println("-----AQUA MAN-----");
		String info="�̸�: "+name+"\nŰ: "+height+"\n���ǵ�: "+speed+" km/h";
		return info;
	}
}
