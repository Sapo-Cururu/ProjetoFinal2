
package model;
public class Produto {
    private String name;
    private float price;
    private int id;
    private int cod_prod;
   
    public Produto(){};
    
    public Produto(String name, float price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
