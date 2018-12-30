package 机票;

import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;

public class wish extends JFrame{
	JButton button_wish;
	public wish(){
		setTitle("退票");
		setBounds(60,10,520,210);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init()
	{
		button_wish=new JButton("祝您旅途愉快，一路顺风！");
		button_wish.setBounds(5,5,490,140);
		button_wish.setForeground(Color.red);
		button_wish.setFont(new Font("楷体",Font.BOLD,24));
		button_wish.setBackground(Color.black);
	    add(button_wish);
	}
}
