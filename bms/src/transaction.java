/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sachin Kumar
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class transaction {
    public static boolean check(){
        try{
            Connection con = database.db();
            Statement stm = con.createStatement();
            String sql = "select * from transactions;";
            ResultSet rs = stm.executeQuery(sql);
            
            if(rs.next())
                return true;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error !!", 3);
        }
        return false;
    }
    
}
