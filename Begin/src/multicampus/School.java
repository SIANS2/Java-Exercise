package multicampus;
import java.util.*;
public class School {
	//School has a students[�迭]
	//String arr[] = new String[3]; [x]
	static Student[] arr=new Student[3];//�迭==> DB���� ������ ��
	static int count=0;//�迭�� �ε��� ��ȣ�� ����� ���
	
	public static void showMenu() {
		System.out.println("*****SchoolApp v1.1*****");
		System.out.println("**	1. ��	��			**");
		System.out.println("**	2. ��	��			**");//<����
		System.out.println("**	3. ��	��			**");
		System.out.println("**	4. ��	��			**");
		System.out.println("**	9. ��	��			**");
		System.out.println("**************************");
		System.out.println("�޴� ��ȣ�� �Է��ϼ���=>=");
		System.out.println("**************************");
	}
	
	
	//public static void main(String[] args) {
		Student s1=new Student();
		/*
		s1.no=100;
		s1.name="��ö��";
		s1.major="������";
		s1.phone="010-2222-3333";
		*/
		//s1.inputIfo();
		//s1.showInfo();
		
	//}
		public static void register() {
			Student s1=new Student();
			s1.inputIfo();
			System.out.println("---����� ����---");
			s1.showInfo();
			
			System.out.println("�Է��� �л� ������ �����ұ��? [1. yes 2. no]");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
		if(num==1) {
			//s1�� �迭�� �����Ѵ�.==> arr�� �����ϱ�
			try {
				arr[count] =s1;
				count++;
				System.out.println("���� ��ϵ� �ο�: "+count+"��");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("��� ���� �ƽ��ϴ�!");
			}
		
		}
	}//----------------------------------------
		/** ��ϵ� ��� �л������� ����ϴ� �޼ҵ�*/
		public void printAll() {
			//�迭 arr�� ����� �л� ������ for���� �̿��ؼ� ������ ����غ���
			for(int i=0;i<count;i++) {
				Student s=arr[i];
				//System.out.println(s);//�̷��� �ϸ� s�� �ּҰ��� ��µȴ�.
				System.out.println("--�л� ����---");
				s.showInfo();
			}
		}//-----
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			School obj=new School();
			int num=0;
			do {
				//showMenu()ȣ���ϱ�
				School.showMenu();
				num=sc.nextInt();
				//�޴��� ���� ��ȣ�� �Է�������� "�޴��� ���� ��ȣ����. �ٽ� �Է� �ϼ���"
				if((num <= 0) || (num > 4)&&num!=9) {
					System.out.println("�޴��� ���� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
				switch(num) {
				case 1://�л� ���===> register()�޼ҵ� ����ϱ�
					School.register();
					break;
				case 2://��� printAll()==> arr�� ����� �л����� ������
						// �ݺ��� ���鼭 ����Ѵ�.
					obj.printAll();//�޼ҵ� ȣ�� non static �޼ҵ�(�ν�õ�� �޼ҵ�)
					break;
				case 3://�˻�
					break;
				case 4://����
					break;
				}
				
			}while(num!=9);
			System.out.println("�߰�����~~~");
		}
}
