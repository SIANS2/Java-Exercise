package day03;
import java.util.Scanner;
public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� ������ �Է��ϼ���.=>");
		float score = sc.nextFloat();
		System.out.println("�������: "+score);
		char hak=' ';
		//��������(local variable)�� �ݵ�� �ʱⰪ�� �ְ� ����ؾ� �Ѵ�.
		if(score>=80 && score <90) {
			hak='B';
		} else if(score>=90 && score<=100){
			hak='A';
		} else if(score>=70 && score<=80){
			hak='C';
		}else if(score>=60 && score<=70){
			hak='D';
		}else{
			hak='F';
		}
		
		System.out.println("����: "+hak);
		/*100 ~ 90 : A
		 * 80 ~ 89.xxx : B
		 * 70 ~ 79.xxx : C
		 * 60 ~ : D
		 * 60�̸� : F
		 * ���� if���� �̿��ؼ� �ۼ��� ������.
		 * if(���ǽ�1){
		 * 
		 * }else if(���ǽ�2){
		 * 
		 * }else if(���ǽ�3){
		 * 
		 * }else{
		 * 
		 * }
		 * */		
		
	}

}
