package day12;
//����� ���� ���� Ŭ���� �����
//[1] Exception�� ��� �޴´�.
//[2] �����ڸ� �����ؼ� �������ȿ��� super("���� �޼���")�� ȣ���ؼ� ���� �޼����� ����Ѵ�.
public class NotSupportedNameException extends Exception{

	public NotSupportedNameException() {
		super("NotSupportedNameException");//���ܸ޼���
	}
	
	public NotSupportedNameException(String msg) {
		super(msg);
	}
	
}//////////////////////////////////////////////////

