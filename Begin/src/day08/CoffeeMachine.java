package day08;

public class CoffeeMachine {
	int coffee, sugar, cream;
	private Yuja yj;
	/* �޼ҵ� �����ε�(��������)
	 * - �޼ҵ� �̸��� ���� �ϰ�
	 * - �Ű������� �ڷ����� �ٸ��ų�, ������ �ٸ��ų�, ������ �ٸ���
	 * - ��ȯŸ���� ���Ƶ� �ǰ� �޶� �ȴ�.
	 * */
	//��ũĿ��, ��Ŀ��, ũ��Ŀ��, ����Ŀ�� �����///> �޼ҵ�
	public void makeTea(int coffee) {
		this.coffee=coffee;
		System.out.println("��Ŀ�� ������~~~ ��: "+this.coffee);
	}
	public void makeTea(int coffee,int sugar) {
		this.coffee=coffee;
		this.sugar=sugar;
		int n= this.coffee+this.sugar;
		System.out.println("���� Ŀ�� ������~~~ ��: "+n);
	}
	public String makeTea(int coffee,int sugar,int cream) {
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		String s="��ũ Ŀ�� ������~~~ �� : "+(this.coffee+this.sugar+this.cream);
		return s;
	}
	public void makeTea(int coffee,short cream){
		this.coffee=coffee;
		this.cream=cream;
		int c= this.coffee+this.cream;
		System.out.println("ũ�� Ŀ�� ������~~~ ��: "+c);
	}
	public int makeTea(short cream,int coffee) {
		this.makeTea(coffee,cream);//this.�޼ҵ�() : �ڱ��ڽ��� �޼ҵ带 ȣ���� �� ���
	
		return (this.coffee+this.cream);
	}
	//������ ����� �޼ҵ�
	public void makeTea(Yuja y) {
		this.yj=y;
		System.out.println("[�Ÿ޴�] ������ ������~~~");
		System.out.println("����: "+yj.getYuja());
		System.out.println("����: "+yj.getSugar());
	}
}
