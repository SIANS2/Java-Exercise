package day07;

public class Person {
	
	String name;
	int age;
	//������(Constructor) : ��ü�� ���� �Ҷ� ȣ��Ǵ� �޼ҵ��� ����
	/*��Ģ
	 * <1> ������ �̸��� Ŭ���� �̸��� �����ϰ�
	 * <2> ��ȯŸ���� ����������´�.
	 * 
	 * public �����ڸ�(){
	 * 
	 * }
	 * */
	public Person() { //�⺻ ������ - default constructor
		name="�ƹ���";
		age=1;
	}
	public Person(String name) {//���� ������ -constructor using fields
		this.name=name;
		age=10;
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Person(int age,String name) {
		this.name=name;
		this.age=age;
	}
	/*�����ε��̶�
	 * - ������ �޼ҵ� �̸��� ������ �����ϴ� ��(��������, �ߺ�����)
	 * - �Ű������� �ڷ����� �ٸ��ų�, ������ �ٸ��ų�, ������ �ٸ��� �����ؾ��Ѵ�.
	 * - ��ȯŸ���� �޶� �ǰ� , ���Ƶ� �ȴ�.(�Ű澲�� ����)
	 * */

	}
	
////////////
