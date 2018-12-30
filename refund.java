package 机票;
import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
public class refund extends JFrame implements ActionListener{
	JButton button_ask,button_confirm,button_back;
	private MyExtendsJFrame my;

	public refund(MyExtendsJFrame my1){
		my = my1;
		setTitle("退票");
		setBounds(60,10,320,430);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init()
	{
		button_ask=new JButton("您确定要退票吗？");
		button_ask.setBounds(5,5,290,290);
		button_ask.setForeground(Color.black);
		button_ask.setFont(new Font("楷体",Font.BOLD,24));
		button_ask.setBackground(Color.white);
	    add(button_ask);
	    
		button_confirm=new JButton("确定");
		button_confirm.setBounds(30,300,120,70);
		button_confirm.setForeground(Color.black);
		button_confirm.setFont(new Font("华文行楷",Font.BOLD,26));
		button_confirm.setBackground(Color.white);
	    add(button_confirm);
	    button_confirm.addActionListener(this);
	    
		button_back=new JButton("取消");
		button_back.setBounds(170,300,120,70);
		button_back.setForeground(Color.black);
		button_back.setFont(new Font("华文行楷",Font.BOLD,26));
		button_back.setBackground(Color.white);
	    add(button_back);
	    button_back.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_back)
		{
			setVisible(false);
		}
		if(e.getSource()==button_confirm)
		{
			setVisible(false);
			CheckOrder cor=new CheckOrder(this.my);
			cor.refund();
		}
	}
}
