/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai12;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        if (point <= 100 && point >= 90)
            System.out.println("A");
        else if (point < 90 && point >= 80)
            System.out.println("B");
        else if (point < 80 && point >= 70)
            System.out.println("C");
        else if (point < 70 && point >= 50)
            System.out.println("D");
        else 
            System.out.println("F");
    }
}
