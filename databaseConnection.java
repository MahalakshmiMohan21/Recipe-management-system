
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class databaseConnection {
    // C:\Program Files\java\jdk1.8.0_101\jre\lib\ext
    final static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/recipe_management";
    
    final static String USER="root";
    final static String PASS="";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
