package day07;

public class Demo {
		int x=10;//�������(�ν��Ͻ� ����)
		double pi=3.14;//�������(�ν��Ͻ� ����)
		
		static String STR="Hello";//Ŭ���� ����(static����)
		
		
		//��� �޼ҵ�(�ν��Ͻ� �޼ҵ�)
		public void sub() {
			this.x=100;
			this.pi=5.78;
			
		}
		
		
		
	//Ŭ���� �޼ҵ�-static �޼ҵ�
	public static void main(String[] args) {
		//this.x=200;==>[x] static�޼ҵ� �ȿ����� this�� ��� �� �� ���٤�.
		Demo dm=new Demo();
		dm.x=200;//��ü��.����
		System.out.println("dm.x: " +dm.x);
		
		dm.sub();
		System.out.println("dm.x: " +dm.x);
		System.out.println("dm.pi: " +dm.pi);
		
		//STR���� ����غ���
		
		System.out.println("Demo.STR: "+Demo.STR);
		
		
	}

}
