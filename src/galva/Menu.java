package galva;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar
{
	private static final long serialVersionUID = -2327537540432141120L;

	private JMenu file;
	private JMenu edit;
	private JMenu help;
	
	JMenuItem exit;
	
	JMenuItem about;
	
	public Menu()
	{
		MenuFieldsInit();
		
		filesItemsnit();
		filesActionListenerInit();
		
		editItemsInit();
		editActionListenerInit();
		
		helpItemsInit();
		helpActionListenerInit();
	}

	private void helpActionListenerInit() {
		// TODO Auto-generated method stub
		
	}

	private void helpItemsInit() 
	{
		about = new JMenuItem("About");
		help.add(about);
	}

	private void editActionListenerInit() {
		// TODO Auto-generated method stub
		
	}

	private void editItemsInit() {
		// TODO Auto-generated method stub
		
	}

	private void filesActionListenerInit() 
	{
		exit.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}

	private void filesItemsnit() 
	{
		exit = new JMenuItem("Exit");	
		file.add(exit);
	}

	private void MenuFieldsInit() 
	{
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		add(file);
		add(edit);
		add(help);
	}
}
