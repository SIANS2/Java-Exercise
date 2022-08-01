package day09;
import javax.swing.*;
import java.awt.*;
//CLI : Command Line Interface ���� �ֿܼ��� ����Ǵ� ���α׷�
//GUI : Graphic User Interface �׷��� ȯ���� ���� ���α׷�
//JFrame : Window �迭�� �����̳�
//			�ݵ�� ����� �����ְ� setVisible(true)�� �־�� ȭ�鿡 ������

//JPanel : Panel�迭�� �����̳�

public class MyGui extends JFrame {
	JPanel p; //<- ������
	JButton bt1, bt2, bt3;//Component <-��ǰ ����
	Icon icon1, icon2, icon3, icon4, icon5;
	
	JTextField tf1, tf2;
	JTextArea ta1, ta2;
	
	public MyGui() {
		super(":MyGui Program v1.1::");//Ÿ��Ʋ�� ���ڿ��� �ö�����
		p=new JPanel();
		add(p);//JPrame�� �߾ӿ� �ǳ��� �ٴ´�.
		p.setBackground(Color.lightGray);
		icon1=new ImageIcon("������1.jpg");
		icon2=new ImageIcon("������2.jpg");
		icon3=new ImageIcon("������3.jpg");
		icon4=new ImageIcon("������4.jpg");
		icon5=new ImageIcon("������5.jpg");
		
		bt1=new JButton(icon1);
		
		bt2=new JButton("Home",icon2);
		bt2.setHorizontalTextPosition(JButton.CENTER);//�ؽ�Ʈ ��ġ�� ������ �߾ƿ� ��ġ
		bt2.setVerticalTextPosition(JButton.TOP);//������ ž�� ��ġ
		
		bt3=new JButton("Login",icon3);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setVerticalTextPosition(JButton.BOTTOM);
		bt3.setPressedIcon(icon4);
		bt3.setRolloverIcon(icon5);
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		tf1=new JTextField(20);
		tf2=new JTextField("�ܾ �Է��ϼ���.",30);
		
		tf1.setBackground(Color.gray);
		
		tf2.setBackground(Color.black);//����
		tf2.setForeground(Color.white);//���ڻ�
		
		ta1=new JTextArea("�ȳ��ϼ���. �ݰ����ϴ�~",5,20);
		ta2=new JTextArea(10,30);//rows:10, columns:30
		
		p.add(tf1);
		p.add(tf2);
		//JTwxtArea�� JScrollPane�� �ٿ��� ��ũ�ѹٰ� �ٴ´�.
		JScrollPane sp=new JScrollPane(ta1);
	
		p.add(sp);
		
		p.add(new JScrollPane(ta2));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�ݱ� ó�� - ���μ��� ����
	}//������ ��---------
	
	
	public static void main(String[] args) {
		MyGui my=new MyGui();//JFrame
		my.setSize(500,500);//��, ����
		my.setVisible(true);
		
		
	}

}
