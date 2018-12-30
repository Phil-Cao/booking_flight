package 机票;

import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;

public class Error extends JFrame implements ActionListener{
	JButton abutton;
	JTextField atext;
	private MyExtendsJFrame2 aa;
	public Error(MyExtendsJFrame2 am1){
		aa = am1;
		setTitle("错误");
		setBounds(60,10,530,350);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init()
	{
	    atext=new JTextField(20);
	    atext.setText("请您先注册（用户名与密码不存在）！");
	    atext.setBounds(5,5,500,150);//设置大小和位置 
	    atext.setFont(new Font("楷体",Font.BOLD,22));
	    add(atext);
	    
	    abutton=new JButton("确定");
	    abutton.setBounds(200,200,100,70);
	    abutton.setForeground(Color.black);
	    abutton.setFont(new Font("华文楷体",Font.BOLD,24));
	    abutton.setBackground(Color.white);
	    add(abutton);
	    abutton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==abutton)
		{
			aa.registerbutton.doClick();
			setVisible(false);
		}
	}
}
