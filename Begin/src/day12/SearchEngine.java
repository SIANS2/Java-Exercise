package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJPanel extends JPanel{
	
	//�����̳��� �ٱ񤼿����� �ִ� �޼��带 �������̵� ����
	@Override
	public Insets getInsets() {
		Insets in=new Insets(10,10,10,10);//������ �ð� �ݴ� ����=>top left bottom right
		return in;
	}
	
}//-------------------------------

public class SearchEngine extends JFrame{
	JPanel p=new MyJPanel();//FlowLayout=>GridLayout����
	
	JButton[] bt =new JButton[4];
	String [] str= {"Naver","Google","Daum","Yahoo"};
	
	public SearchEngine() {
		super("::SearchEngine::");
		add(p,"Center");
		// GridLayout (int row, int col, int hgap, int vgap)
		p.setLayout(new GridLayout(2,2,20,20));//2�� 2��
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
			
		}
		//��ư�� ���� �̺�Ʈ ó���� anonymous class�� �غ���!
		bt[0].addActionListener(new ActionListener()  {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[0].setBackground(Color.white);
				setTitle(str[0]+"��ư�� ��������");
			}
		} );
		
		//bt[1]=> ���� ��������� ����
		bt[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.orange);
				setTitle(str[1]+"��ư�� ��������");
			}
		});
		
		bt[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//�̺�Ʈ�� �߻��� ��ü
				String cmd = e.getActionCommand();//�̺�Ʈ�ҽ��� �󺧹��ڿ��� ��ȯ�Ѵ�.
				setTitle(cmd);
				((JButton)obj).setBackground(Color.pink);
			}
		});
		
		bt[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			String cmd = e.getActionCommand();
			setTitle(cmd);
			((JButton)obj).setBackground(Color.gray);
			}
		});
				
	}

	public static void main(String[] args) {
		SearchEngine my=new SearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
