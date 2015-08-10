package example;

public class OrderStatus {
	private String order;
	private String status;
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void printOrderInfo(){
		System.out.println("----------------------------------------------");
		System.out.println("狀態:" + status);
		System.out.println("狀態:" + order);
		System.out.println("----------------------------------------------");
	}
}
