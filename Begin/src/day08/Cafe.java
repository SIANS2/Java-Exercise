package day08;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine();
		
		String s=cm.makeTea(1,2,3);
		System.out.println(s);
		System.out.println(cm.makeTea(2, 2, 4));
		
		//����Ŀ��
		cm.makeTea(2,1);
		
		//��Ŀ��
		cm.makeTea(1);
		
		//ũ��Ŀ��
		cm.makeTea(2,(short)3);
		
	
		//������
		Yuja x=new Yuja();
		//x.yuja=3 [x]
		x.setYuja(3);
		x.setSugar(3);
		cm.makeTea(x);

		
	}

}
