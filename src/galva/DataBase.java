package galva;

import galva.dataComponents.*;
import java.util.ArrayList;

public class DataBase 
{
	public static DataBase dataBase = new DataBase();
	
	private ArrayList<Order> orderList;
	private ArrayList<Client> clientList;
	
	private DataBase()
	{
		this.orderList = new ArrayList<Order>();
		this.clientList = new ArrayList<Client>();
	}
	
	public void initDataBase()
	{
		
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
}
