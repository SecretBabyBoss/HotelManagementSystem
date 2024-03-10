package hotel.management.system;
import java.sql.*;
/**
 *
 * @author Yashu
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){  
        try{  
             
            c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","BaBoy@1109"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

