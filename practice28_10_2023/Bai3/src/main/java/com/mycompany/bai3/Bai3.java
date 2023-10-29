/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3;

/**
 *
 * @author Admin
 */
public class Bai3 {

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.setName("Nguyen Tran Khanh Lu");
        nv.setAddress("An Luong","My Chanh", "Phu My","Binh Dinh");
        nv.setDob("160/15/20250");
        nv.setGender('M');
        System.out.println(nv.toString());
    }
}
