package day08;
/*�ϳ��� �ڹ����Ͽ� ���� Ŭ������ ������ ���
 * public �� Ŭ������ 1���� ���� �ؾ� �ϸ�,
 * ���ϸ����� �� Ŭ������ public�� ���δ�*/
class Person{
	int no;
	String name;
	public Person() {}
	//�����ڸ� �ϳ��� �����ϴ� ����, �����Ϸ��� ������ �⺻ �����ڴ� �������.
	public Person(int n, String m) {
		no=n;
		name=m;
	}
}//person//////////
//�ڽ�class�� �����ڿ����� ���������� super()�� ȣ���Ѵ�.
//super()�� �θ� Ŭ������ �⺻ �����ڸ� ȣ���� �� ����ϴ� Ű����
class Student extends Person{
	String major;
	public Student() {
		//super()���������� ȣ�� ==> �⺻�����ڰ� ��� ������ ��
		super(100,"���л�");//�̷���� ��������� super(�Ű�����)�� ȣ���Ͽ� �ذ��Ѵ�.
	}
	/*public Student(){
	 * 		super();
	 * }
	 * */
}//Student////////

class Teacher extends Person{
	String subject;
	public Teacher() {
		//super(200,"�ֱ���");
		this(200,"�ֱ���","C");
		/*[1] super()�� �����ڿ����� ȣ�� �����ϴ�.
		 * [2] �������� ù��° �����̾�߸� �Ѵ�.
		 * [3] this()�ʹ� �Բ� ����� �� ����.
		 * */
	}
	public Teacher(int no,String name,String subject) {
		super(no,name);
		this.subject=subject;
	}
}//Teacher////////


public class Inheritance2 {

	public static void main(String[] args) {
		Person p1=new Person(1,"ȫ�浿");
		//p1.no=01;
		//p1.name="ȫ�浿";
		
		
		

		
	}

}
