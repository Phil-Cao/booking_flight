package ��Ʊ;

import java.sql.*;

import javax.swing.JOptionPane;

public class Sqlverify {
	static Connection conn;
	static ResultSet res;
	static Statement sq;
	private MyExtendsJFrame2 am;
	public Sqlverify(MyExtendsJFrame2 amy) {
		am = amy;
		//JTextField text=a1.text9;
	}
	public Connection getConnection() {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-TPMMOND:1433;DatabaseName=��Ʊ","sa","czy");
			} catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
	}
	public void verify()
	{
		Sqlverify c = new Sqlverify(am);
		conn=c.getConnection();
		try {
			sq=conn.createStatement();
			String un=am.textfield.getText();
			String un1=am.password.getText();
			//String un2=String.valueOf(un1);
			System.out.println(un1);
			//System.out.println(un1);
			//JTextField f=MyExtendsJFrame.text9;
			res=sq.executeQuery("select * from passenger2 where"+" yonghuming like '"+un+"'"+" and mima = '"+un1+"'");
			if(res.next()) {
				MyExtendsJFrame a=new MyExtendsJFrame();
				a.text2.setText(res.getString("idnum"));
				a.text1.setText(res.getString("name"));
				a.text3.setText(res.getString("visanum"));
				a.text6.setText(res.getString("sex"));
				System.out.println(un1);
			}
			else {
				Error er=new Error(this.am);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public void verify1()
	{
		Sqlverify c = new Sqlverify(am);
		conn=c.getConnection();
		try {
			sq=conn.createStatement();
			String un=am.textfield.getText();
			String un1=am.password.getText();
			//String un2=String.valueOf(un1);
			System.out.println(un1);
			//System.out.println(un1);
			//JTextField f=MyExtendsJFrame.text9;
			res=sq.executeQuery("select * from ����Ա where"+" mno like '"+un+"'"+" and mkey = '"+un1+"'");
			if(res.next()) {
				JOptionPane.showInputDialog(this, "��¼�ɹ�");
				//MyExtendsJFrame a=new MyExtendsJFrame();
				//a.text2.setText(res.getString("idnum"));
				//a.text1.setText(res.getString("name"));
				//a.text3.setText(res.getString("visanum"));
				//a.text6.setText(res.getString("sex"));
				//System.out.println(un1);
			}
			else {
				Error er=new Error(this.am);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public void verify2() {
		// TODO Auto-generated method stub
		Sqlverify c = new Sqlverify(am);
		conn=c.getConnection();
		try {
			sq=conn.createStatement();
			String un=am.textfield.getText();
			String un1=am.password.getText();
			//String un2=String.valueOf(un1);
			System.out.println(un1);
			//System.out.println(un1);
			//JTextField f=MyExtendsJFrame.text9;
			res=sq.executeQuery("select * from lvxingshe where"+" lvxingsheno like '"+un+"'"+" and psw = '"+un1+"'");
			if(res.next()) {
				JOptionPane.showInputDialog(this, "��¼�ɹ�");
				MyExtendsJFrame4 m4=new MyExtendsJFrame4();
				m4.text1.setText(res.getString("mingcheng"));
			}
			else {
				Error er=new Error(this.am);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

