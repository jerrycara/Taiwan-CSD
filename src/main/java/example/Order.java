package example;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private static Order order = null;
	private List<OrderStatus> orderList;
	
	protected Order(){
		orderList = new ArrayList<OrderStatus>();
	}
	
	public static Order getInstance(){
		if (order == null){
			order = new Order();
		}
		return order;
	}
	
	public void addOrder(String order){
		OrderStatus status = new OrderStatus();
		status.setOrder("您於 " + new java.util.Date().toString() + " 預約了 " + order + " 場地.");
		status.setStatus("預約");
		orderList.add(status);
	}
	
	public void checkin(int i){
		orderList.get(i).setStatus("報到!");
	}
	
	public void checkout(int i){
		orderList.get(i).setStatus("使用完畢!");
	}
	
	public String getOrderStatus(int i){
		return orderList.get(i).getStatus();
	}
	
	public List getOrderList(){
		return orderList;
	}
	
	public void printOrder(int i){
		orderList.get(i).printOrderInfo();
	}
	
}
