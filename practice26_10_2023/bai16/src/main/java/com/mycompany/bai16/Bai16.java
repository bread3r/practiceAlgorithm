/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai16;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

//~tinh giai thua cua mot so~//
public class Bai16 {
    public static int factorial(int n,int res){
        res *= n;
        if ( n == 1) return res;
        return factorial (n-1,res);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(factorial(n,1));
    }
}
