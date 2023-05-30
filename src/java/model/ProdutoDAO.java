package model;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAO {
    private static Connection conn;
    
    public ProdutoDAO() throws ClassNotFoundException, SQLException{
    conn = MyConnection.getConnection();
    }
    
     public void insertProduto(Produto produto) throws SQLException{
           
            String sql = "INSERT INTO produto(name, price, id)"
                                        + "VALUES (?, ?, ?)";
            
       
            PreparedStatement prep = conn.prepareStatement(sql);
            
            
            prep.setString(1, produto.getName());
            prep.setFloat(2, produto.getPrice());
            prep.setInt(3, produto.getId());
            
            prep.execute(); 
            prep.close();
        }
    
    public ArrayList<Produto> listProduto() throws SQLException{
        ArrayList<Produto> list = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        PreparedStatement prep = conn.prepareStatement(sql);
        ResultSet result = prep.executeQuery();
        while(result.next()) {
                //Criar um objeto vazio da classe Mapa
                Produto produto = new Produto();
                
                //Inserir os atributos a partir dos dados de cada coluna
                produto.setName(result.getString("name"));
                produto.setPrice(result.getFloat("price"));
                produto.setId(result.getInt("id"));
               
                
                //Inserir o objeto preenchido na lista
                list.add(produto);
            }
        return list;
    }
}
