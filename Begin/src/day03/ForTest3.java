package day03;
//��ø for������
public class ForTest3 {

	public static void main(String[]args) {
		for(int i=2;i<4;i++) 
		{
			for(int k=1;k<3;k++)
			{
				
				System.out.println("i="+i+", k="+k);
				
			}//for---
			
			System.out.println("*******************");
			
		}//for------
		
		/*[����1] ��÷ for�������� �̿��ؼ� �Ʒ� ����� �ǵ��� �غ�����
		 * �ڡڡڡڡ�
		 * �ڡڡڡڡ�
		 * �ڡڡڡڡ�
		 * */
		for(int k=1;k<5;k++)
		{
			for(int i=1;i<6;i++)
			{
				System.out.print("��");
		}
			System.out.print("\n");
		}
	
		
		/*[����2] ��ø for������ �̿��ؼ� ������ ��ü�� �Ʒ� ���·� ����ϼ���.
		 * 2x1 = 2  3x1 = 3 ... 9x1 = 9
		 * 2x2 = 4  3x2 = 6 ... 9x2 = 18
		 * ...
		 * 2x9 = 18 3x9 = 27 
		 * */
		for(int i=1;i<10;i++) {//��������
			for(int k=2;k<10;k++) {
				System.out.print(k+"x"+i+"="+k*i+"\t");
			}//for---
			System.out.print("\n");
		}//for-----
		}
			
		
	}
