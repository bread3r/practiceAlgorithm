
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class FurnitureList extends ArrayList <Furniture>{
    public void addFurniture(Furniture furniture){
        FurnitureList.this.add(furniture);
    }
    
    public String getNameById(int id){
       String ans = "";
       for(Furniture furniture : this){
           if(furniture.getId() == id){
               ans = furniture.getName();
           }
       }
       if(ans.isEmpty()) return "N/A";
       return ans.toUpperCase();
    }
    
    public FurnitureList getFurnitureList(){
        Collections.sort(this, new Comparator<Furniture>(){
            @Override
            public int compare(Furniture a, Furniture b){
                return b.getQuantity() - a.getQuantity();
            }
        });
        return this;
    }
    
    public int getTotalQuantity(){
        int sum = 0;
        for(Furniture furniture : this){
            sum += furniture.getQuantity();
        }
        return sum;
    }
}
