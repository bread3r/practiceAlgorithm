/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai3;

/**
 *
 * @author Admin
 */
public class NhanVien {
    String name;
    DiaChi address;
    String dob;
    char gender;
    
    public NhanVien(){
        
    }
    public NhanVien(String name, DiaChi address, String dob, char gender){
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String thon, String xa, String huyen, String tinh ){
        DiaChi adr = new DiaChi(thon, xa, huyen, tinh);
        this.address = adr;
    }
    public void setAddress(DiaChi address){
        this.address = address;
    }
    public DiaChi getAddress(){
        return address;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return dob;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nDob: " + dob + "\nGender: " + gender;
    }
}
