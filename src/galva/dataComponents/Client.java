package galva.dataComponents;

public class Client 
{
	private static int ID = 1;
	
	private int id;
	private String name;
	private String phoneNumber1;
	private String phoneNumber2;
	
	public Client(String name, String phoneNumber1)
	{
		this.id = ID;
		ID++;
		
		this.name = name;
		this.phoneNumber1 = phoneNumber1;
		this.phoneNumber2 = "";
	}
	public Client(String name, String phoneNumber1, String phoneNumber2)
	{
		this(name, phoneNumber1);
		this.phoneNumber2 = phoneNumber2;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	
	
}
