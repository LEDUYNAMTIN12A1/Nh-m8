/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class sinhvienpoly extends sinhvien {
    private double diem;

    public sinhvienpoly() {
    }

    public sinhvienpoly(double diem) {
        this.diem = diem;
    }
    @Override
    public double getdiem(){
        return this.diem;
    }
    public String gethocluc(){
        if(diem>=8.0){
            return "gioi";
        }
        if(diem>8.0 && diem>7.0){
            return "kha";
        }
        if(diem>=5.0 && diem <=7.0){
            return "trung binh";
        }
        if(diem<5.0){
            return "yeu";
        }
        return "nhap sai";
    }
    @Override
    public void nhapdl(){
        super.nhapdl();
        Scanner sc = new Scanner(System.in);
        System.out.println("diem cua sinh vien :  "+getdiem());
        this.diem=sc.nextFloat();
    }
    @Override
    public void xuatdl(){
        super.xuatdl();
        System.out.println(" diem cua sinh vien :  "+this.diem);
        System.out.println(" hoc luc cua sinh vien la :"+gethocluc());
    }
    public static void main(String[] args) {
        sinhvienpoly svn = new sinhvienpoly();
        svn.nhapdl();
        svn.xuatdl();
    }
}

