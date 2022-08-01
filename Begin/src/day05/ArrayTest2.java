package day05;

public class ArrayTest2 {
	public static void main(String[] args) {
		//[1] float 유형의배열을 선언하여 크기는 3만큼 주세요
		//	  저장할 데이터는 -16.456, 200.5, 30e3입니다
		//	  데이터를 저장한 뒤 for루프 이용해서 저장된 값을 출력하고
		//	  배열에 저장된 값의 총합과 평균값도 구해 출력해 보세요
		float a[];
		a=new float[3];
		
		a[0]=-16.456f;
		a[1]=200.5f;
		a[2]=30e3f;
		float sum =0f;
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		sum =sum+a[i];	
		}
		System.out.println("총합= "+sum);
		System.out.println("총합= "+(sum/a.length));
		//System.out.println("총합= "+(a[0]+a[1]+a[2]));	
		//System.out.println("평균= "+(a[0]+a[1]+a[2])/3);	
		
		
		
	}
}
