package 机票;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//import com.lzw.sql.*;

class BackgroundPanel extends JPanel {
	Image im;
	public BackgroundPanel(Image im){
    this.im=im;
    this.setOpaque(true);
    }

public void paintComponent(Graphics g){//从左上角开始画图片
   super.paintComponents(g);
   g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);
   }
}
class MyExtendsJFrame2 extends JFrame implements ActionListener{
	//static Connection con=Conn.getConnection();
	//static Statement  st,st1;
	//static ResultSet  res;
	//static PreparedStatement  pst;
	Container ct;//创建一个容器
	BackgroundPanel bgp1,bgp2;//创建背景面板
	JPanel p1;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6;
	JLabel user,ps,identity;
	JTextField textfield;
	JPasswordField password;
	JComboBox  jcb;
	Box box1,box2,box3;
	JButton  loginbutton,clearbutton,registerbutton;
	public MyExtendsJFrame2(){//
		ct=this.getContentPane();
		this.setLayout(null);//不采用任何布局方式
		init1();
		setTitle("系统登录");
		this.setSize(720,790);
		this.setLocation(300,80);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}
	public static void main(String[] args){
		new MyExtendsJFrame2();
		}
void init1() {
	bgp1=new BackgroundPanel((new ImageIcon(register.class.getResource("1.jpg"))).getImage());
	bgp1.setBounds(0,0,700,200);
	jl1=new JLabel("The new China is Arriving");
	jl1.setFont(new Font("华文彩云",Font.PLAIN,30));
	jl1.setForeground(Color.cyan);
	jl1.setHorizontalAlignment(SwingConstants.CENTER);
	ct.add(bgp1);bgp1.add(jl1);
	
	
	jl2=new JLabel("用户登录");
	jl2.setFont(new Font("黑体",Font.PLAIN,30));
	jl2.setForeground(Color.blue);
	jl2.setHorizontalAlignment(SwingConstants.CENTER);
	jl2.setBounds(0, 200, 400, 50);
	bgp2=new BackgroundPanel((new ImageIcon(register.class.getResource("3.jpg"))).getImage());
	bgp2.setBounds(0,250,400,550);
	ct.add(bgp2);ct.add(jl2);
	
	user=new JLabel("用户名:");
	user.setForeground(Color.red);
	user.setFont(new Font("宋体",Font.BOLD,26));
	ps=new JLabel("密  码:");
	ps.setForeground(Color.red);
	ps.setFont(new Font("宋体",Font.BOLD,26));
	identity=new JLabel("身  份:");
	identity.setForeground(Color.red);
	identity.setFont(new Font("宋体",Font.BOLD,26));
	box1=Box.createVerticalBox();
	box1.add(Box.createVerticalStrut(40));
	box1.add(user);
	box1.add(Box.createVerticalStrut(40));
	box1.add(ps);
	box1.add(Box.createVerticalStrut(40));
	box1.add(identity);
	bgp2.add(box1);
	
	textfield=new JTextField(25);
	textfield.setFont(new Font("宋体",Font.PLAIN,18));
	 password=new JPasswordField(25);
	 password.setFont(new Font("宋体",Font.PLAIN,18));
	 password.addActionListener(this);
	 jcb=new JComboBox();
	jcb.setFont(new Font("宋体",Font.PLAIN,16));
	jcb.addItem("读者");
	jcb.addItem("期刊管理员");
	//jcb.addItem("旅行社员工");
	box2=Box.createVerticalBox();
	box2.add(Box.createVerticalStrut(40));
	box2.add(textfield);
	box2.add(Box.createVerticalStrut(40));
	box2.add(password);
	box2.add(Box.createVerticalStrut(40));
	box2.add(jcb);
	bgp2.add(box2);
	
	 loginbutton=new JButton("登录");
	 loginbutton.addActionListener(this);
	 loginbutton.setFont(new Font("宋体",Font.PLAIN,18));
	 clearbutton=new JButton("重置");
	 clearbutton.addActionListener(this);
	 clearbutton.setFont(new Font("宋体",Font.PLAIN,18));
	box3=Box.createHorizontalBox();
	box3.add(Box.createVerticalStrut(70));
	box3.add(Box.createHorizontalStrut(40));
	box3.add(loginbutton);
	box3.add(Box.createHorizontalStrut(40));
	box3.add(clearbutton);
	bgp2.add(box3);
	
	registerbutton=new JButton("注册");
	registerbutton.addActionListener(this);
	registerbutton.setFont(new Font("宋体",Font.PLAIN,24));
	registerbutton.setBounds(500, 650, 100, 40);
	registerbutton.setBackground(Color.LIGHT_GRAY);
	ct.add(registerbutton);
	
	jl3=new JLabel("新用户注册");
	jl3.setBounds(450, 250, 300, 50);
	jl3.setFont(new Font("宋体",Font.PLAIN,40));
	
	jl4=new JLabel("1、免费注册");
	jl4.setBounds(450, 350, 300, 70);
	jl4.setFont(new Font("宋体",Font.PLAIN,24));
	
	jl5=new JLabel("2、实名注册");
	jl5.setBounds(450, 450, 300, 70);
	jl5.setFont(new Font("宋体",Font.PLAIN,24));
	

	jl6=new JLabel("3、人机交互界面");
	jl6.setBounds(450, 550, 300, 70);
	jl6.setFont(new Font("宋体",Font.PLAIN,24));
	ct.add(jl3);ct.add(jl4);ct.add(jl5);ct.add(jl6);
	}
	
	public void actionPerformed(ActionEvent e){	
		int flag=0;
		String username=textfield.getText();
		String pwd=String.valueOf(password.getPassword());
		String role=String.valueOf(jcb.getSelectedItem());
		if(e.getSource()==registerbutton)
		{
			Log log=new Log();
			flag=1;
		}
		if((textfield.getText().equals("")||password.getText().equals(""))&&flag==0)
		{
			JOptionPane.showMessageDialog(this, "用户名或密码不能为空，请重新输入");
		}
	    else if(e.getSource()==loginbutton){
			//username=text_1.getText();
			//userpassword=text_2.getText();
	    	if(!username.equals("")&&!pwd.equals("")&&role.equals("读者"))
	    	{
	    		Sqlverify sqlv=new Sqlverify(this);
			    sqlv.verify();
	    	}
		
			if(!username.equals("")&&!pwd.equals("")&&role.equals("期刊管理员"))
			{
				Sqlverify sqlv1=new Sqlverify(this);
				sqlv1.verify1();
				MyExtendsJFrame3 m3=new MyExtendsJFrame3();
			}
			/*if(!username.equals("")&&!pwd.equals("")&&role.equals("旅行社员工"))
			{
				Sqlverify sqlv2=new Sqlverify(this);
				sqlv2.verify2();
			}*/
		}

	}
}

public class register {
	public static void main(String args[]) {    	
	      MyExtendsJFrame2 frame=new MyExtendsJFrame2();
	    }
}
