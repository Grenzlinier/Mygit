package Appgragh;
import java.awt.*;

import javax.swing.*;



public class AppGraphInOut {

	public static void main(String args[]) {
		new AppFrame();
	}
	
}
class AppFrame extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1056164429323649010L;
	JTextField in =new JTextField(10);
	JButton btn=new JButton("��ƽ��");
	JLabel out=new JLabel("������ʾ����ı�ǩ");
	
	public AppFrame() 
	{
		setLayout(new FlowLayout());
		getContentPane().add(in);
		getContentPane().add(btn);
		getContentPane().add(out);
		btn.addActionListener(e->{
			String s=in.getText();
			double d=Double.parseDouble(s);
			double sq=d*d;
			out.setText(d+"��ƽ���ǣ�"+sq);
		});
		setSize(400,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
		
		

	
}
