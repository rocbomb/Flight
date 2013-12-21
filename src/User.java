import java.sql.ResultSet;
import java.sql.SQLException;


public class User {
	String name;
	int    userID;
	String IDnumber;
	int    age;
	String sex;
	String phone;
	String addr;
	public User(){
		name = new String("皮卡丘");
		userID = 12346;
		age  = 15;
		IDnumber = new String("330825199303290315");
		sex  = "男";
		phone = new String("18810460076");
		addr = new String("北京市海淀区学院路37号");
	}
	
	public void updateNewMan(ResultSet man){
		try {
			while(man.next()){
				name = man.getString("pname");
				age  = man.getInt("page");
				IDnumber =  man.getString("piid");
				sex  = man.getString("psex");
				phone = man.getString("ptel");
				addr = man.getString("padd");
				userID = man.getInt("pid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
