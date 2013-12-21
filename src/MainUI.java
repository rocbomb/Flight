import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class MainUI extends JFrame implements ActionListener{

	NorthUser PassengerPanel;
	DB db;
	User passenger;
	public MainUI() {
		db = new DB();
		passenger = new User();
		super.setTitle("»úÆ±¹ºÂòÏµÍ³");
		PassengerPanel = new NorthUser(passenger,db);
		this.add(PassengerPanel,BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
