package day09;
//MyInter�� ��� �޾Ƽ� �������� �ʰ� ö�غ�����.
//�������̽��� implements�� ��ӹ޴´�.

//YourInter�� ��ӹ޾� �������� �ʰ� ó���� ������

public class MyClass implements MyInter, YourInter {//���� ��� ����
	@Override
	public void demo() {
		System.out.println("MyClass's demo()###");
	}

@Override
public int inter1() {
	return 100;
}

@Override
public void inter2(String str) {
	System.out.println(str.toUpperCase());
	
}

public static void main(String[]args) {
	//MyInter mi=new MyInter();
	//�������̽��� Ÿ�� ������ �� ��������
	//new�� ����Ͽ� ��ü ������ �� �� ����.
	MyInter mi = new MyClass();
	YourInter yi= new MyClass();
	
	//demo()
	mi.demo();
	//mi.inter1();[x]
	System.out.println(((MyClass)mi).inter1());
	
	int num=yi.inter1();
	System.out.println("num : "+num);
	yi.inter2("good afternoon");
	//inter1(
	//inter2()
	//PI����غ���
	System.out.println(YourInter.PI);
	System.out.println(MyClass.PI);
	//MyClass.PI=5.12;[x] final������ ���� �Ұ���
	System.out.println();

	
	}
}

