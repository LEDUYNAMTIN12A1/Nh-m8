/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nam
 */
public class Khanhhang {
    private String maKH;
    private String hotenKH;
    public int soLuong;
    public double dongia;
    private double thanhtien;
    private Date NgayHD;
    SimpleDateFormat df = new  SimpleDateFormat("dd-MM-yyyy");

    public Khanhhang() {
    }

    public Khanhhang(String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date NgayHD) {
        this.maKH = maKH;
        this.hotenKH = hotenKH;
        this.soLuong = soLuong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.NgayHD = NgayHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return  thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public Date getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(Date NgayHD) {
        this.NgayHD = NgayHD;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã khách hàng : ");
        this.maKH = sc.nextLine();
        System.out.println("Họ tên khách hàng : ");
        this.hotenKH = sc.nextLine();
        System.out.println("Số lượng : ");
        this.soLuong = sc.nextInt();
        System.out.println("Đơn giá : ");
        this.dongia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ngày ra hóa đơn : ");
        try {
            NgayHD = df.parse(sc.nextLine());
        } catch (ParseException ex) {
        }
    }
    public void display(){
        System.out.println("Mã khách hàng : " + this.maKH);
        System.out.println("Họ tên khách hàng : " + this.hotenKH);
        System.out.println("Số lượng : " + this.soLuong + "số điện");
        System.out.println("Đơn giá : " + this.dongia + "VND");
        System.out.println("Ngày ra hóa đơn : " + df.format(NgayHD));

    }
}
