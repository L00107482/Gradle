import java.util.UUID;

public class Eircode {

	private String eircode=null;

	public Eircode()
	{
		eircode=UUID.randomUUID().toString().substring(0,6).toUpperCase();
	}

	public Eircode(String eircode)
	{
		if(validateEircode(eircode)==true)
		{
			this.eircode=eircode.substring(0,6).toUpperCase();
		}else
			throw new IllegalArgumentException("Eircode can only contain Letters and Numbers!", null);
	}

	// validate Eircode
	public static boolean validateEircode(String eircode) 
	{
		return eircode.matches("[a-zA-z0-9]+([][a-zA-Z0-9]+)*");
	}
	
	public void setEircode(String eircode)
	{
		if(eircode.length()>7)
		{
			this.eircode=eircode;
		}else
			System.out.println("Eircode can only be 7 characters long!");
	}
	
	public String getEircode()
	{
		return eircode;
	}
}