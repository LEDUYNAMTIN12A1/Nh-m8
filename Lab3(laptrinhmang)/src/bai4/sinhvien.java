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
abstract public class sinhvien {
    public String hoten;
    public String nganh;

    public sinhvien() {
    }

    public sinhvien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    abstract public double getdiem();
    public void nhapdl(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ho ten sinh vien : ");
        this.hoten=sc.nextLine();
        System.out.println(" Nganh cua sinh vien :");
        this.nganh=sc.nextLine();
    }
    public void xuatdl(){
        System.out.println(" Ho ten sinh vien :" +this.hoten);
        System.out.println(" Nganh sinh vien :"+this.nganh);
    }
}

