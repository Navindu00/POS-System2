/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class DbConnection {
    private static DbConnection dbConnection;
    private Connection connection;
    
    private DbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_mvc","root","Navindu@12");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public static DbConnection getInstance(){
        if(dbConnection == null){
            dbConnection =  new DbConnection();
        }
        return dbConnection;   
    }
}
