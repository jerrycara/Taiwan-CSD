package example;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LocationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLocationSize() {
		assertEquals(5, Location.getLocations().size());
	}
	
	@Test
	public void testLocation(){
		assertEquals("臺北巿大安運動中心", Location.getLocations().get(0));
		assertEquals("臺北巿中正運動中心", Location.getLocations().get(1));
		assertEquals("臺北巿北投運動中心", Location.getLocations().get(2));
		assertEquals("臺北巿萬華運動中心", Location.getLocations().get(3));
		assertEquals("臺北巿士林運動中心", Location.getLocations().get(4));
	}

}
