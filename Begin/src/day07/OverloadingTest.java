package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		//슈퍼맨 객체 2개 생성한뒤 getIFo() 호출해서 정보 출력하기
		Superman s1=new Superman();
		System.out.println("슈퍼맨 이름: "+s1.name);
		System.out.println("슈퍼맨 키: "+s1.height);
		System.out.println("슈퍼맨 초능력: "+s1.power);
		
		Superman s2=new Superman();
		System.out.println(s2.getInfo());
		
		
		//아쿠아맨 객체1개 생성한 뒤 getIfo()호출해서 정보 출력하기
		Aquaman a1=new Aquaman();
		System.out.println(a1.getInfo());
		
		/*슈퍼맨 객체4개를 배열에 저장하세요.
		 * 그런뒤 for루프 이용해서 슈퍼맨들의 정보를 출력하세요.
		 * */
		Superman s3=new Superman();
		System.out.println(s3.getInfo());
		
		Superman s4=new Superman();
		System.out.println(s4.getInfo());
		
		Superman s5=new Superman();
		System.out.println(s5.getInfo());
		
		Superman s6=new Superman();
		System.out.println(s6.getInfo());
		
		Superman arr[] = {s3,s4,s5,s6};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getInfo());
		}
	}
}
