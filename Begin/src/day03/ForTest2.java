package day03;
/*[����1]for�������� �̿��Ͽ� ������ 7���� �Ʒ� �������� ����ϼ���.
 * 7 *1 =7
 * 7 *2 =14
 * ...
 * 7 *9 =63
 * 
 * */
public class ForTest2 {
	
	public static void main(String[] args) {
		int dan=7;
		int no=0;
		for(no=1;no<=9;no++) {
			System.out.println(dan+"x"+no+"="+dan*no);
			
		}
	//[����2] 1 ~ 10������ ���� ���� ����ϼ��� -for�̿�
			int sum =0;
			for(int a=1;a<11;a++) {
				//sum +=a;
				sum= sum+a;
				}
			System.out.println("1 ~ 10 ������ ��="+ sum);
			
		
	//[����3] 1 ~ 10������ ���� ���� ����ϼ���
			int sum2 =0;
			int gop=1;
			for(int a=1;a<11;a++) {
				//gop=gop*a;
				gop = gop*a;
			}
				System.out.println("1 ~ 10 ������ ��="+ gop);
			
	//[����4] 1 ~ 100������ �� �� ¦������ ���� ���� ����ϼ���
			int sum1=0;
			for(int c=1;c<101;c++) {
				if(c%2 == 0)
					sum1=sum1+c;
			}
			System.out.println("1~100������ �� �� ¦������ ��: "+sum1);
			
			int summ=0;
			for(int c=0;c<101;c+=2) {
				summ+=c;
			}
			System.out.println("1~100������ �� �� ¦������ ��: "+summ);

	//[����5] 1 ~ 100������ �� �� 17�� ������ �������� ���� ����ϼ���
			for(int c=1;c<101;c++) {
				if(c%17==0)
					System.out.println(c);
			}
			
	//[����6] �빮�� ���ĺ�[A~Z]�� for �̿��ؼ� ����ϼ���
		for(int a=65;a<91;a++) {
			System.out.print((char)a+", ");
		}
		System.out.println();//�ٹٲ�

		for(char d='A';d<='Z';d++) {
			System.out.print(d+" ,");
		}
		
		
		
	
	}

}
