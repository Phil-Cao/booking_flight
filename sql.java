package 机票;

import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.*;
import java.util.Date;

public class sql {
	static Connection conn;
	static ResultSet res;
	static Statement sq;
	private MyExtendsJFrame frame;
	public sql(MyExtendsJFrame aframe) {
		frame = aframe;
		//JTextField text=a1.text9;
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
	public void select() throws ParseException
	{
		sql c = new sql(frame);
		conn=c.getConnection();
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String a=frame.text7.getText();
		String b=frame.text8.getText();
		String cc=frame.text4.getText();
		String dd=frame.text5.getText();
		//Date data = sdf.parse(cc);
		//Date data1 = sdf.parse(dd);

		try {
			sq=conn.createStatement();
			//JTextField f=MyExtendsJFrame.text9;
			res=sq.executeQuery("select * from hangban where chufadi = '"+a+"' and mudidi = '"+b+"'"+" and convert(Varchar(20),chufatime,120) like'"+cc+"%'");
			int flag=0;
				while(res.next()) {
				String num=res.getString("banci");
				String starttime=res.getString("chufatime");
				String arrivetime=res.getString("daodatime");
				String startarea=res.getString("chufadi");
				String arrivearea=res.getString("mudidi");
				frame.text9.setText(frame.text9.getText()+"航班： "+num+'\n');
				frame.text9.setText(frame.text9.getText()+"出发时间："+starttime+'\n'+"到达时间: "+arrivetime+'\n');
				frame.text9.setText(frame.text9.getText()+startarea+arrivearea+'\n');
				flag++;
				}
				if(flag==0) {
					//register r = new register();
					JOptionPane.showInputDialog(this, "未能查询到航班");
				}
			
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
}
	
}
