/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Giangvienthinhgia extends Giangvien{
    private String coQuanLamViec;
    @Override
    public Giangvien inputq() {
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao co quan lam viec :");
        coQuanLamViec=sc.nextLine();
        return this;
    }
    @Override
    public void displayq() {
        super.display();
        System.out.println("co quan lam viec :"+coQuanLamViec);
    }
    @Override
    public void tinhluong() {
         float luong;
         luong=this.getSoGioGiang()*200000;
         this.setTongluong(luong);
    }
}
