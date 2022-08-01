package day10;
import java.util.*;

import javax.swing.JButton;
public class VectorTest {
/*Java Collection Framework
 * 	- Collection : 객체를 수집해서 저장하는 역할
 *  - Framework : 사용방법을 미리 정해놓은 라이브러리를 의미
 *  - Vector, ArrayList, Hashtable, HashMap, HzchSet,TreeSet...
 *  # Vector
 *  - List계열
 *  - 입력 순서를 기억한다
 *  - 데이터 중복저장 가능
 *  - 유사 클래스 : ArrayList
 * 
 * */
	public static void main(String[] args) {
		//jdk-1.4 이전버전
		//Vector v= new Vector();//초기용량 : 10개, 가득차면 2배로 저장공간을 늘린다.	
		
		//데이터를 저장 할때는 add(), addEliment를 사용
		//데이트를 꺼낼 때는 Object get(int index), Object elementAt(int index)
		Vector v =new Vector(5,3);//5:초기용량, 3:증가치
		System.out.println("벡터 v의 현재 용량: "+v.capacity());
		System.out.println("벡터 v의 현재 크기: "+v.size());//<=몇개 저장했는지 알 수 있음.
		
		//Vector에 저장할 때는 add를 사용한다. object유형이면 모두 저장할 수 있다.
		v.add("Hello");
		v.add(new Integer(20));
		v.add(Integer.valueOf(22));//<=static 메소드
		v.add(3.14);//double이 저잘 되는 것이 아니라 Double -> Wrapper class로 
					//auto boxing되어서 저장된다.
		
		System.out.println("벡터 v의 현재 용량2: "+v.capacity());
		System.out.println("벡터 v의 현재 크기2: "+v.size());
		
		v.add(new Object());
		v.add(new javax.swing.JButton("ok"));
		
		System.out.println("벡터 v의 현재 용량3: "+v.capacity());
		System.out.println("벡터 v의 현재 크기3: "+v.size());
	
		//Object obj=v.get(0);
		String obj=(String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Double dbl=(Double)v.get(3);
		System.out.println(dbl);
		
		JButton str=(JButton)v.get(5);
		System.out.println(str);//str.toString()
		//jdk5.0이후 부터 Generic을 사용함
		//vector에 저장할 때 어떤 유형을 저장하겠다 라고 유형 자체를 지정한다.
		Vector<String> v2=new Vector<>(); // <=이런식으로 <String>처럼 적는다
		//7.0 이후부터는 <String>과 같은것을 생략해줘도 된다.
		v2.add(new String("java"));
		v2.add(Integer.valueOf(5).toString());
		
		String s2=v2.get(0);//제너릭을 이용하면 형변환이 필요하다
		System.out.println(s2.toLowerCase());
		
		//[1] for루프 이용해서 v2에 저장된 객체를 출력하기
		for(int i=0; i<2;i++) {
			System.out.print(v2.get(i)+" ");
		} System.out.println();

		//[2] float 유형을 저장할 벡터 v3을 생성하고
		//	  float객체 3개 이상 저장하디
		// 	  확장 for루프문 이용해서 v3에 저장된 값들의 함계를 구해 출력하기
		Vector<Float> v3 =new Vector<>();
		v3.add(1.24f);
		v3.add(9.12f);
		v3.add(Float.valueOf(5));
		
		float sum =0;
		for(float i:v3)//auto unboxing 
			sum+=i;
			
		System.out.println("합="+ sum);
	}

}
