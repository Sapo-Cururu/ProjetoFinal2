package model;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn;
    conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/Mercado",
                    "root",
                    "");
        
            System.out.println("Conexão bem sucedida!");
            return conn;
    }
}
