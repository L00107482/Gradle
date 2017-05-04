import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddressTester {
	
	private Address testAddress = new Address("Donegal","Killybegs","Main Street",33);
	
	@Test
	public void testGetCounty()
	{
		assertEquals("Donegal", testAddress.getCounty());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetCountyWithNumber()
	{
		testAddress.setCounty("Donega1");
		assertEquals("Donega1", testAddress.getCounty());
	}
	
	@Test
	public void testGetTown()
	{
		assertEquals("Killybegs", testAddress.getTown());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetTownWithNumber()
	{
		testAddress.setTown("Killyb3gs");
		assertEquals("Killyb3gs", testAddress.getTown());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetTownWithFada()
	{
		testAddress.setTown("Killybégs");
		assertEquals("Killybégs", testAddress.getTown());
	}
	
	@Test
	public void testGetStreet()
	{
		assertEquals("Main Street", testAddress.getStreet());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetStreetWithNumber()
	{
		testAddress.setStreet("Main Str33t");
		assertEquals("Main Str33t", testAddress.getStreet());
	}
	
	@Test
	public void testGetNumber()
	{
		assertEquals(33, testAddress.getNumber());
	}
}
