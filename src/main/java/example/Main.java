package example;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		java.util.Iterator<String> iter = Location.getLocations().iterator();
		System.out.println("目前系統可用場地如下:");
		int locationNum = 0;
		while(iter.hasNext()){
			System.out.println(locationNum++ + ":" + iter.next());
		}
		
		System.out.println("請輸入要預約的場地編號:");
		Scanner scanner = new Scanner(System.in);
		java.io.InputStream in = System.in;
        int index;
        index = scanner.nextInt();
        
        Order.getInstance().addOrder(Location.getLocations().get(index));
        Iterator<OrderStatus> orderResult = Order.getInstance().getOrderList().iterator();
        int count = 0;
        while(orderResult.hasNext()){
			System.out.println(count++ + ":" );
			orderResult.next().printOrderInfo();
		}
        
        System.out.println("請輸入要報到的場次:");
        Thread.sleep(1000);
        int index2 =  scanner.nextInt();
        System.out.println(Order.getInstance().getOrderList().size());
        
        Order.getInstance().checkin(index2);
        Order.getInstance().printOrder(index2);
        
        System.out.println("輸入任一按鈕，完成簽出");
        in.read();
        
        Order.getInstance().checkout(index2);
        Order.getInstance().printOrder(index2);
        
        System.out.print("工");
        Thread.sleep(500);
        System.out.print("人");
        Thread.sleep(500);
        System.out.print("來");
        Thread.sleep(500);
        System.out.print("打");
        Thread.sleep(500);
        System.out.print("掃");
        Thread.sleep(500);
        System.out.print("了");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        
        Order.getInstance().clean(index2);
        Order.getInstance().printOrder(index2);
	}

}
