import java.util.ArrayList;

/**
 * Created by wfan0322 on 2015/8/10.
 */
public class OrderCollection {
   ArrayList<Order> list = new ArrayList<Order>();
    String maxID = "0";
    OrderCollection(){

    }

    public int getSize(){
        return list.size();
    }
    public String getMaxID(){
        return this.maxID;
    }

    public String nextAvailID(){
        return String.valueOf(Integer.parseInt(maxID)+1);
    }

    public void addOrder(Order order){

        this.maxID = String.valueOf(Integer.parseInt(maxID)+1);
        this.list.add(order);
       // this.list.set(Integer.parseInt(maxID)+1,order);
    }


    public void deleteOrder(Order order){
      //  this.list.remove(order);
    }
}
