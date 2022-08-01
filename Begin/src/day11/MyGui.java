package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*�̺�Ʈ ó��
 * [1] �̺�Ʈ �ҽ�
 * [2] �̺�Ʈ
 * [3] �̺�Ʈ �ڵ鷯
 * */
public class MyGui extends JFrame {
		JPanel p,pN;
		JTextArea ta;
		JButton bR, bG,bB,bExit;
		
		public MyGui() {
			super("::MyGui::");
			p=new JPanel();
			p.setBackground(Color.LIGHT_GRAY);
			add(p,"Center");
			
			p.setLayout(new BorderLayout());//<<�������� �� ���� ���� ������ ����~
			pN=new JPanel();
			pN.setBackground(new Color(180,50,100));//RGB
			p.add(pN,"North");
			
			ta=new JTextArea("�ȳ�");
			p.add(new JScrollPane(ta), "Center");
			
			bR=new JButton("Red");
			bG=new JButton("Green");
			bB=new JButton("Blue");
			bExit=new JButton("Exit");
			
			pN.add(bR);
			pN.add(bG);
			pN.add(bB);
			pN.add(bExit);
			
			//������ �ȿ��� event�ҽ��� event�ڵ鷯�� ��������� �Ѵ�.
			//"evet�ҽ�.add~~~Listener(�̺�Ʈ �ڵ鷯 ��ü)"
			MyEventHandler handler=new MyEventHandler();
			//MyGui.MyEventHandler handler2=this.new MyEventHandler();
			bR.addActionListener(handler);
			bG.addActionListener(handler);
			bB.addActionListener(handler);
			bExit.addActionListener(handler);
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}/////---������--------
		//�̺�Ʈ �ڵ�� ����
		//~~~Listener��� �޾ƾ���
		class MyEventHandler implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				//�̺�Ʈ�� �߻��� ��ü�� �������� ����.
				Object obj=e.getSource();//�̺�Ʈ �ҽ��� ���� ������ ��ȯ
				if(obj==bR) {
					ta.setForeground(Color.red);//�̺�Ʈ ó�� �ڵ尡 ���� ��!
				}else if(obj==bG) {
					ta.setForeground(Color.green);//�̺�Ʈ ó�� �ڵ尡 ���� ��!
				}else if(obj==bB) {
					ta.setForeground(Color.blue);//�̺�Ʈ ó�� �ڵ尡 ���� ��!
				}else if(obj==bExit) {
					System.out.println(0);//<<�ý��� ����!!!
				}
			
				
				
				
			}
			
		}///////////////////////////////////

	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
