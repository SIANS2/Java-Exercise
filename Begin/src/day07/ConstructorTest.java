package day07;

public class ConstructorTest {

	public static void main(String[] args) {
		//Person ��ü 1�� �����ϰ� �̸�,���� ����ϱ�
		Person p1=new Person();
		System.out.println("p1.name: " +p1.name);
		System.out.println("p1.age: " +p1.age);

		//Person ��ü 1�� �� �����ϵ� ���� ������ ȣ���ؼ� ������ �� �̸�, ���� ����ϱ�
		Person p2 =new Person("����ȣ");
		System.out.println("p2.name: "+p2.name);
		System.out.println("p2.age: "+p2.age);
		
		Person p3=new Person("�̼���",22);
		System.out.println("p3.name: "+p3.name);
		System.out.println("p3.age: "+p3.age);
		
		Person p4=new Person(27,"������");
		System.out.println("p4.name: "+p4.name);
		System.out.println("p4.age: "+p4.age);
		
	}
	
}
