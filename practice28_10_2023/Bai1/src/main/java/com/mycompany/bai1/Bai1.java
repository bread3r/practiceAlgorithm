

package com.mycompany.bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Person per = new Person();
        per.setName("Nguyen Tran Khanh Luan");
        per.setDob("30/02/1667");
        per.setPob("Binh Dinh");
        per.setGender('M');
        per.setEmail("khanh.luan.1603@gmail.com");
        per.setPhone("08571603xx");
        System.out.println(per.toString());
        
    }
}
