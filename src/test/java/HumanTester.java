import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanTester 
{
	private Human tester = new Human("Ryan", "Byrne",21,170,120,"Donegal","Killybegs","Main Street",33);

	@Test
	public void testGetFirstName()
	{
		assertEquals("Ryan", tester.getFirstName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFirstNameWithNumber() 
	{
		tester.setFirstName("Ry4n");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFullStopFirstName()
	{
		tester.setFirstName("Sammy.");
		assertEquals("Sammy.", tester.getFirstName());
	}

	@Test
	public void testHypenatedFirstName() 
	{
		tester.setFirstName("Jean-Claude");
		assertEquals("Jean-Claude", tester.getFirstName());
	}
	
	@Test
	public void testDoubleWordFirstName()
	{
		tester.setFirstName("Jean Claude");
		assertEquals("Jean Claude", tester.getFirstName());
	}
	
	@Test
	public void testFadaFirstName()
	{
		tester.setFirstName("Ry�n");
		assertEquals("Ry�n", tester.getFirstName());
	}		
	
	@Test
	public void testGetSurname()
	{
		assertEquals("Byrne", tester.getSurname());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSurnameWithNumber() 
	{
		tester.setSurname("Byrn3");
	}

	@Test
	public void testHypenatedSurname() 
	{
		tester.setSurname("Jones-Byrne");
		assertEquals("Jones-Byrne", tester.getSurname());
	}
	
	@Test
	public void testApostrohiesSurname()
	{
		tester.setSurname("O'Boyle");
		assertEquals("O'Boyle", tester.getSurname());
	}
	
	@Test
	public void testFullStopSurname()
	{
		tester.setSurname("Davies Jr.");
		assertEquals("Davies Jr.", tester.getSurname());
	}
	
	@Test
	public void testDoubleWordSurname()
	{
		tester.setSurname("Van Damme");
		assertEquals("Van Damme", tester.getSurname());
	}
	
	@Test
	public void testFadaSurname()
	{
		tester.setSurname("Byrn�");
		assertEquals("Byrn�", tester.getSurname());
	}

	@Test
	public void testGetAge()
	{
		assertEquals(21, tester.getAge());
	}
	
	@Test
	public void testGetAgeVeryOld()
	{
		tester.setAge(124);
		assertEquals(124, tester.getAge());
	}

	@Test
	public void testGetAgeJustBorn()
	{
		tester.setAge(0);
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
	public void testGetHeightVerySmall()
	{
		tester.setHeight(130);
		assertEquals(130, tester.getHeight());
	}
	
	@Test
	public void testGetHeightVeryBig()
	{
		tester.setHeight(195);
		assertEquals(195, tester.getHeight());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetHeightWithNegativeNumberByThrownException() 
	{
		tester.setAge(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHeightTooBigByThrownException()
	{
		tester.setAge(250);
	}

	@Test
	public void testGetWeight()
	{
		assertEquals(120, tester.getWeight());
	}
	
	@Test
	public void testGetWeightVeryLight()
	{
		tester.setWeight(50);
		assertEquals(50, tester.getWeight());
	}
	
	@Test
	public void testGetWeightVeryHeavy()
	{
		tester.setWeight(200);
		assertEquals(200, tester.getWeight());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetWeightWithNegativeNumberByThrownException() 
	{
		tester.setAge(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetWeightTooBigByThrownException()
	{
		tester.setAge(350);
	}
	
	@Test
	public void testGetCounty()
	{
		assertEquals("Donegal", tester.getCounty());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetCountyWithNumber()
	{
		tester.setCounty("Donega1");
		assertEquals("Donega1", tester.getCounty());
	}
	
	@Test
	public void testGetTown()
	{
		assertEquals("Killybegs", tester.getTown());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetTownWithNumber()
	{
		tester.setTown("Killyb3gs");
		assertEquals("Killyb3gs", tester.getTown());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetTownWithFada()
	{
		tester.setTown("Killyb�gs");
		assertEquals("Killyb�gs", tester.getTown());
	}
	
	@Test
	public void testGetStreet()
	{
		assertEquals("Main Street", tester.getStreet());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetStreetWithNumber()
	{
		tester.setStreet("Main Str33t");
		assertEquals("Main Str33t", tester.getStreet());
	}
	
	@Test
	public void testGetNumber()
	{
		assertEquals(33, tester.getNumber());
	}
}