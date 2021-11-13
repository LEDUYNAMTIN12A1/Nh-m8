/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public abstract class Employee {
    private String name;
    private float luong;
    public abstract float earnings();
    public abstract void hienthi();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten : ");
        name=sc.nextLine();
        earnings();
    }
    public void display(){
        System.out.println("Name : " + name);
        hienthi();
    }
}
