import java.util.UUID;

public class Eircode {
	
	private String eircode=null;
	
	public Eircode()
	{
		eircode=UUID.randomUUID().toString().substring(0,6);
		System.out.println(eircode);
	}
}
