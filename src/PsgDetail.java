import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
public class PsgDetail extends JFrame{
	User user;
	private JPanel showDetail;
	public PsgDetail(User user){
		this.user = user;
	}
	
	private void initGUI() {
		try {
			{
				showDetail = new JPanel();
				GridLayout showDetailLayout = new GridLayout(2, 1);
				showDetailLayout.setColumns(1);
				showDetailLayout.setHgap(5);
				showDetailLayout.setVgap(5);
				getContentPane().add(showDetail, BorderLayout.CENTER);
				showDetail.setLayout(showDetailLayout);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
