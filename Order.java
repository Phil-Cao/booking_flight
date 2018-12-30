package ��Ʊ;

import javax.swing.*;
import static javax.swing.JFrame.*; //����JFrame�ľ�̬����
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
    
    //�ļ�·��+����
    private static String filenameTemp;
    public static boolean createFile(String fileName,String filecontent){
        Boolean bool = false;
        filenameTemp = path+fileName+".txt";//�ļ�·��+����+�ļ�����
        File file = new File(filenameTemp);
        try {
            //����ļ������ڣ��򴴽��µ��ļ�
            if(!file.exists()){
                file.createNewFile();
                bool = true;
                System.out.println("success create file,the file is "+filenameTemp);
                //�����ļ��ɹ���д�����ݵ��ļ���
                writeFileContent(filenameTemp, filecontent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bool;
    }
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{
        Boolean bool = false;
        String filein = newstr+"\r\n"+'\n';//��д����У�����
        String temp  = "";
        
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//�ļ�·��(�����ļ�����)
            //���ļ�����������
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            
            //�ļ�ԭ������
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // ������֮��ķָ��� �൱�ڡ�\n��
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
            //��Ҫ���ǹر�
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
		setTitle("������Ϣ");
		setBounds(60,10,420,640);
		this.getContentPane().setBackground(Color.blue);
		setLayout(null);		
		init();   //��ӿؼ��Ĳ�����װ��һ������         
		setVisible(true);//��������������ִ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init()
	{
		//MyExtendsJFrame p=new MyExtendsJFrame();
		//buy p1=new buy();
		button_order=new JButton("��������");
		button_order.setBounds(5,5,390,50);
		button_order.setForeground(Color.black);
		button_order.setFont(new Font("�����п�",Font.BOLD,24));
		button_order.setBackground(Color.white);
	    add(button_order);
	    
	    Text_1=new JTextArea();
	    Text_1.setFont(new Font("����",Font.BOLD,24));
	    Text_1.setBackground(Color.white);
	    Text_1.setBounds(5,55,390,420);
	    add(Text_1);
	    

	    Text_1.setText("�������"+s+'\n');
	    Text_1.setText(Text_1.getText()+"�𾴵�"+frame3.text1.getText()+'\n');
	    Text_1.setText(Text_1.getText()+"��Ԥ����"+frame2.Text1.getText()+"�ηɻ�"+frame2.Text2.getText()+"��λ"+'\n');
	    Text_1.setText(Text_1.getText()+"����"+frame3.text4.getText()+"���"+'\n');
	    Text_1.setText(Text_1.getText()+"�����˶����������Ϣ��"+'\n'+"���֤�ţ�"+'\n'+frame3.text2.getText()+'\n');
	    Text_1.setText(Text_1.getText()+"���պţ�"+'\n'+frame3.text3.getText()+'\n');
	    
		button_buy=new JButton("ȷ�Ϲ���");
		button_buy.setBounds(5,500,150,70);
		button_buy.setForeground(Color.black);
		button_buy.setFont(new Font("�����п�",Font.BOLD,24));
		button_buy.setBackground(Color.white);
	    add(button_buy);
	    button_buy.addActionListener(this);
	    
		button_refund=new JButton("��Ʊ");
		button_refund.setBounds(220,500,130,70);
		button_refund.setForeground(Color.black);
		button_refund.setFont(new Font("�����п�",Font.BOLD,24));
		button_refund.setBackground(Color.white);
	    add(button_refund);
	    button_refund.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_refund){
			refund frame2=new refund(this.frame3);
		}
		if(e.getSource()==button_buy){
			u = "����"+String.valueOf(s)+"  ";
		    createFile(u, Text_1.getText());
		    SqlOrder so=new SqlOrder(this,this.frame3,this.frame2);
		    so.order();
			wish frame4=new wish();
		}
	}
}
