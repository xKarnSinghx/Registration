package karndatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import karnbean.LoginBean;
public class LoginDao {
private String dbUrl = "jdbc:mysql://localhost:3306/userdb";/MySQL URL
and followed by the database name
private String dbUname = "root";//MySQL username
private String dbPassword = "Ka@12345";//MySQL password
private String dbDriver = "com.mysql.cj.jdbc.Driver";
public void loadDriver(String dbDriver)
{
try {
Class.forName(dbDriver);//loading mysql driver
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public Connection getConnection()
{
Connection con=null;
try {
con = DriverManager.getConnection(dbUrl, dbUname,
dbPassword);//attempting to connect to MySQL database
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return con;
}
public boolean validate(LoginBean loginBean)
{
boolean status = false;
loadDriver(dbDriver);//loading the driver
Connection con = getConnection();//setting the connection to
database.
String sql = "SELECT * FROM userdb.member where uname = ? and
password =?";
PreparedStatement ps;
try {
ps = con.prepareStatement(sql);
ps.setString(1, loginBean.getUname());//retrieving username
ps.setString(2, loginBean.getPassword());//retrieving password
ResultSet rs = ps.executeQuery();//this method helps in upadating
MYSQL statement.
status = rs.next();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return status;
}
}
