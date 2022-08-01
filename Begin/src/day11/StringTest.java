package day11;

public class StringTest {
	//java.lang.String : finalŬ����. ��ӹ��� �� ����.
	//					immutable(�Һ���) :���ڿ� �����̳� ����, ���� ����
	//					�۾��� �� �� �������ڿ��� �״�� �ΰ� ���� ������

	public static void main(String[]args) {
		String s1="Java";
		s1="Language";
	
		System.out.println(s1);
		/*
		 * 
		 * s1 --x--->"Java"
		 * 
		 * s2 ------>"Java Language"
		 * 
		 * */
		
		
		//concat() : ���ڿ��� ������ �� ���
		String s2 =s1.concat(" Nice");
		System.out.println("s2: "+s2);
		System.out.println("s1: "+s1);
		
		
		//[2] char cahrA(int i)
		char c1=s1.charAt(5);
		//0123456789101112
		//Java Langu a g e <<������� ����
		System.out.println("c1: "+c1);
		
		String s3="5678";
		boolean isNum=true;
		for (int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			System.out.println(ch+", ");
			if(!(ch>='0'&&ch<='9')) {
				//���ڰ� �ƴ� ���ڰ� �ִٸ�
				isNum=false;
				break;
			}
		}//----------------------
		String result=(isNum)?"�����Դϴ�.":"���ڰ� �ƴմϴ�";
		
		System.out.println("\n���� s3�� "+result);
		
		// int indexOf(String str) : str���ڿ��� ��ġ�� ���� index��ȣ�� ��ȯ�Ѵ�.
		//						     ���� str���ڿ��� ���ٸ� -1�� ��ȯ �Ѵ�.
		String s4="��Ӵ��� ¥����� �ȴٰ� �ϼ̾�. ��Ӵ��� ¥�����...";
		
		int idx=s4.indexOf("¥���");//���ڿ� �տ��� ���� ã��
		System.out.println("idx: "+idx);
		
		//int lastIndexOf : ���ڿ� �ڿ��� ã��
		idx=s4.lastIndexOf("¥���");
		System.out.println("idx : "+idx);
		
		idx=s4.lastIndexOf("«��");//������ -1�� ��ȯ
		System.out.println("idx : "+idx);
		
		//String substring(int start,int end):�ε��� start��������
		//				end -1������ ���ڿ��� ��ȯ�Ѵ�.
		//String substring(int start) : start ���� ������ ���ڿ��� ��ȯ
		System.out.println(s4.substring(s4.indexOf("¥���"),s4.lastIndexOf("¥���")));
		System.out.println(s4.substring(5));
		System.out.println("s4 : "+s4);
		
		
		//replace(String oldstr, String newstr)
		//¥����� «������ �ٲ� ����غ���
		System.out.println(s4.replaceAll("¥���", "«��"));
		System.out.println(("s4: "+s4));//immutable
		
		String s5="	100#tom#�ݰ����ϴ�~���õ� ���� �Ϸ� ��������~	";
		System.out.println("s5.length() : "+s5.length());
		//String trin() : ���ڿ� ��, ���� ���� ���ڸ� �����Ѵ�.
		String s6=s3.trim();
				
		System.out.println("s6.length()"+s6.length()+" "+s6);
		
		//String toUpperCase()/toLowerCase()
		
		//String[] split(String[]regex) :Ư�� ���Ϲ��ڿ��� �������� ���ڿ��� �ɰ��� �迭�� ��� ��ȯ�Ѵ�.
		String[] tokens=s5.split("#");
		System.out.println("tokens.length: "+tokens.length);
		System.out.println("token[0]="+tokens[0]);
		System.out.println("token[1]="+tokens[1]);
		System.out.println("token[2]="+tokens[2]);
		
		
	}
}
