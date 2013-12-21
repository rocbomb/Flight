import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NorthUser extends JPanel implements ActionListener{
	User passenger;
	JButton psgEnter; //乘客信息检索按钮
	JTextField IDNumber; //乘客身份证号码
	JLabel strName;
	JLabel userName;
	JButton Detail;
	JPanel  Userinf;
	DB db;
	NorthUser(User passenger, DB db){
		this.passenger = passenger;
		this.db = db;
		super.setLayout(new FlowLayout());
		psgEnter = new JButton("检索");
		IDNumber = new JTextField(14);
		strName  = new JLabel("姓 名");
		Detail   = new JButton("详细信息");
		userName = new JLabel(passenger.name);
		strName.setBorder(BorderFactory.createLineBorder(Color.black));
		userName.setBorder(BorderFactory.createLineBorder(Color.black));
	//	Userinf  = new JPanel(new Gri);
		//userName.setSize(1, 5);
		add(IDNumber);
		add(psgEnter);
		add(strName);
		strName.setPreferredSize(new java.awt.Dimension(52, 24));
		strName.setHorizontalAlignment(SwingConstants.CENTER);
		strName.setText("\u59d3 \u540d:");
		add(userName);
		userName.setPreferredSize(new java.awt.Dimension(52, 23));
		userName.setHorizontalAlignment(SwingConstants.CENTER);
		add(Detail);
		psgEnter.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == psgEnter){
			String idx = IDNumber.getText();
			System.out.println(idx+" "+idx.length());
			ResultSet man;
			man = db.getPassenger(idx);
			this.passenger.updateNewMan(man);
			userName.setText(passenger.name);
		}
	}

}
