package day05;

public class Test1 {

	public static void main(String[] args) {
		int[]arr[] = new int[5][5];
		int cnt=0;//1씩 증가시키면서 arr에 저장하되 아래와 같이 저장하세요
		int x=0, y=0; //베열의 인덱스로 사용할 변수
		//////////////////////////////////////
		for(int k=0;k<2;k++) {
		
			for(int i=0;i<4-2*k;i++) {
				arr[x+k][y+k]=++cnt;
				y++;
				
			}
			if(x+y==4-2*k) {
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					x++;
				}
			}
			if(x==y) {
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					y--;
				}
			}
			if(x+y==4-2*k) {
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					x--;
				}
			}
		}//for=>k
		arr[x+2][y+2]=++cnt;
		/////////////////////////////////
		
	
		
		
		System.out.println("----------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}//for--
			System.out.println();
		}//for--------
		
		
    }//main-----
}//class----------

