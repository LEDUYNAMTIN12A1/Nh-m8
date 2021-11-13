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
public abstract class Giangvien {
    private String tenGiangVien;
    private String email;
    private String diachi;
    private String dienthoai;
    private float tongluong;
    private int soGioGiang;

    public Giangvien() {
    }

    public Giangvien(String tenGiangVien, String email, String diachi, String dienthoai, float tongluong, int soGioGiang) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.tongluong = tongluong;
        this.soGioGiang = soGioGiang;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public float getTongluong() {
        return tongluong;
    }

    public void setTongluong(float tongluong) {
        this.tongluong = tongluong;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }
    
    public abstract Giangvien inputq();
    public abstract void displayq();
    public abstract void tinhluong();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên giảng viên : ");
        this.tenGiangVien = sc.nextLine();
        System.out.println("Email : ");
        this.email = sc.nextLine();
        System.out.println("Dia chỉ : ");
        this.diachi = sc.nextLine();
        System.out.println("Điện thoại : ");
        this.dienthoai = sc.nextLine();
        System.out.println(" Tổng Lương : ");
        this.tongluong = sc.nextFloat();
        System.out.println(" Số giờ giảng : ");
        this.soGioGiang = sc.nextInt();
    }
    public void display(){
        System.out.println(" Tên giảng viên : " +this.tenGiangVien);
        System.out.println("Email : " + this.email);
        System.out.println("Địa chỉ : " + this.diachi);
        System.out.println(" Điện thoại : " + this.dienthoai);
        System.out.println("Số giờ giảng : " + this.soGioGiang);
        System.out.println("Tổng Lương  " + this.tongluong);
    }
}
