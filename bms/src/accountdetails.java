
import java.util.Date;

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

public class accountdetails {
    
    //public static String account;
    public  String fname;
    public  String lname;
    public  String emailid;
    public  String gender;
    public  String phonenumber;
    public  Date dob ;
    public  double depositamount;
    public  String password;
    public  String username;
    public  String adharno;
    public  String panno;
    
    public accountdetails(String accountn){
    
        try{
        Connection con = database.db();
        Statement stm = con.createStatement();
        String sql = "select * from AccountDetails where AccountNumber = '"+accountn+"'; ";
        ResultSet rs = stm.executeQuery(sql);
        if(rs.next())
        {
            fname = rs.getString("FirstName");
            lname = rs.getString("LastName");
            username=rs.getString("Username");
            emailid = rs.getString("Email");
            gender = rs.getString("Gender");
            phonenumber =rs.getString("Phone");
            dob = rs.getDate("DOB");
            adharno = rs.getString("AdharNumber");
            panno = rs.getString("PanNumber");
            depositamount = rs.getDouble("Deposit");
            password = rs.getString("Password"); 
            
        }
        else 
           JOptionPane.showMessageDialog(null, "Unable to find your account","Error !!", 3); 
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error !!", 3);
        }
    }
    
    
}
