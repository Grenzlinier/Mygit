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
	JButton btn=new JButton("求平方");
	JLabel out=new JLabel("用于显示结果的标签");
	
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
			out.setText(d+"的平方是："+sq);
		});
		setSize(400,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
		
		

	
}
