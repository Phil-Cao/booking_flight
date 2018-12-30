package 机票;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class Sqlleft {

	static Connection conn;
	static ResultSet res;
	static Statement sq;
	private buy bu;
	public Sqlleft(buy b) {
		// TODO Auto-generated constructor stub
		bu=b;
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
	public void query() {
		// TODO Auto-generated method stub
		Sqlleft c = new Sqlleft(bu);
		conn=c.getConnection();
		String a11=bu.Text1.getText();
		String b11=bu.Text2.getText();
		try {
			sq=conn.createStatement();
			res=sq.executeQuery("select * from jipiao where banci = '"+a11+"'"+" and cangwei ='"+b11+"'");
			if(res.next())
			{
				int temp=res.getInt("yupiao");
				if(temp!=0)
				{
					JOptionPane.showInputDialog(this, "您选择的余票： "+res.getString("yupiao"));
				}else
				{
					JOptionPane.showInputDialog(this, "您选择的机票已卖完");
					System.exit(0);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
