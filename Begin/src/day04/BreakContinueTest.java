package day04;
/*������� : break, continue => �ܵ����δ� ��� �Ұ�, ������� �Բ� �����
 * */
public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println(".-----------------------");
		//����� �����ϱ�
		for(int i=0;i<3;i++) {
			if(i==1)
				break;//���� ����� �ݺ����� �����.
			System.out.println("i= "+i);
		}//for--------
		
		System.out.println("2.----------------------");
		//����� �����ϱ�
		for(int i=0;i<3;i++) {
			if(i==1)
				continue;
			System.out.println("i= "+i);
		}///for-------

		System.out.println("3.----------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;
				System.out.println("3."+"i= "+i+", k="+k);
			}
		}
		System.out.println("4.----------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;
				System.out.println("i= "+i+", k="+k);
			}
		}
		
		System.out.println("5.----------------------");
		outer: //label => �ݺ��� �տ��� ���� �� �ִ�.
		for(int i=0;i<3;i++) {
			inner :
			for(int k=0;k<3;k++) {
				if(k==1) break outer;
				System.out.println("i= "+i+", k="+k);
			}//
		}
		
		System.out.println("6.----------------------");
		outer:
		for(int i=0;i<3;i++) {
			inner :
			for(int k=0;k<3;k++) {
				if(k==1) continue outer;
				System.out.println("i= "+i+", k="+k);
			}//
		}
		//while for if ����Ͽ� �����.
		System.out.println("1�� 100������ ���� �Է��ϼ��� :");//random ���
		
		//System.out.println("�� ū ���� �Է��ϼ���.")
		//System.out.println("�� ���� ���� �Է��ϼ���.")
		//System.out.println("������ϴ�.")
		//System.out.println("�õ� Ƚ���� "++""���Դϴ�.")
		
	}//main--------------------------

}//class----------------------------------------------
