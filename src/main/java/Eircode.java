import java.util.UUID;

public class Eircode {

	private String eircode=null;

	public Eircode()
	{
		eircode=UUID.randomUUID().toString().substring(0,6);
		System.out.println(eircode);
	}

	public Eircode(String eircode)
	{
		if(validateEircode(eircode)==true)
		{
			this.eircode=eircode;
		}else
			throw new IllegalArgumentException("Eircode can only contain Letters and Numbers!", null);
	}

	// validate Eircode
	public static boolean validateEircode(String eircode) 
	{
		return eircode.matches("[a-zA-z0-9]+([][a-zA-Z0-9]+)*");
	}
}