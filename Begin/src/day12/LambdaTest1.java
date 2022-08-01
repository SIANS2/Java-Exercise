package day12;


/* �Ű����� 2���� �޾Ƽ� �� ����ū���� ��ȯ�ϴ� �Լ��� ���ٽ����� �����غ���.
 * [1] ���ٽ� �����ϱ� ���ؼ��� ���� �������̽��� ������ �Ѵ�.
 * [2] �������̽��� ���ٽ����� ������ �Ӽ��带 �����Ѵ�.
 * */
@FunctionalInterface
interface MyNum{
	int getMax(int a, int b);
	//�߻�޼���� �ϳ��� �����ؾ� �Ѵ�.
	//int getMin(int a, int b);[x]
}///////////////////


public class LambdaTest1 {

	public static void main(String[] args) {
		MyNum m1= (int x, int y)->{
			if(x>=y) {
				return x;
			}else {
				return y;
			}
		};
		System.out.println(m1.getMax(55, 77));
		System.out.println(m1.getMax(-2, 0));
		
		MyNum m2=(a, b)-> (a>=b)? a: b;
		System.out.println(m2.getMax(71, 90));
	}

}
