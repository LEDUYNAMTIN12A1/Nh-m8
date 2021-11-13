/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class sinhvien implements Comparable<sinhvien>{
    private String Masv;
    private String Tensv;
    private int Namsinh;
    private String Diachi;
    private String Lop;

    public sinhvien() {
    }

    public sinhvien(String Masv, String Tensv, int Namsinh, String Diachi, String Lop) {
        this.Masv = Masv;
        this.Tensv = Tensv;
        this.Namsinh = Namsinh;
        this.Diachi = Diachi;
        this.Lop = Lop;
    }

    public String getMasv() {
        return Masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getLop() {
        return Lop;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    @Override
    public String toString() {
        return "sinhvien{" + "Masv=" + Masv + ", Tensv=" + Tensv + ", Namsinh=" + Namsinh + ", Diachi=" + Diachi + ", Lop=" + Lop + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sinh viên : ");
        this.Masv = sc.nextLine();
        System.out.println("Tên sinh viên:");
        this.Tensv=sc.nextLine();
        System.out.println("Năm sinh : ");
        this.Namsinh = sc.nextInt();
        System.out.println("Địa chỉ:");
        this.Diachi = sc.nextLine();
        System.out.println("Lớp : ");
        this.Lop = sc.nextLine();
    }
    
    public void display(){
        System.out.println("Mã sinh viên : " + this.Masv);
        System.out.println("Tên sinh viên : " + this.Tensv);
        System.out.println("Năm sinh : " + this.Namsinh);
        System.out.println("Địa chỉ : " +this.Diachi);
        System.out.println("Lớp : " + this.Lop);
    }

    @Override
    public int compareTo(sinhvien o) {
        if(Masv.equalsIgnoreCase(o.getMasv()))
        return 0;
        return 1; //To change body of generated methods, choose Tools | Templates.
    }

    
}
