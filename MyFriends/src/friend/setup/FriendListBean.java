package friend.setup;

public class FriendListBean {
	Sting name;
	Date dob;
	String loc;
	String gender;
	
	public void setFriendListName(String Friend_Name){this.Friend_Name=name;}  
	public String getFriendListName(){return Friend_Name;}  
	  
	public void setItemName(Date dob){this.dob=dob;}  
	public String getItemName(){return item_name;} 
	
	public void setItemCat(String name){this.item_category=name;}  
	public String getItemCat(){return item_category;} 
	
	public void setItemCostPrice(double price){this.item_costpice=price;}  
	public double getItemCostPrice(){return item_costpice;} 
	
}
