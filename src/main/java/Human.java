public class Human {
	private String name;		//Full name
	private int age;			//Age in Years
	private int height; 		//Height in Centimeters
	private int weight; 		//Weight in Pounds

	public Human()
	{
		name=null;
		age=0;
		height=0;
		weight=0;
	}

	public Human(String name,int age,int height,int weight)
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}

	// validate first name
	public static boolean validateFirstName(String name) 
	{
		return name.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
	}


	public void setName(String name)
	{
		if (validateFirstName(name) == true) {
			this.name = name;
		} else
			throw new IllegalArgumentException("First name can only be alphabetic", null);
	}


	public String getName()
	{
		return name;
	}

	public void setAge(int age)
	{
		if (age < 0 || age >= 125) {
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
		if (height < 0 || age >= 210) {
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
		if (weight < 0 || weight >= 280) {
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