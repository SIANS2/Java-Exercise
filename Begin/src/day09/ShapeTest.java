package day09;

public class ShapeTest {

	public static void main(String[] args) {

		System.out.println("�� ������ ������ ���� ���ô�.");
		System.out.println("����: "+7+", ����"+8+"---------");
		//�簢��
		Rectangle rt=new Rectangle();
		rt.area(7, 8);
		
		//�ﰢ��
		Triangle ta=new Triangle();
		ta.area(7, 8);
		
		
		System.out.println("������: 8�� ���� ���� ----------");
		//�� :
		//Circle c=new Circle();
		//�߻� Ŭ������ Ÿ�Լ����� ���� ������ new�ؼ� ��ü ������ �Ұ��� �ϴ�.
	Circle c =new SubCircle();
	//�θ�Ÿ�� �������� =new�ڽİ�ü�� ����
	c.area(8, 0);//�������̵��� �޼��� ȣ�� ����
	((SubCircle)c).area(8);//[x]
	
	
	SubCircle sc=new SubCircle();
	sc.area(8);
	/*[1] rt,ta,c,sc ��ü���� ������ �迭�� �����ϰ� ������ ��
	 *	for �������� �����鼭 area()ȣ���غ���.20,30
	 *
	 * */
	Shape sh[] = {rt, ta, c, sc};
	for(int i=0; i<sh.length; i++) {
		if(i<2) {
			sh[i].area(20,30);
		}
		else if(i>=2) {
			((SubCircle)sh[i]).area(20);
		}
	}
 System.out.println("----------------");
 for( Shape shape : sh) {
	 if(shape instanceof SubCircle) {
		 ((SubCircle)shape).area(20);
	 }else 
	 shape.area(20, 30);
	 System.out.println("********");
	 
 }
	
	
}

}
