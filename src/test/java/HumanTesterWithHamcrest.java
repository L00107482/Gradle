import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringStartsWith.startsWith;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HumanTesterWithHamcrest 
{
	
	private Human testDummy = new Human("Ryan", "Byrne", 21,170,120);

	@Test
	public void testGetAge() 
	{
		assertThat(testDummy.getAge(), is(equalTo(21)));
	}

	@Test
	public void testGetAgeVeryOld() 
	{
		testDummy.setAge(124);
		assertThat(testDummy.getAge(), is(equalTo(124)));
	}

	@Test
	public void testGetAgeJustBorn() 
	{
		testDummy.setAge(0);
		assertThat(testDummy.getAge(), is(equalTo(0)));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testSetAgeTooSmallByThrownException() 
	{
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(startsWith("Age must be realistic"));
		testDummy.setAge(-1);
	}

	@Test
	public void testSetAgeTooBigByThrownException() 
	{
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(startsWith("Age must be realistic"));
		testDummy.setAge(131);
	}

	@Test
	public void testFirstName() 
	{
		testDummy.setFirstName("Ryan");
		assertThat(testDummy.getFirstName(), is(equalTo("Ryan")));
	}

	@Test
	public void testFirstNameWithNumber() 
	{
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(startsWith("First name can only be alphabetic"));
		testDummy.setFirstName("Ry4n");
	}

	@Test
	public void testHypenatedFirstName() 
	{
		testDummy.setFirstName("Jean-Claude");
		assertThat(testDummy.getFirstName(), is(equalTo("Jean-Claude")));
	}
	
	@Test
	public void testFadaFirstName() 
	{
		testDummy.setFirstName("Ryán");
		assertThat(testDummy.getFirstName(), is(equalTo("Ryán")));
	}
	
	@Test
	public void testDoubleWordFirstName() 
	{
		testDummy.setFirstName("Jean Claude");
		assertThat(testDummy.getFirstName(), is(equalTo("Jean Claude")));
	}
	
	

	@Test
	public void testLastName() 
	{
		testDummy.setSurname("Byrne");
		assertThat(testDummy.getSurname(), is(equalTo("Byrne")));
	}

	@Test
	public void testHyphenatedSurname() 
	{
		testDummy.setSurname("Van-Damme");
		assertThat(testDummy.getSurname(), is(equalTo("Van-Damme")));
	}

	@Test
	public void testLastNameWithNumber() 
	{
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(startsWith("Last name can only be alphabetic with a hyphen"));
		testDummy.setSurname("Byrn3");
	}
	
	@Test
	public void testApostrohiesSurname()
	{
		testDummy.setSurname("O'Boyle");
		assertThat(testDummy.getSurname(), is(equalTo("O'Boyle")));
	}
	
	@Test
	public void testDoubleWordSurname() 
	{
		testDummy.setSurname("Van Damme");
		assertThat(testDummy.getSurname(), is(equalTo("Van Damme")));
	}
}
