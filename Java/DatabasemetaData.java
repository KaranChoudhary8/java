import java.sql.*;
/**
 *
 * @author karan
 */
public class DatabasemetaData {
    public static void main(String args[]) {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "Karan", "1234");
            DatabaseMetaData metaData = con.getMetaData();
            
            System.out.println("Driver Name: "+metaData.getDriverName());
            System.out.println("Driver Version: "+metaData.getDriverVersion());
            System.out.println("Database User Name: "+metaData.getUserName());
            System.out.println("Database Product Name: "+metaData.getDatabaseProductName());
            System.out.println("Database Product Version: "+metaData.getDatabaseProductVersion());
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
