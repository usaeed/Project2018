package pam.setup;
import java.sql.*;
import java.util.ArrayList;
public class Item {
	public  ArrayList<ItemBean> getItemList()
	{
		ResultSet rs = null;
		ArrayList<ItemBean> list=new ArrayList<ItemBean>();
		
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/posdb","root","");  
				
				Statement stmt=con.createStatement();  
				rs=stmt.executeQuery("select * from ospos_items");
				
				while (rs.next()) {   
					ItemBean dbitem = new ItemBean();
					dbitem.setItemId(rs.getInt("item_id"));
					dbitem.setItemName(rs.getString("name"));
					dbitem.setItemCat(rs.getString("category"));
					dbitem.setItemCostPrice(rs.getDouble("cost_price"));
					dbitem.setItemUnitPrice(rs.getDouble("unit_price"));
					list.add(dbitem);
				}			
				con.close();
		}catch(Exception e){ System.out.println(e);}
		
		return list;
		
	}
}
