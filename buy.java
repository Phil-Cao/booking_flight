package 机票;
import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
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
		setTitle("机票预订界面");
		setBounds(60,10,400,350);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void init() {
	    fname=new JButton("班次");
	    fname.setBounds(5,5,150,70);
	    fname.setForeground(Color.red);
	    fname.setFont(new Font("华文行楷",Font.BOLD,24));
	    fname.setBackground(Color.black);
	    add(fname);
	    
	    Text1=new JTextField(20);
	    Text1.setFont(new Font("宋体",Font.BOLD,24));
	    Text1.setBounds(160,5,200,70);//设置大小和位置 
	    add(Text1);
	    
	    rank=new JButton("舱位（1-3）");
	    rank.setBounds(5,90,150,70);
	    rank.setForeground(Color.red);
	    rank.setFont(new Font("华文行楷",Font.BOLD,20));
	    rank.setBackground(Color.black);
	    add(rank);
	    
	    Text2=new JTextField(20);
	    Text2.setFont(new Font("宋体",Font.BOLD,24));
	    Text2.setBounds(160,90,200,70);//设置大小和位置 
	    add(Text2);
	    
	    Buy=new JButton("确定购买");
	    Buy.setBounds(30,200,140,70);
	    Buy.setForeground(Color.red);
	    Buy.setFont(new Font("华文行楷",Font.BOLD,24));
	    Buy.setBackground(Color.black);
	    add(Buy);
	    Buy.addActionListener(this);
	    
	    quit=new JButton("取消");
	    quit.setBounds(180,200,140,70);
	    quit.setForeground(Color.red);
	    quit.setFont(new Font("华文行楷",Font.BOLD,24));
	    quit.setBackground(Color.black);
	    add(quit);
	    quit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){	
		if(Text1.getText().equals("")||Text2.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this, "信息不能为空");
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
