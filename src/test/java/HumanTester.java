import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanTester {

	private Human tester = new Human("Ryan Byrne",21,170,120);

	@Test
	public void testGetName()
	{
		assertEquals("Ryan Byrne", tester.getName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNameWithNumber() 
	{
		tester.setName("Ry4n");
	}

	@Test
	public void testHypenatedName() 
	{
		tester.setName("Ryan-John");
		assertEquals("Ryan-John", tester.getName());
	}

	@Test
	public void testGetAge()
	{
		assertEquals(21, tester.getAge());
	}

	public void testGetAgeVeryOld()
	{
		assertEquals(129, tester.getAge());
	}

	public void testGetAgeJustBorn()
	{
		assertEquals(0, tester.getAge());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetAgeWithNegativeNumberByThrownException() 
	{
		tester.setAge(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetAgeTooBigByThrownException()
	{
		tester.setAge(126);
	}

	@Test
	public void testGetHeight()
	{
		assertEquals(170, tester.getHeight());
	}

	@Test
	public void testGetWeight()
	{
		assertEquals(120, tester.getWeight());
	}

}