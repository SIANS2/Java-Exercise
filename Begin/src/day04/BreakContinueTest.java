package day04;
/*보조제어문 : break, continue => 단독으로는 사용 불가, 주제어문과 함께 사용함
 * */
public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println(".-----------------------");
		//결과물 예측하기
		for(int i=0;i<3;i++) {
			if(i==1)
				break;//가장 가까운 반복문을 벗어난다.
			System.out.println("i= "+i);
		}//for--------
		
		System.out.println("2.----------------------");
		//결과물 예측하기
		for(int i=0;i<3;i++) {
			if(i==1)
				continue;
			System.out.println("i= "+i);
		}///for-------

		System.out.println("3.----------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;
				System.out.println("3."+"i= "+i+", k="+k);
			}
		}
		System.out.println("4.----------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;
				System.out.println("i= "+i+", k="+k);
			}
		}
		
		System.out.println("5.----------------------");
		outer: //label => 반복문 앞에만 붙일 수 있다.
		for(int i=0;i<3;i++) {
			inner :
			for(int k=0;k<3;k++) {
				if(k==1) break outer;
				System.out.println("i= "+i+", k="+k);
			}//
		}
		
		System.out.println("6.----------------------");
		outer:
		for(int i=0;i<3;i++) {
			inner :
			for(int k=0;k<3;k++) {
				if(k==1) continue outer;
				System.out.println("i= "+i+", k="+k);
			}//
		}
		//while for if 사용하여 만들기.
		System.out.println("1과 100사이의 값을 입력하세요 :");//random 사용
		
		//System.out.println("더 큰 수를 입력하세요.")
		//System.out.println("더 작은 수를 입력하세요.")
		//System.out.println("맞췄습니다.")
		//System.out.println("시도 횟수는 "++""번입니다.")
		
	}//main--------------------------

}//class----------------------------------------------
