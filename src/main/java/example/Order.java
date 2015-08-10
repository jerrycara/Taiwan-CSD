package example;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private static Order order;
	private List<String> orderList;
	
	protected Order(){
		orderList = new ArrayList<String>();
	}
	
	public static Order getInstance(){
		if (order == null){
			order = new Order();
		}
		return order;
	}
	
	public void addOrder(String order){
		orderList.add("您於 " + new java.util.Date().toString() + " 預約了 " + order + " 場地.");
	}
	
	public List getOrderList(){
		return orderList;
	}
	
}
