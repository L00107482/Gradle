public class Human 
{
	private String firstName;	//First name
	private String surname;		//Surname
	private int age;			//Age in Years
	private int height; 		//Height in Centimeters
	private int weight; 		//Weight in Pounds
	private Address address;

	public Human()
	{
		firstName=null;
		surname=null;
		age=0;
		height=0;
		weight=0;
	}

	public Human(String firstName,String surname,int age,int height,int weight)
	{
		this.firstName=firstName;
		this.surname=surname;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}

	// validate first name
	public static boolean validateFirstName(String firstName) 
	{
		return firstName.matches("[a-zA-zαινσϊ]+([ '-][a-zA-Z]+)*");
	}


	public void setFirstName(String firstName)
	{
		if (validateFirstName(firstName) == true) 
		{
			this.firstName = firstName;
		} else
			throw new IllegalArgumentException("First name can only be alphabetic", null);
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public static boolean validateSurname(String surname) 
	{
		return surname.matches("[a-zA-zαινσϊ]+([ '-][a-zA-Z]+)*");
	}

	public void setSurname(String surname)
	{
		if (validateSurname(surname) == true) 
		{
			this.surname = surname;
		} else
			throw new IllegalArgumentException("Surname can only be alphabetic", null);
	}

	
	
	
	
	
	public String getSurname()
	{
		return surname;
	}

	public void setAge(int age)
	{
		if (age < 0 || age > 125) 
		{
			throw new IllegalArgumentException("Age should be realistic");
		} else {
			this.age = age;
		}
	}

	public int getAge()
	{
		return age;
	}

	public void setHeight(int height)
	{
		if (height < 49 || height >= 210) 
		{
			throw new IllegalArgumentException("Height should be realistic");
		} else {
			this.height = height;
		}
	}

	public int getHeight()
	{
		return height;
	}

	public void setWeight(int weight)
	{
		if (weight < 7 || weight >= 280) 
		{
			throw new IllegalArgumentException("Weight should be realistic");
		} else {
			this.weight = weight;
		}
	}

	public int getWeight()
	{
		return weight;
	}
}