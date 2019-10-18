package galva;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Galva extends JFrame
{
	private static final long serialVersionUID = 6538101122351606537L;

	Menu menu;
	
	public Galva()
	{
		setTitle("Galva");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setFocusable(true);
		
		menu = new Menu();
		
		WindowLayout();
		pack();
	}
	
	private void WindowLayout()
	{
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.GRAY));
		this.getContentPane().setLayout(new BorderLayout(8, 6));
		
		setJMenuBar(menu);
		
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
