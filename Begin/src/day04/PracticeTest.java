package day04;

public class PracticeTest {

	public static void main(String[] args) {
		System.out.println("======연습문제 4-2========");
		//1부터 20 까지의 정수 중 2또는 3의 배수가 아닌 총합
		int sum=0;
		for(int i=1;i<2;i++) {
			
			//if(!(i%2==0||i%3==0)) 
			if(i%2!=0&i%3!=0)
			{
				System.out.println("i: "+i);
				sum=sum+i;
			}
		}
		System.out.println("sum: "+sum);
		
		System.out.println("======연습문제 4-3========");
		//1~10까지의 합
		sum=0;
		int totalsum =0;
		for(int i=1;i<11;i++) {
			//sum=sum+1
			sum+=i;//1, 1+2, 1+2+3 ,1+2+3+4 .......
			totalsum+=sum;
		}
		System.out.println("sum: "+sum);
		System.out.println("totalsum: "+totalsum);
	}
		
}
