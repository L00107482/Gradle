public class Human {
	private String name;
	private int age;
	private String address;
	private double height;
	private double weight;
	public Human()
	{
		name=null;
		age=0;
		address=null;
		height=0;
		weight=0;
	}
	public Human(String nameIn,int ageIn,String addressIn,double heightIn,double weightIn)
	{
		name=nameIn;
		age=ageIn;
		address=addressIn;
		height=heightIn;
		weight=weightIn;
	}
	public void setName(String nameIn)
	{
		name=nameIn;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int ageIn)
	{
		age=ageIn;
	}
	public int getAge()
	{
		return age;
	}
	public void setAddress(String addressIn)
	{
		address=addressIn;
	}
	public String getAddress()
	{
		return address;
	}
	public void setHeight(double heightIn)
	{
		height=heightIn;
	}
	public double getHeight()
	{
		return height;
	}
	public void setWeight(double weightIn)
	{
		weight=weightIn;
	}
	public double getWeight()
	{
		return weight;
	}
}