package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySearchEngine extends JFrame {

	
	JPanel p=new JPanel();
	JTextArea ta;
	JButton G,N,D,Y;
	
	public MySearchEngine() {
		super("::MySearchEngine::");
		add(p);
		p.setBackground(Color.black);
		
			
			
		ta=new JTextArea("Google¸¦ ´­·¶±º¿ä!");
		
		p.add(new JScrollPane(ta), "Center");
			
		G=new JButton("Google");
		N=new JButton("Naver");
		D=new JButton("Daum");
		Y=new JButton("Yahoo");
		
		G.setLocation(1, 1);
		N.setLocation(1, 2);
		D.setLocation(2, 1);
		Y.setLocation(2, 2);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EventH handler=new EventH();
		
		G.addActionListener(handler);
		N.addActionListener(handler);
		D.addActionListener(handler);
		Y.addActionListener(handler);
	}

	
	class EventH implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==G) {
			ta.setForeground(Color.lightGray);
		}else if(obj==N) {
			ta.setForeground(Color.orange);
		}else if(obj==D) {
			ta.setForeground(Color.magenta);
		}else if(obj==Y) {
			ta.setForeground(Color.gray);
	}
		}
	}
	public static void main(String[] args) {
		MySearchEngine my=new MySearchEngine();
		my.setSize(500, 500);
		my.setVisible(true);
	}
}//////////////////////////////////////////////////////

