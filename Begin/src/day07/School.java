package day07;

public class School {

	public static void main(String[] args) {

		
		/*[1] �л� ��ü�� �����ϰ�, �й�,�̸�,�������� �Ҵ��ϼ���*/
		Student s1=new Student();
		s1.setNo(101);
		s1.setName("���þ�");
		s1.setMajor("�ڹ�");
		
		
		/*[2] ���� ��ü�� �����ϰ�, ����,�̸�,�������� �Ҵ��ϼ���*/
		Teacher t1=new Teacher();
		t1.setNo(201);
		t1.setName("��Ƽķ�۽�");
		t1.setSubject("�ڹ�");
		
		
		/*[3] ���� ��ü�� �����ϰ�, ���,�̸�,�ҼӺμ����� �Ҵ��ϼ���*/
		Staff s2=new Staff();
		s2.setNo(301);
		s2.setName("MLP");
		s2.setDept("�");
		
		System.out.println("****�л� ����****");
		
		System.out.println("�й�: "+s1.getNo());
		System.out.println("�̸�: "+s1.getName());
		String mj=s1.getMajor();
		System.out.println("����: "+mj);
		
		System.out.println("****���� ����****");
		
		t1.showInfo();
		
		System.out.println("****���� ����****");
		
		s2.showInfo();
		
		
		//����1]�л� ��ü�� 2�� �� �����ϰ�...
				//        ���� �̸�,�й�,���� ���� �־��ص�...
				//			�迭�� ��������.
				//			for���� �����鼭 ����� �л� ��ü����
				//         ������ ����غ���.
		Student s3=new Student();
		s3.setNo(111);
		s3.setName("��ä��");
		s3.setMajor("��ȣ");
		
		Student s4=new Student();
		s4.setNo(121);
		s4.setName("���ҷ�");
		s4.setMajor("�м�");
		
		Student[] arr1=new Student[3];
		arr1[0]=s1;
		arr1[1]=s3;
		arr1[2]=s4;
		
		for(int i=0;i<arr1.length;i++) {
			Student st=arr1[i];
			//System.out.println(st);
			st.showInfo();
		}
		
		
		
	
		//����2] ���� ��ü 1�� �� ����
		//    �� �Ҵ� �� �迭�� ������, Ȯ�� for���� �̿��ؼ� �������� ����ϱ�
		Teacher t2=new Teacher();
		t2.setNo(211);
		t2.setName("�λ��п�");
		t2.setSubject("������");
		
		Teacher arr2[] = {t1, t2};
		for(Teacher tc: arr2) {
			tc.showInfo();
		}
		
	}

}
