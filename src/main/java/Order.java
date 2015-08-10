/**
 * Created by wfan0322 on 2015/8/10.
 */
public class Order {
    String id;
    int status;
    double price;
    final static int paid = 0;
    final static int pendding = 1;
    final static int canceled = 2;
    final static int timeouted = 3;

    Order(String id,int price){
        this.id = id;
        this.price = price;
        this.status = pendding;
    }

    boolean isOrder(String id){
        //if (this.id.equlas(id))
        //    return true;
        return false;
    }

    private void makePayment(){
        this.status = paid;
    }

}
