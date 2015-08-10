import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class SearchTests {
	@Test
	public void given_SearchTennisGarden_when_Have_then_Return_TennisGarden(){
		assertEquals("Taipei","Taipei");
		assertEquals(true,new SearchTennisGarden().listGardon().contains("1.쨓쫤┪쾧놓"));
		assertEquals(10, new SearchTennisGarden().listGardon().size());
		assertEquals("4.쳌답┪쾧놓", new SearchTennisGarden().listGardon().get(3));
	}
	
}
