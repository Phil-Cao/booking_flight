package 字同;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlTravel {
	static Connection conn;
	static ResultSet res;
	static ResultSet res1;
	static Statement sq;
	private MyExtendsJFrame4 frame4;
	public SqlTravel(MyExtendsJFrame4 m4) {
		// TODO Auto-generated constructor stub
		frame4=m4;
	}
	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-TPMMOND:1433;DatabaseName=字同","sa","czy");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
}
	public void query() {
		// TODO Auto-generated method stub
		SqlTravel c = new SqlTravel(frame4);
		conn=c.getConnection();
		String t = null;
		String a=frame4.text1.getText();
		System.out.println(a);
		try {
			sq=conn.createStatement();
			res=sq.executeQuery("select * from lvxingshe where mingcheng = '"+a+"'");
			while(res.next())
			{
				t=res.getString("lvxingsheno");
				System.out.println(t);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sq=conn.createStatement();
			res1=sq.executeQuery("select * from passenger2 where lvxingsheno = '"+t+"'");
			while(res1.next()) {
				String num=res1.getString("name");
				String id=res1.getString("idnum");
				String visa=res1.getString("visanum");
				frame4.text9.setText(frame4.text9.getText()+num+'\n');
				frame4.text9.setText(frame4.text9.getText()+id+'\n');
				frame4.text9.setText(frame4.text9.getText()+visa+'\n');
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
