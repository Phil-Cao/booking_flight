package 字同;
import java.sql.*;
public class SqlOrder {
	static Connection conn;
	static ResultSet res;
	static PreparedStatement sq;
	private MyExtendsJFrame a1;
	private Order a2;
	private buy a3;
	public SqlOrder(Order am2,MyExtendsJFrame am1,buy am3) {
		a1=am1;
		a2=am2;
		a3=am3;
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
	public void order()
	{
		SqlOrder c = new SqlOrder(a2,a1,a3);
		conn=c.getConnection();
		try {
			String s1=String.valueOf(a2.s);
			sq=conn.prepareStatement("insert into dingpiao "+"values(?,?,?,?)");
			sq.setString(1,s1);
			sq.setString(2,a1.text2.getText());
			sq.setString(3,a1.text1.getText());
			sq.setString(4,a3.Text1.getText());
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