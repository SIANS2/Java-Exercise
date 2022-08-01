package day08;
//Superman is a Human
//Superman is a Object
public class Superman extends Human {
	int power;
	
	public Superman() {
		
	}
	public Superman(String m, int h,int p) {
		name=m;
		height=h;
		power=p;
	}
	// �޼ҵ� �������̵�(Override)-�޼ҵ� ������
	/* �θ�� ���� ��ӹ��� �޼ҵ带 �ٽ� ���� �ؼ� �����ϴ� ��
	 * -�������̵��� ����
	 * [1] �θ��� �޼ҵ� �̸��� �����ϰ� ����
	 * [2] �θ��� �Ͱ� �Ű������� �����ϰ� ����
	 * [3] ��ȯŸ�Ե� ���ƾ� ��
	 * [4] ���������ڴ� �θ�� �����ϰų� �� ���� ������ ���������ڸ� ����� �� ����
	 * [5] ���ܴ� �θ� ������ ���ܿ� �����ϰų�, �� ��ü���� ���ܸ� �߻���ų �� �ִ�.
	 **/
	public String getInfo() {//������ �θ�� �ٸ��� ������
		//String info="�̸�: "+name+"\nŰ: "+height+"\n�ʴɷ�: "+power;
		String info=super.getInfo()+"\n�ʴɷ�: "+power;
				  //super�� �θ�κ��� �������� ������ �޼ҵ带 ������ �� ����ϴ� Ű����
		return info;
		
	}//�������̵��� �޼ҵ带 �����ε� �غ���
	public String getInfo(String title) {
		//����, �̸�, Ű, �ʴɷ�

	String info=title+"\n"+super.getInfo()+"\n�ʴɷ�"+power;
	return info;
		}
	public void getInfo(String title,int up) {
		this.power+=up;
		//����, �̸�, Ű, �ʴɷ� �� ����ϴ� ��ɹ� �ۼ��ϼ���
		String info=this.getInfo(title);
		System.out.println(info);
	}
	
}
