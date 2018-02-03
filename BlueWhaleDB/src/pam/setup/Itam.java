package pam.setup;
import java.sql.*;
import java.util.ArrayList;
public class Itam {
	public  ArrayList<ItamBean> getItemList()
	{
		ResultSet rs = null;
		ArrayList<ItemBean> list=new ArrayList<ItemBean>();
		
		try{Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/subscriberdb","root","");  
			
			Statement stmt=con.createStatement();  
			rs=stmt.executeQuery("select * from subscribertable");
			
			while (rs.next()) {   
				ItemBean dbitem = new ItamBean();
				dbitem.setItemId(rs.getInt("item_id"));
				dbitem.setItemName(rs.getString("name"));
				dbitem.setItemCat(rs.getString("category"));
				list.add(dbitem);
			}			
			con.close();
	}catch(Exception e){ System.out.println(e);}
	
	return list;
	
}
}