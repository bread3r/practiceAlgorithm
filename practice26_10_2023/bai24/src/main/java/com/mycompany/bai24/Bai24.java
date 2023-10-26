package com.mycompany.bai24;

import java.util.Scanner;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class Bai24 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int n = in.nextInt(), pt, rdpt;
        String name;
        
        Map<Integer, Queue<String>> bangDiem = new HashMap<Integer, Queue<String>>();
        for (int i = 0; i < n; ++i){
            name = str.nextLine();
            pt = in.nextInt();
            if (bangDiem.get(pt) == null ) {
                Queue<String> hehe = new LinkedList<>();
                bangDiem.put(pt,hehe);}
            bangDiem.get(pt).offer(name);
        }
        
        rdpt = in.nextInt();
        System.out.println(bangDiem.get(rdpt));
        
    }
}
