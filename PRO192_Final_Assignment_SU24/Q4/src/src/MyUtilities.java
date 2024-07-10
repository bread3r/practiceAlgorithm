/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyUtilities implements IUtilities {

    @Override
    public int sumNumber(int number) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sum = 0;
        for(int i = 1; i <= number/2; ++i)
            if(number % i == 0) sum += i;
        return sum;
    }

    @Override
    public String replaceString(String sentence, String s1, String s2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String ans = sentence.replaceAll("(?i)"+s1, s2);
        return ans;
    }
    
}
