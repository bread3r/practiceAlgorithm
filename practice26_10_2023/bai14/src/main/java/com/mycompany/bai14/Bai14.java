/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai14 {

 public static void main(String[] args) {
        // Khai bao - nhap
        int soDien, res = 0;
        int fee[] = {1484, 1535, 1786, 2242};
        Scanner sc = new Scanner(System.in);
        soDien = sc.nextInt();
        //Tinh tien`
        for (int i = 0 ; i < 4; ++i){
            if (soDien <= 0) break;
            if (soDien >= 50)
                res += (fee[i]*50);
            else 
                res += (fee[i]*soDien);
            soDien -= 50;
        }
        //
        System.out.println(res);
    }
}
