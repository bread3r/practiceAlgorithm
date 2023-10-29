/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String dob;
    private String pob;
    private char gender;
    private String email;
    private String phone;
    
    public Person(){
        
    }
    public Person(String name, String dob, String pob, char gender, String email, String phone){
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return dob;
    }
    public void setPob(String pob){
        this.pob = pob;
    }
    public String getPob(){
        return pob;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nDob: " + dob + "\nPob: " + pob + "\nGender: " + gender + "\nEmail: " + email + "\nPhone: " + phone;
    }
}
