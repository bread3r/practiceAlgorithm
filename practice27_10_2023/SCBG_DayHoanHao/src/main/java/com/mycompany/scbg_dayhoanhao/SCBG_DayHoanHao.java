// Tim trung binh cong cua day cho tong day >= k sao cho lon nhat
// Thuat toan: Su dung mang Sum[i] -> tinh tong tu dau toi so i -> tinh tong duoc tung doan tren arr[] -> tinh duoc trung binh cong -> tim res;
package com.mycompany.scbg_dayhoanhao;

import java.util.Scanner;

public class SCBG_DayHoanHao {

    public static void main(String[] args) {
        //declaration-Khai bao
        Scanner in = new Scanner(System.in);
        long n, res = 0, k;
        long[] arr = new long[100001], sum = new long[100001];
        sum[0] = 0;
        n = in.nextInt(); k = in.nextLong();
        // Input - Nhap, xu ly dau
        for (int i = 1; i <= n; ++i){
            arr[i] = in.nextInt();
            sum[i] = sum[i-1] + arr[i];
        } 
        //Tim trung binh cong hon bang k lon nhat
        int i = 1, j = 1;
        while (i <= n){
            while(sum[i] - sum[j-1] >= k){
                if((sum[i] - sum[j-1])/(i-j+1) > res) 
                    res = (sum[i] - sum[j-1])/(i-j+1);
                j++;
            }
            i++;
            if (j >= 2) j--;
        }
        //Output - Xuat
        System.out.println(res);
    }
}
