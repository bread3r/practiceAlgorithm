/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Medicine {
    public String name;
    public String indication;
    public int expirationYear;

    public Medicine(String name, String indication, int expirationYear) {
        this.name = name;
        this.indication = indication;
        this.expirationYear = expirationYear;
    }

    public Medicine() {
    }

    public String getName() {
        return fixName(name);
    }

    public String getIndication() {
        return fixName(indication);
    }

    public int getExpirationYear() {
        return expirationYear;
    }
    
    public String fixName(String name) {
        String[] words = name.split(" ");
        String nameAfter = ""; 
        for(String word : words){
           if(word.length() > 0){
              nameAfter += (" " + Character.toUpperCase(word.charAt(0)));
              nameAfter = nameAfter.concat(word.substring(1).toLowerCase());
               System.out.println(nameAfter);
           }
        }
        return nameAfter.trim();
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %d", getName(), getIndication(),getExpirationYear());
    }
    
    
}
