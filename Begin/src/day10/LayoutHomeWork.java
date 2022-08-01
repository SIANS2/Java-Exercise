package day10;

import java.awt.*;
import javax.swing.*;


	public class LayoutHomeWork extends JFrame {
		
		JPanel p=new JPanel();
		JButton bt1, bt2, bt3, bt4;
		JTextArea ta1;
		
		public LayoutHomeWork() {
			super("::LayoutHomeWork::");
			add(p);
			p.setBackground(Color.black);
			p.setSize(500, 100);
			
		
			bt1=new JButton("       Diary	     ");
			bt1.setBackground(Color.lightGray);
			
			bt2=new JButton("       Poem	     ");
			bt2.setBackground(Color.lightGray);
			
			bt3=new JButton("       Memo	     ");
			bt3.setBackground(Color.lightGray);
			
			bt4=new JButton("       NEW!	     ");
			bt4.setBackground(Color.lightGray);
			
			p.add(bt1);
			p.add(bt2);
			p.add(bt3);
			p.add(bt4);
			
			ta1=new JTextArea(30,50);
			ta1.setBackground(Color.white);
			
			JScrollPane jsp=new JScrollPane(ta1);
			
			p.add(jsp);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public static void main(String[] args) {
			LayoutHomeWork my=new LayoutHomeWork();
			my.setSize(500, 500);
			my.setVisible(true);
			
		}
	
}

