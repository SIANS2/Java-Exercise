package day13;

import java.io.IOException;

/*  System.in : InputStreamŸ��
- 1byte ��� ��Ʈ��
- ��� ��Ʈ�� : Ű����� ��� �����ϴ� ��Ʈ��
- public int read() :
  ����Ʈ �Է��� �����ϰ� �Է��� ����(Ctrl+C �Ǵ�
   Ctrl+D)�Ǹ� -1�� �����Ѵ�.
*/

public class InputStreamTest {

	public static void main(String[] args) {
		int input=0;
		int count=0;
		System.out.println("�Է��ϼ���");
		try {
			while(true) {
				input =System.in.read();
				//Ű���� �Է�
				System.out.println("input: "+input);
				count++;
				if(input=='x') break;
			}//while--
			System.out.println("�� "+count+"����Ʈ �Է¹���");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
