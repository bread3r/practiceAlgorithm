
package com.mycompany.bai23;

import java.util.Scanner;

public class Bai23 {
 
    public static void main(String[] args) {
        //nhap xuat - khai bao//
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int n,highestScore = -1,tempScore;
        int[] a = new int[100];
        String tempName,highestName = "";
        String[] name = new String[100];
        n = sc.nextInt();
        for (int i = 0 ; i < n ;++i) {
            name[i] = str.nextLine();
            a[i] = sc.nextInt();
            if (a[i] >  highestScore) {
                highestScore = a[i]; 
                highestName = name[i];
            }
        }
        //~sap xep
        for (int i = n-1; i >= 0; i--)
            for (int j = 0; j < i; ++j)
                if(a[j] > a[i]) {
                    tempScore = a[i];
                    a[i] = a[j];
                    a[j] = tempScore;
                    tempName = name[i];
                    name[i]= name[j];
                    name[j] = tempName;
                }
        //~//
        //xuat
        System.out.println(highestName + " " + highestScore);
        for (int i = 0; i < n; i++){
            System.out.println(name[i] + " " + a[i]);
        }
    
    }
}
