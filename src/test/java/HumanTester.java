import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanTester {
	
	private Human tester = new Human("Ryan Byrne",21,"Main Street, Donegal Town",1.70,8.2);
	
	@Test
	public void testGetName()
	{
		assertEquals("Ryan Byrne", tester.getName());
	}
	
}