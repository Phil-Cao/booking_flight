package 机票;

import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.util.Random;
import java.io.File;  
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException; 
//import java.util.UUID;

public class Order extends JFrame implements ActionListener{
	JTextArea Text_1;
	JButton button_order,button_buy,button_refund;
	private buy frame2;
	private MyExtendsJFrame frame3;
    private static String path = "D:\\file\\";
    String u;
    Random random= new Random();
	int s = random.nextInt(99999999)%(90000000) + 10000000;
    
    //文件路径+名称
    private static String filenameTemp;
    public static boolean createFile(String fileName,String filecontent){
        Boolean bool = false;
        filenameTemp = path+fileName+".txt";//文件路径+名称+文件类型
        File file = new File(filenameTemp);
        try {
            //如果文件不存在，则创建新的文件
            if(!file.exists()){
                file.createNewFile();
                bool = true;
                System.out.println("success create file,the file is "+filenameTemp);
                //创建文件成功后，写入内容到文件里
                writeFileContent(filenameTemp, filecontent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bool;
    }
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{
        Boolean bool = false;
        String filein = newstr+"\r\n"+'\n';//新写入的行，换行
        String temp  = "";
        
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//文件路径(包括文件名称)
            //将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            
            //文件原有内容
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // 行与行之间的分隔符 相当于“\n”
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);
            
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }
	
	public Order(buy aframe2,MyExtendsJFrame aframe3){
		frame2=aframe2;
		frame3=aframe3;
		setTitle("订单信息");
		setBounds(60,10,420,640);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init()
	{
		//MyExtendsJFrame p=new MyExtendsJFrame();
		//buy p1=new buy();
		button_order=new JButton("订单详情");
		button_order.setBounds(5,5,390,50);
		button_order.setForeground(Color.black);
		button_order.setFont(new Font("华文行楷",Font.BOLD,24));
		button_order.setBackground(Color.white);
	    add(button_order);
	    
	    Text_1=new JTextArea();
	    Text_1.setFont(new Font("宋体",Font.BOLD,24));
	    Text_1.setBackground(Color.white);
	    Text_1.setBounds(5,55,390,420);
	    add(Text_1);
	    

	    Text_1.setText("订单编号"+s+'\n');
	    Text_1.setText(Text_1.getText()+"尊敬的"+frame3.text1.getText()+'\n');
	    Text_1.setText(Text_1.getText()+"您预订的"+frame2.Text1.getText()+"次飞机"+frame2.Text2.getText()+"座位"+'\n');
	    Text_1.setText(Text_1.getText()+"将于"+frame3.text4.getText()+"起飞"+'\n');
	    Text_1.setText(Text_1.getText()+"请您核对您的身份信息，"+'\n'+"身份证号："+'\n'+frame3.text2.getText()+'\n');
	    Text_1.setText(Text_1.getText()+"护照号："+'\n'+frame3.text3.getText()+'\n');
	    
		button_buy=new JButton("确认购买");
		button_buy.setBounds(5,500,150,70);
		button_buy.setForeground(Color.black);
		button_buy.setFont(new Font("华文行楷",Font.BOLD,24));
		button_buy.setBackground(Color.white);
	    add(button_buy);
	    button_buy.addActionListener(this);
	    
		button_refund=new JButton("退票");
		button_refund.setBounds(220,500,130,70);
		button_refund.setForeground(Color.black);
		button_refund.setFont(new Font("华文行楷",Font.BOLD,24));
		button_refund.setBackground(Color.white);
	    add(button_refund);
	    button_refund.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_refund){
			refund frame2=new refund(this.frame3);
		}
		if(e.getSource()==button_buy){
			u = "订单"+String.valueOf(s)+"  ";
		    createFile(u, Text_1.getText());
		    SqlOrder so=new SqlOrder(this,this.frame3,this.frame2);
		    so.order();
			wish frame4=new wish();
		}
	}
}
