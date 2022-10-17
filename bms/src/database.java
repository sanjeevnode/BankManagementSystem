
import java.sql.*;
import javax.swing.*;

public class database {
    public static Connection db(){
       try {
           //Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","Kabcd02.");
           return con;
     
       }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
