package day05;

public class ArrayTest3 {

	public static void main(String[] args) {
		System.out.println("1.----------------------");
		int a[];
		a=new int[3];
		a[0]=90;
		a[1]=80;
		a[2]=70;
		
		int[] b;
		b=a;
		/*a가 가르키는 배열을 b도 같이 가르키는 형태가 된다.
		 * int a[]------------->|90|80|70|
		 * 
		 * int b[]------------->|90|80|70|
		 * */
		//b를 for루프문을 이용해서 저장된 값을 출력하세요
		for (int i=0;i<3;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		//a가 창조하는 배열을 b도 같이 창조하는 형태가 되므로,
		//둘중 하나의 데이터를 변경하면 같이 변경 된다.
		b[0]=100;//데이터 변경
		System.out.println("b[0]="+b[0]);
		System.out.println("b[0]="+a[0]);
		
		System.out.println("2.----------------------");
		
		int []x= {1,2,3,4};
		int y[]= {10,20};
		int tmp[];//선언
		//x,y값을 서로 바꿔 보세요
		tmp=x;
		x=y;
		y=tmp;
		for(int i=0;i<x.length;i++) {
			System.out.println("x[i]="+x[i]);
		}
		for(int i=0;i<y.length;i++) {
			System.out.println("y[i]="+y[i]);
		}
		System.out.println("2.----------------------");
		//참조형의 배열 - String, Date, Scanner, Object ...
		String[] arr=null;//[1] 선언
		System.out.println(arr);
		
		arr=new String[4];//[2] 메모리 할당
		System.out.println("arr[0]="+arr[0]);
		
		//[3] 초기화
		arr[0]="Hello";
		arr[1]=new String("Hi");
		arr[2]=3+"5";
		arr[3]="";//빈문자열   char ch+' '
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("***********");
		//확장 for루프, 개선된 for루프, for each루프...
		/*for(변수 선언문: 자료구조)
		 * {
		 * 		실행문:
		 * }
		 * 알아서 자료구조의 크기(length)만큼 반복문 돌면서
		 * 자료구조에 저장된 값을 변수에 할당한다.
		 * */
		for(String s: arr) {
			System.out.println(s.toUpperCase());//toLowercase()
			//System.out.println("s: "+s);
		}
		
		String str[] = {"안녕하세요","반갑습니다","잘가세요~~~"};
		//확장 for=루프 문으로 str에 저장된 값을 출력하세요.
		for(String k: str) {
			System.out.println(k);
			
		}

	}

}
