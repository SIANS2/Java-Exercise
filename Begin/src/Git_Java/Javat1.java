package Git_Java;
import java.util.Scanner;
public class Javat1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�г��� �Է��ϼ���(1~4)");
		int grade = sc.nextInt();
		
		System.out.println("������ �Է��ϼ���(0~100)");
		int score = sc.nextInt();
		
		if(score>=60) {
			if(grade !=4) 
				System.out.println("�հ�!");
			else if(score>=70)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!");
		}
		else
			System.out.println("�հ�!");
		
	}

}
