package ��Ʊ;

import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyExtendsJFrame3 extends JFrame implements ActionListener{
	JTextField text1,text2,text3,text4,text5,text6,text7,text8;
	JTextArea text9;//�����ı������
	JMenuItem menuitem11;
	JMenuItem menuitem12;
	JScrollPane js;
	JButton button_number1,button_number2,button_number3,button_number4,button_number5,button_number6,button_number7,button_number8,button_number9,button_number10,button_number11,button_number12;
	//private MyExtendsJFrame a1;
    JButton buttone;
	public MyExtendsJFrame3(){
		setTitle("��Ʊ����Աϵͳ");
		setBounds(60,10,1425,950);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	void init(){//��ӵĿؼ�
    button_number1=new JButton("�����");
    button_number1.setBounds(5,5,130,70);
    button_number1.setForeground(Color.red);
    button_number1.setFont(new Font("�����п�",Font.BOLD,24));
    button_number1.setBackground(Color.black);
    add(button_number1);    
     
    text1=new JTextField(20);
    text1.setFont(new Font("����",Font.BOLD,24));
    text1.setBounds(140,5,350,70);//���ô�С��λ�� 
    add(text1);//��ӵ�����
    
    button_number2=new JButton("����ʱ��");
    button_number2.setBounds(5,90,130,70);
    button_number2.setForeground(Color.red);
    button_number2.setFont(new Font("�����п�",Font.BOLD,22));
    button_number2.setBackground(Color.black);
    add(button_number2);       

    text2=new JTextField(25);
    text2.setFont(new Font("����",Font.BOLD,24));
    text2.setBounds(140,90,350,70);//���ô�С��λ�� 
    add(text2);//��ӵ�����
       
    button_number3=new JButton("����ʱ��");
    button_number3.setBounds(5,180,130,70);
    button_number3.setForeground(Color.red);
    button_number3.setFont(new Font("�����п�",Font.BOLD,22));
    button_number3.setBackground(Color.black);
    add(button_number3);

    text3=new JTextField(25);
    text3.setFont(new Font("����",Font.BOLD,24));
    text3.setBounds(140,180,350,70);//���ô�С��λ�� 
    add(text3);//��ӵ�����  
       
    button_number5=new JButton("������");
    button_number5.setBounds(5,270,130,70);
    button_number5.setForeground(Color.red);
    button_number5.setFont(new Font("�����п�",Font.BOLD,24));
    button_number5.setBackground(Color.black);
    add(button_number5);
 
    text5=new JTextField(20);
    text5.setFont(new Font("����",Font.BOLD,24));
    text5.setBounds(140,270,350,70);//���ô�С��λ�� 
    add(text5);//��ӵ����� 
       
    button_number6=new JButton("Ŀ�ĵ�");
    button_number6.setBounds(5,360,130,70);
    button_number6.setForeground(Color.red);
    button_number6.setFont(new Font("�����п�",Font.BOLD,24));
    button_number6.setBackground(Color.black);
    add(button_number6);
    
    text6=new JTextField(20);
    text6.setFont(new Font("����",Font.BOLD,24));
    text6.setBounds(140,360,350,70);//���ô�С��λ�� 
    add(text6);//��ӵ����� 
       
    button_number7=new JButton("״̬");
    button_number7.setBounds(5,450,130,70);
    button_number7.setForeground(Color.red);
    button_number7.setFont(new Font("�����п�",Font.BOLD,24));
    button_number7.setBackground(Color.black);
    add(button_number7);

    text7=new JTextField(20);
    text7.setFont(new Font("����",Font.BOLD,24));
    text7.setBounds(140,450,350,70);//���ô�С��λ�� 
    add(text7);//��ӵ����� 
    
    button_number8=new JButton("��������");
    button_number8.setBounds(300,740,150,100);
    button_number8.setForeground(Color.red);
    button_number8.setFont(new Font("����",Font.BOLD,26));
    button_number8.setBackground(Color.black);
    add(button_number8);
    button_number8.addActionListener(this);
       
    button_number9=new JButton("����");
    button_number9.setBounds(550,740,150,100);
    button_number9.setForeground(Color.red);
    button_number9.setFont(new Font("����",Font.BOLD,30));
    button_number9.setBackground(Color.black);
    add(button_number9);
    button_number9.addActionListener(this);

    
    button_number11 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("plane.jpg")));
    button_number11.setBounds(750,5,650,700);
    add(button_number11);
    
    button_number12=new JButton("�޸�");
    button_number12.setBounds(900,740,150,100);
    button_number12.setForeground(Color.red);
    button_number12.setFont(new Font("����",Font.BOLD,30));
    button_number12.setBackground(Color.black);
    add(button_number12);
    button_number12.addActionListener(this);
    
    
    buttone=new JButton("�˳�");
    buttone.setBounds(1100, 740, 150, 100);
    buttone.setForeground(Color.red);
    buttone.setFont(new Font("����",Font.BOLD,30));
    buttone.setBackground(Color.black);
    add(buttone);
    buttone.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e){	
		if(e.getSource()==button_number9){
			Sqlflight d = new Sqlflight(this);
			d.add();
			setVisible(false);
		}
		if(e.getSource()==button_number12)
		{
			Sqlflight d = new Sqlflight(this);
			d.updata();
		}
		if(e.getSource()==button_number8)
		{
			try {
				Desktop.getDesktop().open(new File("D://file//����.txt"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==buttone) {
			setVisible(false);
			
		}
		
	}
}


