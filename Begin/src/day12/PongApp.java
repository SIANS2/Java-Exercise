package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * ���� ���� ���� ������� �̿��� �� �ִ� ���ø����̼�
 * �ۼ���: ȫ�浿
 * �ۼ���: 22-07-19
 * ���� : 1.1 
 */
public class PongApp extends JFrame{

	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta;
	
	JLabel lb;
	JTextField tfName;
	JButton btAdd,btSave;
	
	public PongApp() {
		super("::PongApp::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		p.add(pN,"North");
		pN.setBackground(Color.cyan);
		
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
		
		lb=new JLabel("��  �� : ");
		tfName=new JTextField(20);
		btAdd=new JButton("��   ��");
		btSave=new JButton("��   ��");
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		//������ ����----
		MyEventHandler handler=new MyEventHandler();
		
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler);//�Է��� ����ġ�� ActionEvent�߻���
		
		
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//---------------------------
	/**��ư�� ���� �̺�Ʈ�� ó���ϴ� Ŭ����*/
	class MyEventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btAdd || obj==tfName ) {
				//setTitle("add");
				//1) tfName�� �Է��� ���� ������ 
				//public String getText()
				String name=tfName.getText();
				//System.out.println(name);
				name=name.trim();//�յ� ���� �����ؼ� ���Ҵ�
				try {
					//2) �Է��� ���� '��'�� �����Ͽ� '��'���� "XXX�� ȯ���մϴ�"�� Ÿ��Ʋ�� ����ϱ�
					char fname=name.charAt(0);
					if(fname=='��') {
						setTitle(name+"�� ȯ���մϴ�");
						//ta.setText(name);
						ta.append(name+"\n");
						
					}else if(fname=='��') {
						//����� ���� ���ܰ�ü�� �߻���Ų��.==> throw new ���ܰ�ü();
						//���ܰ� �߻��� �Ǹ� �ش� ���ܸ� try~catch�ؾ� �Ѵ�.
						throw new NotSupportedNameException("�ι�� ����� ����� �� ����!!");
					}else {
						throw new NotSupportedNameException("������ �ƴ� �����е��� �̿뿡 ������ �ֽ��ϴ�");
					}
				
				}catch(NotSupportedNameException ex) {
					String msg=ex.getMessage();
					setTitle(msg);
					//�޽��� �ڽ� ����
					JOptionPane.showMessageDialog(p, msg);
					
				}finally {
					tfName.setText("");
					tfName.requestFocus();//�Է� ��Ŀ�� �ֱ�
				}
				
			}else if(obj==btSave) {
				//setTitle("save");
				String content=ta.getText();
				if(content.trim().isEmpty()) {//������ ���ٸ�
					//JOptionPane.showInputDialog() �˻�â
					JOptionPane.showMessageDialog(p, "������ ������ �����.");
					return;
				}
				//������ �ִٸ�
				String fileName="C:/myjava/PongList.txt";
				try {
					FileWriter fw=new FileWriter(fileName);
					fw.write(content);
					fw.flush();
					fw.close();
					setTitle(fileName+"�� ���� �Ϸ�!!!");
				}catch(IOException ex) {
					setTitle("���� ���� �� ����"+ex.getMessage());
				}
				
			}
			
		}
		
	}//////////////

	public static void main(String[] args) {
		new PongApp();
	}

}

