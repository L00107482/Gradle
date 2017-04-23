
public class Address {

	private String county;
	private String town;
	private String street;
	private int number;
	private Eircode eircode;

	public Address()
	{
		county=null;
		town=null;
		street=null;
		number=0;
		eircode=null;
	}

	public Address(String county, String town,String street, int number)
	{
		this.county=county;
		this.town=town;
		this.street=street;
		this.number=number;
		eircode=new Eircode();
	}

	// Validate county
	public static boolean validateCounty(String county) 
	{
		return county.matches("[a-zA-z]+([ '][a-zA-Z]+)*");
	}

	public void setCounty(String county)
	{
		if (validateCounty(county) == true) 
		{
			this.county = county;
		} else
			throw new IllegalArgumentException("County can only be alphabetic", null);
	}

	public String getCounty()
	{
		return county;
	}

	// Validate town
	public static boolean validateTown(String town) 
	{
		return town.matches("[a-zA-z]+([ '][a-zA-Z]+)*");
	}

	public void setTown(String town)
	{
		if (validateCounty(town) == true) 
		{
			this.town = town;
		} else
			throw new IllegalArgumentException("Town can only be alphabetic", null);
	}

	public String getTown()
	{
		return town;
	}

	// Validate street
	public static boolean validateStreet(String street) 
	{
		return street.matches("[a-zA-z]+([ '][a-zA-Z]+)*");
	}

	public void setstreet(String street)
	{
		if (validateCounty(street) == true) 
		{
			this.street = street;
		} else
			throw new IllegalArgumentException("street can only be alphabetic", null);
	}

	public String getStreet()
	{
		return street;
	}

	public int getNumber()
	{
		return number;
	}
	
	public Eircode getEircode()
	{
		return eircode;
	}
}
