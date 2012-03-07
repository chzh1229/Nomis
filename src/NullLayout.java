import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayout extends JFrame {

	private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	private JLabel label;
	boolean isTrue;
	
	public NullLayout() {
		// TODO Auto-generated constructor stub
		super("空布局");
		isTrue=true;
		
		final JLabel label = new JLabel();
		
		Container c = getContentPane();
		c.setLayout(null);
		jb0 = new JButton("按钮0");
		jb1 = new JButton("按钮1");
		jb2 = new JButton("按钮2");
		jb3 = new JButton("按钮3");
		jb4 = new JButton("按钮4");
		jb5 = new JButton("按钮5");
		jb6 = new JButton("按钮6");
		jb7 = new JButton("按钮7");
		jb8 = new JButton("按钮8");
		jb9 = new JButton("按钮9");
		
		jb1.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 9");
			     isTrue=!isTrue;
			    
			    }
		 
			   }
		 });
		
		//参数分别为x坐标、y坐标、宽、高
		jb0.setBounds(0, 1, 100, 30);
		c.add(jb0);
		
		jb1.setBounds(105, 1, 100, 30);
		c.add(jb1);
		
		jb2.setBounds(205, 1, 100, 30);
		c.add(jb2);
		
		jb3.setBounds(305, 1, 100, 30);
		c.add(jb3);
		
		jb4.setBounds(405, 1, 100, 30);
		c.add(jb4);
		
		
		jb5.setBounds(0, 35, 100, 30);
		c.add(jb5);
		
		jb6.setBounds(105, 35, 100, 30);
		c.add(jb6);
		
		jb7.setBounds(205, 35, 100, 30);
		c.add(jb7);
		
		jb8.setBounds(305, 35, 100, 30);
		c.add(jb8);
		
		jb9.setBounds(405, 35, 100, 30);
		c.add(jb9);
		
		
		c.add(label,BorderLayout.SOUTH);
		
		setSize(520, 400);
		setVisible(true);
//关闭窗口时，关闭运行程序
                                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new NullLayout();
	}
}
