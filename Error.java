package ��Ʊ;

import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
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
		setTitle("����");
		setBounds(60,10,530,350);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init()
	{
	    atext=new JTextField(20);
	    atext.setText("������ע�ᣨ�û��������벻���ڣ���");
	    atext.setBounds(5,5,500,150);//���ô�С��λ�� 
	    atext.setFont(new Font("����",Font.BOLD,22));
	    add(atext);
	    
	    abutton=new JButton("ȷ��");
	    abutton.setBounds(200,200,100,70);
	    abutton.setForeground(Color.black);
	    abutton.setFont(new Font("���Ŀ���",Font.BOLD,24));
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
