/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FruitShop;

/**
 *
 * @author ADMIN
 */
public class Fruit {
    private int fruitId;
    private String fruitName;
    private int price;
    private int Quanity;
    private String Origin;
    
    public Fruit() {
        
    }

    public Fruit(int fruitId, String fruitName, int Price, int Quanity, String Origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = Price;
        this.Quanity = Quanity;
        this.Origin = Origin;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int Price) {
        this.price = Price;
    }

    public int getQuanity() {
        return Quanity;
    }

    public void setQuanity(int Quanity) {
        this.Quanity = Quanity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
    
    

    @Override
    public String toString() {
        return "Fruit{" + "fruitId = " + fruitId + ", fruitName = " + fruitName + ", Price = " + price + ", Quanity = " + Quanity + ", Origin = " + Origin + '}';
    }
    
    
    
    
    
}
