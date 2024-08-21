
package Project;
import java.sql.*;
public class Projectconnectionprovider {
    public static Connection getConnection(){
        Connection con;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_examination", "root","");
           return con;
        }      
        catch(Exception e){
           e.printStackTrace();
        }
        return null;
}
}
