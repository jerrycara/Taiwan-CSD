package example;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Order.getInstance().addOrder("臺北巿北投運動中心");
		assertEquals(1, Order.getInstance().getOrderList().size());
		
		Order.getInstance().checkin(0);
		assertEquals("報到!", Order.getInstance().getOrderStatus(0));
		
		Order.getInstance().checkout(0);
		assertEquals("使用完畢!", Order.getInstance().getOrderStatus(0));
		
		Order.getInstance().clean(0);
		assertEquals("場地清理完畢!", Order.getInstance().getOrderStatus(0));
	}

}
