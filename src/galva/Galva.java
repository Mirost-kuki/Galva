package galva;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

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
		
		JScrollPane scrollPane = new JScrollPane(tableOfOrders);
		
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
