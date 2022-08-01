package day06;
/*
 * try{
 * }catch(){
 * 
 * }finally{
 * 	finally ���� �ݵ�� �ѹ��� ����Ǵ� ���̴�.
 * 	���� return���� ������ �ѹ��� �����ϰ� ������� �ѱ��.
 * 	�� ���ܰ� �ִ�. �ý��� �����ڵ尡 ���� ���� finally���� ������� ����
 * */
public class ExceptionTest {

	public static void main(String[] args) {

		try {
			int num=Integer.parseInt(args[0]);
			System.out.println(50/num);
		} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("����� �μ��� 1�� �Է��ؾ��ؿ�");
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ؾ� �ؿ�");
			return;
		} catch (ArithmeticException e) {
			System.out.println("�и� 0�� �Ǿ�� �ȵ˴ϴ�");
			System.exit(0);//�ý��� ����
		} catch (Exception e) {
			System.out.println("��Ÿ���� �߻� : "+e.getMessage());
		}//String getMeggage() : ���� �޼����� ���ڿ��� ��ȯ�Ѵ�.
		finally {
		System.out.println("###�ݵ�� ����Ǿ�� �ϴ� �ڵ� �Դϴ�.###");
		}
		System.out.println("The End~~~");
	}

}
