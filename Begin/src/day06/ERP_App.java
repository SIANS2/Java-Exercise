package day06;

//�λ���� ���α׷�
public class ERP_App {

	public static void main(String[] args) {
		//��ü ����// Object(���Ǽ��迡 �ִ� ��ü) ==> �޸𸮿� �ö� ��ü(object)
		Employee e1=new Employee();//��ü(object,instence)
		//��ü ��.����=��
		e1.no=1;
		e1.name="����";
		e1.salary=500;
		e1.dept="��ȹ��";
		//e1.indate=java.util.new Date();
		
		e1.work("��ȹ");
		int year_sal=e1.receive_sal();
		System.out.println("����: "+year_sal);
		
		
	}

}
