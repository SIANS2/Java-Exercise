package day11;

public class Local {
	String str="�������@@@";
	
	public void sub() {
		double pi=3.14;//��������
		System.out.println("str; "+str);
		System.out.println("pi; "+pi);
		
		class LocalInner{//local inner class
			String lstr="LocalInner�� �������###";
					void foo() {
				//str
				System.out.println("str ="+str);
				
				//lstr
				System.out.println("lstr ="+lstr);
				
				//pi
				System.out.println("pi ="+pi);
				//pi=5.12;//error�߻�
			}
		}//
		/*�����̳� Ŭ������ �ڱⰡ ���� �޼��� �ȿ��� ��ü �����ؾ���
		 * ���� Ŭ������ ������ �Ŀ� ��ü ������ ������
		 * */
		LocalInner li=new LocalInner();
		li.foo();
		
		
	}///sub-----
	
	
	public static void main(String[] args) {
		//LocalInner�� foo() ȣ���ϱ�[x]
		//Local�� sub()ȣ���ϱ�
		Local lc=new Local();
		lc.sub();
	}
}
