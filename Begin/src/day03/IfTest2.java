package day03;
//java.util.Scanner Ŭ������ �̿��ؼ� �Է� �޾ƺ���.
import java.util.Scanner;
/* if(���ǽ�){
 * 	���๮;
 * } else{
 * 	���๮;
 * }
 * */
public class IfTest2 {

	public static void main(String[] args) {
		//Scanner : Ŭ������ (������) => new �����ڸ� �̿��ؼ� ��ü�� �����ؼ� ����ؾ� �Ѵ�.
		Scanner sc=new Scanner(System.in);
		//System.out : ���
		//System.in : �Է�
		
		System.out.println("������ �Է��ϼ���=>");
		int input = sc.nextInt(); //������ �Է¹޾Ƽ� ����ڰ� �Է��� ���� ��ȯ�Ѵ�.
					//nextfloat(), nextdouble(), nextlong()
		System.out.println("input: "+input);
		
		//input���� ¦���̸� "¦���Դϴ�."�� ����ϴ� ������ if������ �ۼ��غ�����.
		if (input%2==0) {
			System.out.println(input+"�� ¦���Դϴ�.");
		} else {
			System.out.println(input+"�� Ȧ���Դϴ�.");
		}
		System.out.println("The End~~~~~");//���ǰ� ������� ����
	}

}
