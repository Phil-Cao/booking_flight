package ��Ʊ;
import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
public class refund extends JFrame implements ActionListener{
	JButton button_ask,button_confirm,button_back;
	private MyExtendsJFrame my;

	public refund(MyExtendsJFrame my1){
		my = my1;
		setTitle("��Ʊ");
		setBounds(60,10,320,430);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init()
	{
		button_ask=new JButton("��ȷ��Ҫ��Ʊ��");
		button_ask.setBounds(5,5,290,290);
		button_ask.setForeground(Color.black);
		button_ask.setFont(new Font("����",Font.BOLD,24));
		button_ask.setBackground(Color.white);
	    add(button_ask);
	    
		button_confirm=new JButton("ȷ��");
		button_confirm.setBounds(30,300,120,70);
		button_confirm.setForeground(Color.black);
		button_confirm.setFont(new Font("�����п�",Font.BOLD,26));
		button_confirm.setBackground(Color.white);
	    add(button_confirm);
	    button_confirm.addActionListener(this);
	    
		button_back=new JButton("ȡ��");
		button_back.setBounds(170,300,120,70);
		button_back.setForeground(Color.black);
		button_back.setFont(new Font("�����п�",Font.BOLD,26));
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
