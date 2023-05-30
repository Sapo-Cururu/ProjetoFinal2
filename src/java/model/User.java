package model;

import java.sql.SQLException;

public class User {
    private String login;   
    private String password;
    private int cod_user;
    
    public User(){}
    
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCod_user() {
        return cod_user;
    }

    public void setCod_user(int cod_user) {
        this.cod_user = cod_user;
    }
    
    
    public boolean isLogged() throws ClassNotFoundException, SQLException{
    UserDAO udao = new UserDAO();
    User ubanco = udao.listOneUser(this.login);
    
    if (ubanco.getLogin() != null){
        return (this.password.equals(ubanco.getPassword()));
    }else {
        return false;
    }
    }
    
}
