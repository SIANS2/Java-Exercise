package day05;
import java.util.*;
public class Test2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int[] coinUnit = {500,100,50,10};
		
		System.out.println("������ �ִ� ���� �Է��ϼ���.");
		int money =sc.nextInt();
		System.out.println(money+"��");
		
		for(int i=0;i<coinUnit.length;i++) {
			int su=money/coinUnit[i];
			System.out.println(coinUnit[i]+"��: "+su);
			money=money%coinUnit[i];
		}
		
		
	}
}
