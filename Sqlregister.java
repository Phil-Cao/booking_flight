package 字同;
import java.sql.*;
public class Sqlregister {
	static Connection conn;
	static ResultSet res;
	static PreparedStatement sq;
	private Log am;
	public Sqlregister(Log amy) {
		am = amy;
		//JTextField text=a1.text9;
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
	public void register()
	{
		Sqlregister c = new Sqlregister(am);
		conn=c.getConnection();
		try {
			sq=conn.prepareStatement("insert into passenger2 "+"values(?,?,?,?,?,?,?,?)");
			sq.setString(1,am.text51.getText());
			sq.setString(2,am.text71.getText());
			sq.setString(3,am.text41.getText());
			sq.setString(4,am.text61.getText());
			sq.setString(5,am.text81.getText());
			sq.setString(6,am.text11.getText());
			sq.setString(7,am.text31.getText());
			sq.setString(8,am.text910.getText());
			sq.executeUpdate();
			//JTextField f=MyExtendsJFrame.text9;
			//sq.executeQuery("insert into passenger2"+" value("+"'"+un1+"'"+","+"'"+un2+"'"+","+"'"+0+"'"+","+"'"+0+"'"+")");
            //sq.executeQuery("");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
