package ��Ʊ;

import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.text.ParseException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyExtendsJFrame extends JFrame implements ActionListener{
	JTextField text1,text2,text3,text4,text5,text6,text7,text8;
	JTextArea text9;//�����ı������
	JMenuItem menuitem11;
	JMenuItem menuitem12,menuitem21;
	JScrollPane js;
	JButton button_number1,button_number2,button_number3,button_number4,button_number5,button_number6,button_number7,button_number8,button_number9,button_number10,button_number11,button_number12;
	//private MyExtendsJFrame a1;

	public MyExtendsJFrame(){
		setTitle("�ڿ�����ϵͳ");
		setBounds(60,10,1425,950);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	void init(){//��ӵĿؼ�
    button_number1=new JButton("����");
    button_number1.setBounds(5,5,130,70);
    button_number1.setForeground(Color.red);
    button_number1.setFont(new Font("�����п�",Font.BOLD,24));
    button_number1.setBackground(Color.black);
    add(button_number1);    
    button_number1.addActionListener(this);//��ӹ���
     
    text1=new JTextField(20);
    text1.setFont(new Font("����",Font.BOLD,24));
    text1.setBounds(140,5,210,70);//���ô�С��λ�� 
    add(text1);//��ӵ�����
    
    button_number2=new JButton("���֤��");
    button_number2.setBounds(5,90,130,70);
    button_number2.setForeground(Color.red);
    button_number2.setFont(new Font("�����п�",Font.BOLD,18));
    button_number2.setBackground(Color.black);
    add(button_number2);       

    text2=new JTextField(20);
    text2.setFont(new Font("����",Font.BOLD,20));
    text2.setBounds(140,90,210,70);//���ô�С��λ�� 
    add(text2);//��ӵ�����
       
    button_number3=new JButton("���պ�");
    button_number3.setBounds(5,180,130,70);
    button_number3.setForeground(Color.red);
    button_number3.setFont(new Font("�����п�",Font.BOLD,24));
    button_number3.setBackground(Color.black);
    add(button_number3);

    text3=new JTextField(20);
    text3.setFont(new Font("����",Font.BOLD,24));
    text3.setBounds(140,180,210,70);//���ô�С��λ�� 
    add(text3);//��ӵ�����  
              
    button_number4=new JButton("����ʱ��");
    button_number4.setBounds(5,270,130,70);
    button_number4.setForeground(Color.red);
    button_number4.setFont(new Font("�����п�",Font.BOLD,22));
    button_number4.setBackground(Color.black);
    add(button_number4);
    
    text4=new JTextField(20);
    text4.setFont(new Font("����",Font.BOLD,24));
    text4.setBounds(140,270,210,70);//���ô�С��λ�� 
    add(text4);//��ӵ�����  
       
    button_number5=new JButton("����ʱ��");
    button_number5.setBounds(5,360,130,70);
    button_number5.setForeground(Color.red);
    button_number5.setFont(new Font("�����п�",Font.BOLD,20));
    button_number5.setBackground(Color.black);
    add(button_number5);
 
    text5=new JTextField(20);
    text5.setFont(new Font("����",Font.BOLD,24));
    text5.setBounds(140,360,210,70);//���ô�С��λ�� 
    add(text5);//��ӵ����� 
       
    button_number6=new JButton("�Ա�");
    button_number6.setBounds(5,450,130,70);
    button_number6.setForeground(Color.red);
    button_number6.setFont(new Font("�����п�",Font.BOLD,24));
    button_number6.setBackground(Color.black);
    add(button_number6);
    
    text6=new JTextField(20);
    text6.setFont(new Font("����",Font.BOLD,24));
    text6.setBounds(140,450,210,70);//���ô�С��λ�� 
    add(text6);//��ӵ����� 
       
    button_number7=new JButton("������");
    button_number7.setBounds(5,540,130,70);
    button_number7.setForeground(Color.red);
    button_number7.setFont(new Font("�����п�",Font.BOLD,24));
    button_number7.setBackground(Color.black);
    add(button_number7);

    text7=new JTextField(20);
    text7.setFont(new Font("����",Font.BOLD,24));
    text7.setBounds(140,540,210,70);//���ô�С��λ�� 
    add(text7);//��ӵ����� 
       
    button_number8=new JButton("Ŀ�ĵ�");
    button_number8.setBounds(5,630,130,70);
    button_number8.setForeground(Color.red);
    button_number8.setFont(new Font("�����п�",Font.BOLD,24));
    button_number8.setBackground(Color.black);
    add(button_number8);
    button_number8.addActionListener(this);
    
    text8=new JTextField(20);
    text8.setFont(new Font("����",Font.BOLD,24));
    text8.setBounds(140,630,210,70);//���ô�С��λ�� 
    add(text8);//��ӵ����� 
       
    button_number9=new JButton("��ѯ");
    button_number9.setBounds(300,740,150,100);
    button_number9.setForeground(Color.red);
    button_number9.setFont(new Font("����",Font.BOLD,30));
    button_number9.setBackground(Color.black);
    add(button_number9);
    button_number9.addActionListener(this);

       
    button_number10=new JButton("��ѯ����� ");
    button_number10.setBounds(370,5,350,70);
    button_number10.setForeground(Color.black);
    button_number10.setFont(new Font("���Ŀ���",Font.BOLD,24));
    button_number10.setBackground(Color.white);
    add(button_number10);
    button_number10.addActionListener(this);
	
    text9=new JTextArea();
    text9.setFont(new Font("����",Font.BOLD,22));
    text9.setBounds(370,74,350,630);//���ô�С��λ�� 
    add(text9);//��ӵ�����
    js = new JScrollPane(text9);
	js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	js.setBounds(370,74,350,630);
	add(js);
    
    button_number11 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("plane.jpg")));
    
    button_number11.setBounds(750,5,650,700);
    add(button_number11);
    
    button_number12=new JButton("�˳�");
    button_number12.setBounds(900,740,150,100);
    button_number12.setForeground(Color.red);
    button_number12.setFont(new Font("����",Font.BOLD,30));
    button_number12.setBackground(Color.black);
    add(button_number12);
    button_number12.addActionListener(this);
    
	JMenuBar menubar = new JMenuBar();
    JMenu menu1 = new JMenu("����");
    menu1.setFont(new Font("����",Font.BOLD,24));
    menuitem11 = new JMenuItem("�ҵĶ���");
    menuitem11.setFont(new Font("����",Font.BOLD,24));
    menuitem12 = new JMenuItem("��Ʊ");
    menuitem12.setFont(new Font("����",Font.BOLD,24));
    
    JMenu menu2 = new JMenu("����");
    menu2.setFont(new Font("����",Font.BOLD,24));
    menuitem21 = new JMenuItem("�鿴����");
    menuitem21.setFont(new Font("����",Font.BOLD,24));

    setJMenuBar(menubar);
    menubar.add(menu1);
    menu1.add(menuitem11);
    menu1.add(menuitem12);
    //menu1.add(menuitem13);

    menubar.add(menu2);
    menu2.add(menuitem21);
    
    menuitem11.addActionListener(this);
    menuitem12.addActionListener(this);
    menuitem21.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e){	
		if(text7.equals(text8)) {
			JOptionPane.showMessageDialog(this, "���������뵽����в���һ��");	
		}
		else
		{
			if(e.getSource()==button_number9){
			buy frame=new buy(this);
			sql d = new sql(this);
			d.getConnection();
			try {
				d.select();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			if(e.getSource()==menuitem11) {
			CheckOrder co=new CheckOrder(this);
			co.check();
			}
			if(e.getSource()==menuitem12) {
			refund re=new refund(this);
		    //co.check();
			}
			if(e.getSource()==menuitem21) {
			try {
				Desktop.getDesktop().open(new File("D://file//����.txt"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    //co.check();
			}
			if(e.getSource()==button_number12)
			{
				setVisible(false);
			}
		}
	}
}


