package friend.setup;
import java.sql.*;
import java.util.ArrayList;

import friend.setup.FriendListBean;

public class FriendList {
	public ArrayList<FriendListBean> getItemList(){
		ResultSet rs = null;
		ArrayList<FriendListBean> list=new ArrayList<FriendListBean>();
		
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/friendsdb","root","");  
				
				Statement stmt=con.createStatement();  
				rs=stmt.executeQuery("select * from myfriends");
				
				while (rs.next()) {   
					FriendListBean dbitem = new FriendListBean();
					dbitem.setItemName(rs.getString("name"));
					dbitem.setItemCat(rs.getString("dob"));
					dbitem.setItemCat(rs.getString("loc"));
					dbitem.setItemCat(rs.getString("gender"));
					
					list.add(dbitem);
				}			
				con.close();
		}catch(Exception e){ System.out.println(e);}
		
		return list;
	}
	
}