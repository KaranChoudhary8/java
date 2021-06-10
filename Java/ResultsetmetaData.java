import java.sql.*;
/**
 *
 * @author karan
 */
public class ResultsetmetaData {
    public static void main(String args[]) {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "Karan", "1234");
            PreparedStatement ps=con.prepareStatement("select * from DemoTable");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
