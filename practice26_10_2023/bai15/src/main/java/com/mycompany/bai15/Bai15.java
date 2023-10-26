/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai15;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai15 {

    public static void main(String[] args) {
        // Khai bao - nhap
        
        Scanner sc = new Scanner(System.in);
        int soNgay = sc.nextInt();
        double donGia = sc.nextDouble();
        //Tinh tien`
       if (soNgay == 1) System.out.println(donGia);
       else if (soNgay <= 4 && soNgay >= 2) System.out.println(donGia*0.8);
       else if (soNgay <= 10 && soNgay >= 5) System.out.println(donGia*0.6);
       else System.out.println(donGia*0.4);
    }
}
