package day09;
//final +���� :�� �Ҵ��� �� �� ���� ��
//			public static final�� �Բ�����Ѵ�.
class MyFinal{
	public final static int NONE=1; //���
						int x=2;
						
}
public class FinalTest3 {

	public static void main(String[] args) {
		//MyFinal�� x, NONE �������� ����ϼ���

		System.out.println(MyFinal.NONE);//static�� ���� ���� Ŭ�������� �տ� ������.
		
		MyFinal my=new MyFinal();
		System.out.println(my.x);
		
		my.x=20;
		System.out.println(my.x);
		
		//MyFinal.NONE=10;
		//System.out.println(MyFinal.NONE);
	}

}
