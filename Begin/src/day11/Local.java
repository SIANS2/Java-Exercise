package day11;

public class Local {
	String str="멤버변수@@@";
	
	public void sub() {
		double pi=3.14;//지역변수
		System.out.println("str; "+str);
		System.out.println("pi; "+pi);
		
		class LocalInner{//local inner class
			String lstr="LocalInner의 멤버변수###";
					void foo() {
				//str
				System.out.println("str ="+str);
				
				//lstr
				System.out.println("lstr ="+lstr);
				
				//pi
				System.out.println("pi ="+pi);
				//pi=5.12;//error발생
			}
		}//
		/*로컬이너 클래스는 자기가 속한 메서드 안에서 객체 생성해야함
		 * 또한 클래스가 구성된 후에 객체 생성이 가능함
		 * */
		LocalInner li=new LocalInner();
		li.foo();
		
		
	}///sub-----
	
	
	public static void main(String[] args) {
		//LocalInner의 foo() 호출하기[x]
		//Local의 sub()호출하기
		Local lc=new Local();
		lc.sub();
	}
}
