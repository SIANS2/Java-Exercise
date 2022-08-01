package Git_Java;
import java.util.*;
public class Javat5 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요==>");
		Scanner sc=new Scanner(System.in);
		int count=0, n=0;
		int sum=0;
		while((n = sc.nextInt())!= 0) {
			sum= sum+n;
			count++;
		}
			System.out.println("입력한 수의 갯수는 "+count+"개 입니다.");
			System.out.println("입력한 수의 평균은 "+sum/count+" 입니다.");
			
			
	
		}
		
	}

