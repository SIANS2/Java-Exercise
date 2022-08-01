package day05;

public class ArrayTest4 {

	public static void main(String[] args) {
		//2���� �迭
		//[1] ���� 
		//int [][]a;
		//int a[][];
		int []a[];
		
		//[2] �޸� �Ҵ� =>3�� 2��
		a=new int[3][2];
		
		//[3] �ʱ�ȭ
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println("a[1][1]="+a[1][1]);
		//for������ ��ø�ؼ� �迭 a�� ����� ���� ����ϼ���.
		
		System.out.println("**********");
		//���� ũ�� : a.length
		//���� ũ�� : a[1].length
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[1].length;j++) {
				System.out.print("a["+i+"]"+"["+j+"]="+a[i][j]+"	");
			}
			System.out.println();
		}
		System.out.println("a.length= "+a.length);
		System.out.println("a[0].length= "+a[0].length);
		System.out.println("a[1].length= "+a[1].length);
		System.out.println("a[2].length= "+a[2].length);
		
		//�迭a�� ����� ���� ����ϵ� Ȯ�� for�������� �̿��� ����� ������
		
		for(int aa[] : a)
		{
			for(int aaa : aa)
				System.out.print(aaa+" ");
			System.out.println();
		}
/*	2���� �迭���� a�� �����ϴ� ���� ��
 * 	a ------->��| a[0] | a[1] | a[2] |
 * 
 * 				   | 
 * 				   ��
 * 				   |a[0][0] | a[0][1]|
 * */
		System.out.println("2.----------------");
		//���� ũ�⸸ ���� ��Ƴ���, ���� ũ�⸦ ���߿� ���������� �Ҵ��� �� �ִ�.
		char[][]ch=new char[3][];
		ch[0]=new char[2];//2��
		ch[1]=new char[4];//4��
		ch[2]=new char[3];//3��
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		
		ch[2][0]='B';
		ch[2][1]='y';
		ch[2][2]='e';
		
		
		//for���� �̿��ؼ� ch�� ����� ���� ����ϼ���
		for(int n=0;n<ch.length;n++) {
			for(int w=0;w<ch[n].length;w++) {
				System.out.println("ch["+n+"]"+"["+w+"]="+ch[n][w]);
				
			}
		
		}
		 
		for(char[] c:ch) {
			for(char x:c) {
				System.out.print(x);
			}
			System.out.print(" ");
		}
		System.out.println("\n3.------------------");
		
		//2���� �迭 :  ����� ���ÿ� �޸� �Ҵ��ϰ� �ʱ�ȭ
		float[]brr[]= {{0.5f,20.1f},{010,011,017},{10,'B'}};
		System.out.println("brr.length: "+brr.length);
		
		for(float[] f:brr) {
			for(float y:f) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//double ������ 3���� �迭�� ����� ���ÿ� �޸��Ҵ��ϰ� �ʱ�ȭ �ϼ���.
		double[]drr[][]= {{{1,2,3},{'a'}},{{10,20}}};
		for(int g=0;g<drr.length;g++) {
			for(int s=0;s<drr[g].length;s++) {
				for(int f=0;f<drr[s].length;f++) {
					System.out.println(drr[g][s][f]);
				}
			}
		}
		
		
		
	}//main=========

}
