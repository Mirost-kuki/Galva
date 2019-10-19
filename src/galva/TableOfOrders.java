package galva;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JTable;
import galva.dataComponents.Order;

public class TableOfOrders extends JTable{

	private static final long serialVersionUID = -5884388428724206229L;
	
	private static final String[] FIELD_NAMES= {"ID", "Odbiorca"};
	
	private static Object[][] data = convert();
	
	public TableOfOrders(ArrayList<Order> orderList)
	{
		super(data, FIELD_NAMES);
		setPreferredScrollableViewportSize(new Dimension(600, 800));
		setFillsViewportHeight(true);
	}
	
	private static Object[][] convert()
	{
		Object[][] data = 
			{
					{"1", "Nowak"},
					{"2", "Mikke"}
			};
		return data;
	}
}
