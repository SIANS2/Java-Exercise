package day05;

public class ArrayTest2 {
	public static void main(String[] args) {
		//[1] float �����ǹ迭�� �����Ͽ� ũ��� 3��ŭ �ּ���
		//	  ������ �����ʹ� -16.456, 200.5, 30e3�Դϴ�
		//	  �����͸� ������ �� for���� �̿��ؼ� ����� ���� ����ϰ�
		//	  �迭�� ����� ���� ���հ� ��հ��� ���� ����� ������
		float a[];
		a=new float[3];
		
		a[0]=-16.456f;
		a[1]=200.5f;
		a[2]=30e3f;
		float sum =0f;
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		sum =sum+a[i];	
		}
		System.out.println("����= "+sum);
		System.out.println("����= "+(sum/a.length));
		//System.out.println("����= "+(a[0]+a[1]+a[2]));	
		//System.out.println("���= "+(a[0]+a[1]+a[2])/3);	
		
		
		
	}
}
