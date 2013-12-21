import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Statement stm = null;
	private Connection con= null;
	private String sql = null;
	private ResultSet rs = null;
	 
	public DB(){
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?user=root&password=6363639082");
			 stm = con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	public ResultSet getPassenger(String piid){
		try {
			return stm.executeQuery("SELECT * FROM passenger WHERE piid = '" + piid + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/*public static void main(String[] args){
		DB db = new DB();
		try {
			db.stm.executeUpdate("insert into a values ('²Á')");
			db.rs = db.stm.executeQuery("select * from a");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(db.rs.next())
					System.out.println(db.rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
}