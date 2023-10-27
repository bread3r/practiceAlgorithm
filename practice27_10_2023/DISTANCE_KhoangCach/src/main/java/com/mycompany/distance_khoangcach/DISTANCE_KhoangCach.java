//n khu dat co m duong di truc tiep giua 2 khu. Tim so cap khu dat ma duong di ngan nhat giua 2 khu la 2
//Thuat toan: nC2 - Tu 1 diem, tinh xem duoc co bao nhieu diem co duong di truc tiep toi no -> so cap khu dat di qua diem do
package com.mycompany.distance_khoangcach;

import java.util.Scanner;

public class DISTANCE_KhoangCach {

    public static void main(String[] args) {
        //Declaration
        int n, m, a, b, res = 0;
        int[] area = new int[100005];
        Scanner in = new Scanner(System.in);
        //Inp
        n = in.nextInt(); m = in.nextInt();
        for (int i = 0; i < m; ++i){
            a = in.nextInt(); b = in.nextInt();
            area[a]++;area[b]++;
        }
        //Solving
        for(int i = 1; i <= n; ++i) res += ((area[i]-1)*area[i]/2);
        //Out
        System.out.println(res);
    }
}
