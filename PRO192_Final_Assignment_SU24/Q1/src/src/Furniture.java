/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Furniture {
    public int id;
    public String name;
    public double price;
    public int quantity;

    public Furniture(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Furniture(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getSubTotal(){
        double subTotal = quantity * price;
        if (subTotal >= 50 && subTotal < 100) return subTotal*0.9;
        if (subTotal >= 100 && subTotal <= 500) return subTotal * 0.8;
        return subTotal;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f, %d, %.2f", id, name, price, quantity, getSubTotal());
       }
    
    
}
