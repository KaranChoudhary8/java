/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author karan
 */
public class First_jdbc_prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "Karan", "1234");
            Statement st = con.createStatement();
            String query = "select * from DemoTable";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                System.out.println(rs.getString("democolumn"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
