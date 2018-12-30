package 机票;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Sqlflight {
	static Connection conn;
	static ResultSet res;
	static PreparedStatement sq;
	private MyExtendsJFrame3 am;
	public Sqlflight(MyExtendsJFrame3 my) {
		// TODO Auto-generated constructor stub
		am=my;
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

	public void add() {
		// TODO Auto-generated method stub
		Sqlflight c = new Sqlflight(am);
		conn=c.getConnection();
		try {
			sq=conn.prepareStatement("insert into hangban "+"values(?,?,?,?,?,?)");
			sq.setString(1,am.text1.getText());
			sq.setString(2,am.text2.getText());
			sq.setString(3,am.text3.getText());
			sq.setString(4,am.text5.getText());
			sq.setString(5,am.text6.getText());
			sq.setString(6,am.text7.getText());
			sq.executeUpdate();
			JOptionPane.showInputDialog(this, "新增成功");
			//JTextField f=MyExtendsJFrame.text9;
			//sq.executeQuery("insert into passenger2"+" value("+"'"+un1+"'"+","+"'"+un2+"'"+","+"'"+0+"'"+","+"'"+0+"'"+")");
            //sq.executeQuery("");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updata() {
		// TODO Auto-generated method stub
		Sqlflight c = new Sqlflight(am);
		conn=c.getConnection();
		String s=am.text1.getText();
		try {
			sq=conn.prepareStatement("update hangban set state"+"= ? where banci like "+"'"+s+"'");
			sq.setString(1,am.text7.getText());
			//sq.setString(6,am.text1.getText());
			sq.executeUpdate();
			JOptionPane.showInputDialog(this, "修改成功！");
			//JTextField f=MyExtendsJFrame.text9;
			//sq.executeQuery("insert into passenger2"+" value("+"'"+un1+"'"+","+"'"+un2+"'"+","+"'"+0+"'"+","+"'"+0+"'"+")");
            //sq.executeQuery("");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
