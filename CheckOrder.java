package 机票;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class CheckOrder {
	static Connection conn;
	static ResultSet res;
	static Statement sq;
	private MyExtendsJFrame a1;
	String num;
	public CheckOrder(MyExtendsJFrame am1) {
		a1=am1;
	}
	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-TPMMOND:1433;DatabaseName=机票","sa","czy");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void check()
	{
		CheckOrder c = new CheckOrder(a1);
		conn=c.getConnection();
		try {
			sq=conn.createStatement();
			String un=a1.text1.getText();
			//String un2=String.valueOf(un1);
			//System.out.println(un1);
			//JTextField f=MyExtendsJFrame.text9;
			res=sq.executeQuery("select * from dingpiao where"+" name like '"+un+"'");
			if(res.next()) {
				num="D:/file/"+"订单"+res.getString("dingpiaono")+".txt";
				 try {
						Desktop.getDesktop().open(new File(num));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			else {
				// TODO Auto-generated catch block
				JOptionPane.showInputDialog(this, "您还未购票！");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public void refund() {
		// TODO Auto-generated method stub
		CheckOrder c1 = new CheckOrder(a1);
		conn = c1.getConnection();
		try {
			sq=conn.createStatement();
			String un=a1.text1.getText();
			//String un2=String.valueOf(un1);
			//System.out.println(un1);
			//JTextField f=MyExtendsJFrame.text9;
			res=sq.executeQuery("select * from dingpiao where"+" name like '"+un+"'");
			//num="D:/file/"+"订单"+res.getString("dingpiaono")+".txt";
			if(res.next()) {
				String num="D:/file/"+"订单"+res.getString("dingpiaono")+".txt";
				File f = new File(num); // 输入要删除的文件位置
                if(f.exists())
                {
                	f.delete();
                }
				JOptionPane.showInputDialog(this,"退票成功！！");
                sq.executeQuery("delete from dingpiao where"+" name = '"+un+"'");
                
			}
			else {
				// TODO Auto-generated catch block
				JOptionPane.showInputDialog(this, "您还未购票！");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
