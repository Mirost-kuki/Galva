package galva;

import galva.dataComponents.*;
import java.util.ArrayList;

public class DataBase 
{
	
	private ArrayList<Order> orderList;
	private ArrayList<Client> clientList;
	
	public DataBase()
	{
		this.orderList = new ArrayList<Order>();
		this.clientList = new ArrayList<Client>();
	}
	
	public void initDataBase()
	{
		addClient("Jan Kowalski", "507874458");
		addClient("Zbigniew Makuta", "507874458");
		addClient("Jaros³aw Grzebyk", "507874458");
		addClient("Waldemar Pawlak", "507874458");
		addClient("Jarek Mazur", "507874458");
		
		ArrayList<Ware> wares1 = new ArrayList<Ware>();
		wares1.add(new Ware(20, "k¹townik"));
		
		ArrayList<Ware> wares2 = new ArrayList<Ware>();
		wares2.add(new Ware(3, "profil"));
		
		addOrder(new Order(clientList.get(1), wares1, 20));
		addOrder(new Order(clientList.get(2), wares2, 30));
	}
	
	public void saveDataBase()
	{
		
	}
	
	public void addOrder(Order order)
	{
		this.orderList.add(order);
	}
	
	public void addClient(Client client)
	{
		this.clientList.add(client);
	}
	public void addClient(String name, String phoneNumber1)
	{
		Client client = new Client(name, phoneNumber1);
		addClient(client);
	}
	public void addClient(String name, String phoneNumber1, String phoneNumber2)
	{
		Client client = new Client(name, phoneNumber1, phoneNumber2);
		this.clientList.add(client);
	}
	
	public ArrayList<Order> getOrderList()
	{
		return this.orderList;
	}
	
	public ArrayList<Client> getClientList()
	{
		return this.clientList;
	}
}
