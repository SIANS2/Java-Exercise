package day06;
/*�λ���� ���α׷�
 * ==> ��ü : ��, �ǹ�, å��, ��ǻ��, ī�޶� ...
 * 			���, �μ�, �޿�...
 * 			���� �Ѵ�, �޽��� ���Ѵ�, ���� �ܴ�, ������ �Դ´�
 * ��ü = �Ӽ�(attribute) + �ൿ���(behavior)
 * 		�����			 ������
 * ==> ��ü���� ���α׷� ����� ������̴� �� (�߻�ȭ -Abstraction)
 * 		[1] �Ӽ� ==> �������
 * 		[2] �ൿ��� ==> �޼ҵ�
 * */
import java.util.*;
public class Employee {
	//�Ӽ�: "has a"���踦 ���´�.
	//Employee has a no
	int no;//��� ======> �������(�ν��Ͻ� ����)
	String name;//�̸�
	String dept;//�μ�
	int salary;//�޿�
	Date indate;//�Ի���
	
	//���� ==> �޼ҵ�� ����
	public void work(String type) {

		System.out.println(name+"�� "+type+" ���� �ϰ� �־��.");
	}
	
	
	public int receive_sal() {
		return salary*12;
	}
}/////////////////////////////////////////////////////////////
