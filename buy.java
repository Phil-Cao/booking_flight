package ��Ʊ;
import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;

public class buy extends JFrame implements ActionListener{
	JTextField Text1,Text2;
	JButton fname,rank,Buy,quit;
	//String flightnumber;
	private MyExtendsJFrame frame1;
	
	public buy(MyExtendsJFrame aframe1){
		frame1=aframe1;
		setTitle("��ƱԤ������");
		setBounds(60,10,400,350);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init() {
	    fname=new JButton("���");
	    fname.setBounds(5,5,150,70);
	    fname.setForeground(Color.red);
	    fname.setFont(new Font("�����п�",Font.BOLD,24));
	    fname.setBackground(Color.black);
	    add(fname);
	    
	    Text1=new JTextField(20);
	    Text1.setFont(new Font("����",Font.BOLD,24));
	    Text1.setBounds(160,5,200,70);//���ô�С��λ�� 
	    add(Text1);
	    
	    rank=new JButton("��λ��1-3��");
	    rank.setBounds(5,90,150,70);
	    rank.setForeground(Color.red);
	    rank.setFont(new Font("�����п�",Font.BOLD,20));
	    rank.setBackground(Color.black);
	    add(rank);
	    
	    Text2=new JTextField(20);
	    Text2.setFont(new Font("����",Font.BOLD,24));
	    Text2.setBounds(160,90,200,70);//���ô�С��λ�� 
	    add(Text2);
	    
	    Buy=new JButton("ȷ������");
	    Buy.setBounds(30,200,140,70);
	    Buy.setForeground(Color.red);
	    Buy.setFont(new Font("�����п�",Font.BOLD,24));
	    Buy.setBackground(Color.black);
	    add(Buy);
	    Buy.addActionListener(this);
	    
	    quit=new JButton("ȡ��");
	    quit.setBounds(180,200,140,70);
	    quit.setForeground(Color.red);
	    quit.setFont(new Font("�����п�",Font.BOLD,24));
	    quit.setBackground(Color.black);
	    add(quit);
	    quit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){	
		if(Text1.getText().equals("")||Text2.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this, "��Ϣ����Ϊ��");
		}
		else
		{
			if(e.getSource()==Buy){
			Sqlleft left=new Sqlleft(this);
			left.query();
			Order frame1=new Order(this,this.frame1);
			//flightnumber=Text1.getText();
			}

		}			
		if(e.getSource()==quit)
			{
				setVisible(false);
			}
	}
}
