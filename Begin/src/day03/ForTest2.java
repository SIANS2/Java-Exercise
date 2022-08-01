package day03;
/*[문제1]for루프문을 이용하여 구구단 7단을 아래 형식으로 출력하세요.
 * 7 *1 =7
 * 7 *2 =14
 * ...
 * 7 *9 =63
 * 
 * */
public class ForTest2 {
	
	public static void main(String[] args) {
		int dan=7;
		int no=0;
		for(no=1;no<=9;no++) {
			System.out.println(dan+"x"+no+"="+dan*no);
			
		}
	//[문제2] 1 ~ 10까지의 합을 구해 출력하세요 -for이용
			int sum =0;
			for(int a=1;a<11;a++) {
				//sum +=a;
				sum= sum+a;
				}
			System.out.println("1 ~ 10 까지의 합="+ sum);
			
		
	//[문제3] 1 ~ 10까지의 곱을 구해 출력하세요
			int sum2 =0;
			int gop=1;
			for(int a=1;a<11;a++) {
				//gop=gop*a;
				gop = gop*a;
			}
				System.out.println("1 ~ 10 까지의 곱="+ gop);
			
	//[문제4] 1 ~ 100까지의 수 중 짝수들의 합을 구해 출력하세요
			int sum1=0;
			for(int c=1;c<101;c++) {
				if(c%2 == 0)
					sum1=sum1+c;
			}
			System.out.println("1~100까지의 수 중 짝수들의 합: "+sum1);
			
			int summ=0;
			for(int c=0;c<101;c+=2) {
				summ+=c;
			}
			System.out.println("1~100까지의 수 중 짝수들의 합: "+summ);

	//[문제5] 1 ~ 100까지의 수 중 17로 나누어 떨어지는 수를 출력하세요
			for(int c=1;c<101;c++) {
				if(c%17==0)
					System.out.println(c);
			}
			
	//[문제6] 대문자 알파벳[A~Z]을 for 이용해서 출력하세요
		for(int a=65;a<91;a++) {
			System.out.print((char)a+", ");
		}
		System.out.println();//줄바꿈

		for(char d='A';d<='Z';d++) {
			System.out.print(d+" ,");
		}
		
		
		
	
	}

}
