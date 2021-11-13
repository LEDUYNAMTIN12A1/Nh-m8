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
public class KhachVietNam extends Khanhhang{
    private String loaiKH;
    public int dinhmuc;

    public KhachVietNam() {
    }

    public KhachVietNam(String loaiKH, int dinhmuc) {
        this.loaiKH = loaiKH;
        this.dinhmuc = dinhmuc;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
    
    @Override
    public double getThanhtien() {
        if(soLuong<=dinhmuc){
            return dongia*soLuong;
        }
        else{
            return soLuong*dongia*dinhmuc + (dinhmuc-soLuong)*dongia*2.5;
        }
    }
    
    @Override 
    public void input(){
         super.input();
         Scanner sc = new Scanner(System.in);
         System.out.println("Loại Khách hàng : ");
         this.loaiKH = sc.nextLine();
         System.out.println("Định mức : ");
         this.dinhmuc = sc.nextInt();
    }
    @Override 
    public  void display(){
        super.display();
        System.out.println("Thành tiền " +getThanhtien() + "VND");
        System.out.println("Loại Khách hàng : " + this.loaiKH);
        System.out.println("Định mức " + this.dinhmuc);
    }
}
