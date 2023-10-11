
package Login;

 // Data base Connection

import java.sql.Connection;

public class db {
    
     public static Connection mycon(){

         Connection con = null;
        
             try {
    
                   Class.forName("com.mysql.jdbc.Driver");

                   con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/login", "root", "");
            
              } catch (ClassNotFoundException  |   SQLException e)  {
                    System.out.println(e);
             }
     

         return con;
         }
}
