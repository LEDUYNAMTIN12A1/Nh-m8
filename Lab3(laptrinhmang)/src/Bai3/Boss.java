/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Nam
 */
public class Boss extends Employee{
    private float luong;
    public float getLuong() {
    return luong;
       }
    public void setLuong(float luong) {
       this.luong = luong;
    }
    @Override
    public float earnings() {
        return luong=4500;
    }
    @Override
    public void hienthi() {
        //Lương của Boss là 4500
       System.out.println("luong :"+luong);
    }

}
