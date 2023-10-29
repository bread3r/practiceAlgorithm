/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai2;

/**
 *
 * @author Admin
 */
public class DiaChi {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;
    
    public DiaChi(){
        
    }
    public DiaChi(String xa, String thon, String huyen, String tinh){
        this.xa = xa;
        this.thon = thon;
        this.huyen = huyen;
        this.tinh = tinh;
    }
    public void setThon(String thon){
        this.thon = thon;
    }
    public String getThon(){
        return thon;
    }
    public void setXa(String xa){
        this.xa = xa;
    }
    public String getXa(){
        return xa;
    }
    public void setHuyen(String huyen){
        this.huyen = huyen;
    }
    public String getHuyen(){
        return huyen;
    }
    public void setTinh(String tinh){
        this.tinh = tinh;
    }
    public String getTinh(){
        return tinh;
    }
    @Override
    public String toString(){
        return "Thon: " + thon + "\nXa: " + xa + "\nHuyen: " + huyen + "\nTinh: " + tinh;
    }
}
