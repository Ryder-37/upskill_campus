package employee.management.system;

import java.sql.*;

public class Connn {
    
    Connection c;
    Statement s;
    
    public Connn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hrmanagementsystem", "root", "Code_0");
            s = c.createStatement();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
