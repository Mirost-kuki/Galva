package galva;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import galva.dataComponents.ORDER_STATE;

public class Galva extends JFrame
{
	private static final long serialVersionUID = 6538101122351606537L;

	private Menu menu;
	private TableOfOrders tableOfOrders;
	private DataBase dataBase;
	
	public Galva()
	{
		setTitle("Galva");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setFocusable(true);
		
		dataBase = new DataBase();
		dataBase.initDataBase();
		
		menu = new Menu();
		tableOfOrders = new TableOfOrders(dataBase.getOrderList());
		
		WindowLayout();
		pack();
	}
	
	private void WindowLayout()
	{
		this.getContentPane().setLayout(new BorderLayout(8, 6));
		
		setJMenuBar(menu);
		
		Object[][] data = TableOfOrders.convertToTable();/*{
				{"1", "Adam", "50448875", "1 x s³upek", "dzisiaj", ORDER_STATE.FreshlyReceived , false},
				{"2", "Jan", "50448875", "2 x s³upek", "dzisiaj", ORDER_STATE.FreshlyReceived , false}
		};*/
		
		JTable table = new JTable(data, TableOfOrders.FIELD_NAMES);
		table.setPreferredScrollableViewportSize(new Dimension(600, 800));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Galva().setVisible(true);
				
			}
		});

	}

}
