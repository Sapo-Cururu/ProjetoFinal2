package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static Connection conn;
    
    public UserDAO() throws ClassNotFoundException, SQLException{
    conn = MyConnection.getConnection();
    }
    
    public User listOneUser(String name) throws SQLException{
    String query = "SELECT * FROM user_ WHERE login = ?";
    PreparedStatement prep = conn.prepareStatement(query);
    prep.setString(1, name);
    ResultSet result = prep.executeQuery();
    User user = new User();
    
    if (result.next()){
        user.setLogin(result.getString("login"));
        user.setPassword(result.getString("pass"));
        user.setCod_user(result.getInt("cod_user"));
    }
    return user;
    
    }
    
    
}
