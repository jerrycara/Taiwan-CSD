import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wfan0322 on 2015/8/10.
 */
public class BookingTest {
    @Test
    public void Test1(){
        //assertEquals(1,1);

       //System.out.println("Test");
        //assertEquals(1,1);
        OrderCollection myOrders = new OrderCollection();
        myOrders.addOrder(new Order("1",100));
        myOrders.addOrder(new Order("2",300));
        assertEquals(2, myOrders.getSize());
        assertEquals("2", myOrders.getMaxID());
        assertEquals("3", myOrders.nextAvailID());
        //System.out.println(myOrders.toString());
        //Order myOrder = myOrders.get(1);

    }

}
