package day05;
/*�⺻�ڷ��� (promotove type)
 * - ������ (������-byte, short, int, long, float, double)
 * - ������ (char)
 * - ���� (boolean:true,false)
 * ������(reference type) - Ŭ������, �������̽���, �迭
 * - String(���ڿ�)
 * String s=new String("Java")
 * String s2 = "Hello"
 * - Date
 * Date d=new Date()
 * - Scanner
 * Scanner sc=new Scanner(System.in)
 * 
 * if, if-else. if else if.....else
 * switch~case
 * for, while, do~while
 * */
public class ArrayTest {

	public static void main(String[] args) {
		System.out.println("1.----------------------");
		int a=1; //�⺻ �ڷ���-������
		int[] b;//������-�迭(1����)
		
		/*[1] ����
		 *[2] �޸� �Ҵ�
		 *[3] �ʱ�ȭ
		 * */
		
		//[1]���� 
		//int[] c;// int c[3] (x)
		int c []; // []�� ���� �� �ڷ� ����
		
		//[2]�޸� �Ҵ�=> �ݵ�� new������ �̿�
		c=new int[3];//�迭�� ũ�⸦ ���Ѵ�.
		
		//[3] �ʱ�ȭ
		// �̶� index�� 0���� �����Ѵ�.
		c[0]=10;
		c[1]=20;
		c[2]=30;
		System.out.println(c); // �迭�� �ּҰ��� ��� �Ѵ�.
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		
		System.out.println("2.----------------------");
		//[1][2]: ����� ���ÿ� �޸� �Ҵ�
		//[3] : �ʱ�ȭ
		double arr[]=new double[4];//[1] [2]
		//�迭�� �ʱ�ȭ ���� ������ ����Ʈ ���� ����Ǿ� �ִ�.
		System.out.println("arr[0]"+arr[0]);//0.0
		System.out.println("arr[3]"+arr[3]);//0.0
		arr[0]=.897;
		arr[1]=450e-2;
		arr[2]=0x12;
		arr[3]='A';
		
		for(int i=0;i<4;i++) {
			
			System.out.println("arr["+i+"]="+arr[i]);
			
		}//for-----
		//charŸ���� 1���� �迭�� �����ϰ�
		//�Ʒ��� ���� ���ڵ��� �����ϼ���
		//'J', 'a', 'v', 'a'
		//for������ �̿��ؼ� ����غ���
		
		char ch[]=new char[5];
		ch[0]='J';
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		//�迭�� ũ�⸦ �� �� �ִ� �Ӽ� : length
		System.out.println("ch.length="+ch.length);
		for(char j=0;j<5;j++)
			  {
			System.out.println
		(ch[j]);
			 }
		System.out.println("3.----------------------");
		//[1][2][3] �ܰ踦 �ѹ���
		//����� ���ÿ� �޸� �Ҵ��ϰ� �ʱⰪ ����
		char [] ch2= {'B','y','e'};
		System.out.println("ch2.length="+ch2.length);
		
		for(int i=0;i<ch2.length;i++) {
			System.out.print(ch2[i]);
			
		}
		
	}

}
