package galva;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Galva extends JFrame
{
	private static final long serialVersionUID = 6538101122351606537L;

	public Galva()
	{
		setTitle("Galva");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setFocusable(true);
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
