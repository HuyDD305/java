/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FruitShop;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class Order {
    private String customerName;
    private ArrayList<Fruit> listOfFruit;
    


    public Order(String customerName, ArrayList<Fruit> listOfFruit) {
        this.customerName = customerName;
        this.listOfFruit = listOfFruit;
    }
    
    public ArrayList<Fruit> getListOfFruit() {
        return this.listOfFruit;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    
    public static void addFruit() {
        
    }
    
    
    
}
