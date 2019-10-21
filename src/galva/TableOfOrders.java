package galva;

import java.util.ArrayList;
import galva.dataComponents.Order;

public class TableOfOrders 
{

	public static final String[] FIELD_NAMES= {"ID", "Odbiorca", "Numer telefonu", "Towar", "Data przyjêcia", "Stan", "Zafakturowane", "Notatki"};
	
	private ArrayList<Order> orderList;
	
	public TableOfOrders(ArrayList<Order> orderList)
	{
		this.orderList = orderList;
	}
	
	public Object[][] convertToTable()
	{
		Object[][] data = new Object[1][FIELD_NAMES.length];
		
		Object[] dataRow = {orderList.get(0).getId(), orderList.get(0).getClient().getName(), orderList.get(0).getClient().getPhoneNumber1(), 
				orderList.get(0).getWaresListToString(), orderList.get(0).getDateOfAcceptance(), orderList.get(0).getOrderState(), 
				orderList.get(0).isInvoiced(), orderList.get(0).getNotes()};
		data[0] = dataRow;
		
		return data;
	}
}
