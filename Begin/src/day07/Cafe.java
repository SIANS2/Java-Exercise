package day07;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine();
		//cm.coffee=2;
		cm.setCoffee(2);
		cm.setSugar(3);
		cm.cream=1;
		
		System.out.println("커피: "+cm.getCoffee());
		System.out.println("커피: "+cm.getSugar());
		System.out.println("커피: "+cm.cream);
	}

}
