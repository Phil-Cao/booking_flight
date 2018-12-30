package 机票;

import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.awt.*;

public class Log extends JFrame implements ActionListener{
	JTextField text11,text41,text51,text61,text71,text81;
	JPasswordField text21,text31;
	JTextField text910;
	JButton button_number11,button_number21,button_number31,button_number41,button_number51,button_number61,button_number71,button_number81,button_number91,button_number910,button_number01;
	public Log(){
		setTitle("用户注册系统");
		setBounds(60,10,500,990);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init(){//添加的控件
	    button_number11=new JButton("用户名");
	    button_number11.setBounds(5,5,130,70);
	    button_number11.setForeground(Color.red);
	    button_number11.setFont(new Font("华文行楷",Font.BOLD,24));
	    button_number11.setBackground(Color.black);
	    add(button_number11);    
	    button_number11.addActionListener(this);//添加关联
	     
	    text11=new JTextField(20);
	    text11.setBounds(140,5,300,70);//设置大小和位置 
	    add(text11);//添加到窗口
	    
	    button_number21=new JButton("密码");
	    button_number21.setBounds(5,90,130,70);
	    button_number21.setForeground(Color.red);
	    button_number21.setFont(new Font("华文行楷",Font.BOLD,22));
	    button_number21.setBackground(Color.black);
	    add(button_number21);       

	    text21=new JPasswordField(20);
	    text21.setEchoChar('*');
	    text21.setBounds(140,90,300,70);//设置大小和位置 
	    add(text21);//添加到窗口
	       
	    button_number31=new JButton("确认密码");
	    button_number31.setBounds(5,180,130,70);
	    button_number31.setForeground(Color.red);
	    button_number31.setFont(new Font("华文行楷",Font.BOLD,22));
	    button_number31.setBackground(Color.black);
	    add(button_number31);

	    text31=new JPasswordField(20);
	    text31.setEchoChar('*');
	    text31.setBounds(140,180,300,70);//设置大小和位置 
	    add(text31);//添加到窗口  
	              
	    button_number41=new JButton("姓名");
	    button_number41.setBounds(5,270,130,70);
	    button_number41.setForeground(Color.red);
	    button_number41.setFont(new Font("华文行楷",Font.BOLD,24));
	    button_number41.setBackground(Color.black);
	    add(button_number41);
	    
	    text41=new JTextField(20);
	    text41.setBounds(140,270,300,70);//设置大小和位置 
	    add(text41);//添加到窗口  
	       
	    button_number51=new JButton("身份证号");
	    button_number51.setBounds(5,360,130,70);
	    button_number51.setForeground(Color.red);
	    button_number51.setFont(new Font("华文行楷",Font.BOLD,22));
	    button_number51.setBackground(Color.black);
	    add(button_number51);
	 
	    text51=new JTextField(20);
	    text51.setBounds(140,360,300,70);//设置大小和位置 
	    add(text51);//添加到窗口 
	       
	    button_number61=new JButton("性别");
	    button_number61.setBounds(5,450,130,70);
	    button_number61.setForeground(Color.red);
	    button_number61.setFont(new Font("华文行楷",Font.BOLD,24));
	    button_number61.setBackground(Color.black);
	    add(button_number61);
	    
	    text61=new JTextField(20);
	    text61.setBounds(140,450,300,70);//设置大小和位置 
	    add(text61);//添加到窗口 
	       
	    button_number71=new JButton("护照号");
	    button_number71.setBounds(5,540,130,70);
	    button_number71.setForeground(Color.red);
	    button_number71.setFont(new Font("华文行楷",Font.BOLD,24));
	    button_number71.setBackground(Color.black);
	    add(button_number71);

	    text71=new JTextField(20);
	    text71.setBounds(140,540,300,70);//设置大小和位置 
	    add(text71);//添加到窗口 
	       
	    button_number81=new JButton("工作单位");
	    button_number81.setBounds(5,630,130,70);
	    button_number81.setForeground(Color.red);
	    button_number81.setFont(new Font("华文行楷",Font.BOLD,22));
	    button_number81.setBackground(Color.black);
	    add(button_number81);
	    button_number81.addActionListener(this);
	    
	    button_number910=new JButton("旅行社");
	    button_number910.setBounds(5,720,130,70);
	    button_number910.setForeground(Color.red);
	    button_number910.setFont(new Font("华文行楷",Font.BOLD,22));
	    button_number910.setBackground(Color.black);
	    add(button_number910);
	    button_number910.addActionListener(this);
	    
	    text910 = new JTextField(20);
	    text910.setBounds(140,720,300,70);//设置大小和位置 
	    add(text910);//添加到窗口 
	    
	    text81=new JTextField(20);
	    text81.setBounds(140,630,300,70);//设置大小和位置 
	    add(text81);//添加到窗口 
	    
	    button_number91=new JButton("确认");
	    button_number91.setBounds(100,830,100,70);
	    button_number91.setForeground(Color.red);
	    button_number91.setFont(new Font("楷体",Font.BOLD,30));
	    button_number91.setBackground(Color.black);
	    add(button_number91);
	    button_number91.addActionListener(this);
	    
	    button_number01=new JButton("退出");
	    button_number01.setBounds(250,830,100,70);
	    button_number01.setForeground(Color.red);
	    button_number01.setFont(new Font("楷体",Font.BOLD,30));
	    button_number01.setBackground(Color.black);
	    add(button_number01);
	    button_number01.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_number91)
		{
            if(!String.valueOf(text21.getPassword()).equals(String.valueOf(text31.getPassword())))
			{
				JOptionPane.showMessageDialog(this, "两次输入的密码不一致，请重新输入");
			}
			else if(text11.getText().equals("")||text21.getText().equals("")||text41.getText().equals("")
					||text51.getText().equals("")||text61.getText().equals("")||text71.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "信息不能为空");
			}
			else
			{
				Sqlregister sqlr = new Sqlregister(this);
				sqlr.register();
				JOptionPane.showMessageDialog(this, "注册成功！");
			}

		}
		if(e.getSource()==button_number01)
		{
			setVisible(false);
		}
	}
	
}
