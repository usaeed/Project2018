package pam.setup;

public class ItamBean {
	int item_id;
	String item_name;
	String item_description;
	String item_category;
	
	public void setItemId(int id){this.item_id=id;}  
	public int getItemId(){return item_id;}  
	  
	public void setItemName(String name){this.item_name=name;}  
	public String getItemName(){return item_name;} 
	
	public void setItemCat(String name){this.item_category=name;}  
	public String getItemCat(){return item_category;} 
	
	public void setItemCostPrice(double price){this.item_costpice=price;}  
	public double getItemCostPrice(){return item_costpice;} 
	
	}
