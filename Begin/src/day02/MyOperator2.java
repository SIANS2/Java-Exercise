package day02;

public class MyOperator2 {

	public static void main(String[] args) {
		System.out.println("4. ��Ʈ������ : &, |, ^");
		// �������� ���Ǵ� ������
		// & (and������) : �� ��Ʈ�� 1�϶��� 1
		// | (or������) : �� ��Ʈ �� �Ѱ��� 1�̸� 1, ��� 0�̸� 0
		// ^ (xor������) : �� ��Ʈ�� ���� �ٸ��� 1, ������ 0
		
		int x=3;  //0011
		int y=5;  //0101
			
		System.out.println("x&y="+(x&y));
				//  0001 => 1
		System.out.println("x|y="+(x|y));
		        //  0111 => 7
		System.out.println("x^y="+(x^y));
				//  0110 => 6
		
		System.out.println("5. �������� : &, &&, |, ||");
		int a=5;
		int b=6;
		if((a>b)&(a>0)) {
			System.out.println("Hello");
		} else if((b>a)|(b<0)) {
			System.out.println("Hi");
		}
		
		
		/*
		
		1) &, &&
		2) |, ||

		&, | �� ���: &,| �����ڸ� ����ϸ� ���� �������� �����
					     �� �� �־ ���� ������� ���Ѵ�.
        &&,|| �� ���:  ���� �������� ����� �� �� ���� ���
							���� ������ �������� �ʴ´�.
							���� ��� &&�� ���, ���� �������� false�̸�
							���� ������ ����.
							||�� ��� ���� �������� true�̸� ���� ������ ����
		*/
		
		//[����1]
		int i=1;
		int j=i++;//j=1 , i=2
		if((i>++j) & (i++ ==j)) {
			i=i+j;
		}
		System.out.println("i="+i); 
		// i =3
		
		//[����2]
		int k=0;
		int p=1;
		if ((k++ ==0)|(p++ ==2)) {
			k=42;
		}
		System.out.println("k="+k+", p="+p);
		//k= 42, p=2
		
		//[����3]
		boolean r=false;
		boolean e=false;
		boolean w=((r=true)||(e=true));
		System.out.println(r+", "+e+", "+w);
		//= �� ���� ������ �̴�.
				
	}

}
