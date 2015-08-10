import java.util.ArrayList;

/**
 * Created by wfan0322 on 2015/8/10.
 */
public class OrderCollection {
   ArrayList<Order> list = new ArrayList<Order>();
    String maxID = "0";
    OrderCollection(){

    }

    public String getMaxID(){
        return "";
    }

    public String nextAvailID(){
        return "";
    }

    public void addOrder(Order order){
        this.list.add(order);
        //maxID = String.valueOf(Integer.parseInt(maxID)+1);
    }


    public void deleteOrder(Order order){
      //  this.list.remove(order);
    }
}
