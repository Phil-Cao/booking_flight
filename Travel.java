package 机票;

import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.util.*;
import java.lang.*;

class MyExtendsJFrame4 extends JFrame implements ActionListener{
	JTextField text1;
	JTextArea text9;//创建文本框对象
	JScrollPane js;
	JButton button_number1,button_number81,button_number12;
	//private MyExtendsJFrame a1;

	public MyExtendsJFrame4(){
		setTitle("机票预订系统");
		setBounds(60,10,1425,950);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	void init(){//添加的控件
    button_number1=new JButton("旅行社");
    button_number1.setBounds(5,5,130,70);
    button_number1.setForeground(Color.red);
    button_number1.setFont(new Font("华文行楷",Font.BOLD,24));
    button_number1.setBackground(Color.black);
    add(button_number1);    
     
    text1=new JTextField(20);
    text1.setFont(new Font("宋体",Font.BOLD,24));
    text1.setBounds(140,5,350,70);//设置大小和位置 
    add(text1);//添加到窗口
    
    button_number81=new JButton("查询用户");
    button_number81.setBounds(300,740,150,100);
    button_number81.setForeground(Color.red);
    button_number81.setFont(new Font("楷体",Font.BOLD,26));
    button_number81.setBackground(Color.black);
    add(button_number81);
    button_number81.addActionListener(this);
    
    JButton button_number10 = new JButton("查询结果： ");
    button_number10.setBounds(500,5,500,70);
    button_number10.setForeground(Color.black);
    button_number10.setFont(new Font("华文楷体",Font.BOLD,24));
    button_number10.setBackground(Color.white);
    add(button_number10);
    button_number10.addActionListener(this);
    
    text9=new JTextArea();
    text9.setFont(new Font("宋体",Font.BOLD,22));
    text9.setBounds(500,80,500,630);//设置大小和位置 
    add(text9);//添加到窗口
    js = new JScrollPane(text9);
	js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	js.setBounds(500,80,500,630);
	add(js);
    
    button_number12=new JButton("退出");
    button_number12.setBounds(900,740,150,100);
    button_number12.setForeground(Color.red);
    button_number12.setFont(new Font("楷体",Font.BOLD,30));
    button_number12.setBackground(Color.black);
    add(button_number12);
    button_number12.addActionListener(this);
    
	}


	public void actionPerformed(ActionEvent e){	
		if(e.getSource()==button_number81){
			SqlTravel sq = new SqlTravel(this);
			sq.query();
		}
		if(e.getSource()==button_number12)
		{
			setVisible(false);
		}
	}
}

