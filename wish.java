package ��Ʊ;

import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;

public class wish extends JFrame{
	JButton button_wish;
	public wish(){
		setTitle("��Ʊ");
		setBounds(60,10,520,210);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init()
	{
		button_wish=new JButton("ף����;��죬һ·˳�磡");
		button_wish.setBounds(5,5,490,140);
		button_wish.setForeground(Color.red);
		button_wish.setFont(new Font("����",Font.BOLD,24));
		button_wish.setBackground(Color.black);
	    add(button_wish);
	}
}
