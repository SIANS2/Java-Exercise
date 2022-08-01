package day10;
import javax.swing.*;
import java.awt.*;
/*LayoutManger
 * - [1] FlowLayout : �߾ӿ� ��ġ
 * - [2] BordrtLayout : ��,��,��,��, �߾� ������ �����ؼ� ��ġ
 * - [3] GridLayout : ��� ���� ���·� �յ��ϰ� ��ġ
 * ���̾ƿ� ����: setLayout()�̿�
 * */


public class MyFlowLayout extends JFrame {
	JButton b1, b2, b3, b4;
	JPanel p;//JPanel :�⺻���̾ƿ��� FlowLayout
	
	public MyFlowLayout() {
		super("::MyFlowLayout::");
		p=new JPanel(); 
		this.add(p);
		p.setBackground(Color.white);
		//p.setLayout(new BorderLayout());
		//p.setLayout(new GridLayout(2,2));//2��2��
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		b1 =new JButton("           b1            ");
		b2 =new JButton("	b2	");
		b3 =new JButton("	b3	");
		b4 =new JButton("	b4	");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//â�ݱ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		MyFlowLayout my=new MyFlowLayout();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
