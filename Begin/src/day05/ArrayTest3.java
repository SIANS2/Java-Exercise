package day05;

public class ArrayTest3 {

	public static void main(String[] args) {
		System.out.println("1.----------------------");
		int a[];
		a=new int[3];
		a[0]=90;
		a[1]=80;
		a[2]=70;
		
		int[] b;
		b=a;
		/*a�� ����Ű�� �迭�� b�� ���� ����Ű�� ���°� �ȴ�.
		 * int a[]------------->|90|80|70|
		 * 
		 * int b[]------------->|90|80|70|
		 * */
		//b�� for�������� �̿��ؼ� ����� ���� ����ϼ���
		for (int i=0;i<3;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		//a�� â���ϴ� �迭�� b�� ���� â���ϴ� ���°� �ǹǷ�,
		//���� �ϳ��� �����͸� �����ϸ� ���� ���� �ȴ�.
		b[0]=100;//������ ����
		System.out.println("b[0]="+b[0]);
		System.out.println("b[0]="+a[0]);
		
		System.out.println("2.----------------------");
		
		int []x= {1,2,3,4};
		int y[]= {10,20};
		int tmp[];//����
		//x,y���� ���� �ٲ� ������
		tmp=x;
		x=y;
		y=tmp;
		for(int i=0;i<x.length;i++) {
			System.out.println("x[i]="+x[i]);
		}
		for(int i=0;i<y.length;i++) {
			System.out.println("y[i]="+y[i]);
		}
		System.out.println("2.----------------------");
		//�������� �迭 - String, Date, Scanner, Object ...
		String[] arr=null;//[1] ����
		System.out.println(arr);
		
		arr=new String[4];//[2] �޸� �Ҵ�
		System.out.println("arr[0]="+arr[0]);
		
		//[3] �ʱ�ȭ
		arr[0]="Hello";
		arr[1]=new String("Hi");
		arr[2]=3+"5";
		arr[3]="";//���ڿ�   char ch+' '
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("***********");
		//Ȯ�� for����, ������ for����, for each����...
		/*for(���� ����: �ڷᱸ��)
		 * {
		 * 		���๮:
		 * }
		 * �˾Ƽ� �ڷᱸ���� ũ��(length)��ŭ �ݺ��� ���鼭
		 * �ڷᱸ���� ����� ���� ������ �Ҵ��Ѵ�.
		 * */
		for(String s: arr) {
			System.out.println(s.toUpperCase());//toLowercase()
			//System.out.println("s: "+s);
		}
		
		String str[] = {"�ȳ��ϼ���","�ݰ����ϴ�","�߰�����~~~"};
		//Ȯ�� for=���� ������ str�� ����� ���� ����ϼ���.
		for(String k: str) {
			System.out.println(k);
			
		}

	}

}
