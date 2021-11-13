/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Khachnuocngoai extends Khanhhang{
    public String Quoctich;

    public Khachnuocngoai() {
    }

    public Khachnuocngoai(String Quoctich) {
        this.Quoctich = Quoctich;
    }

    public String getQuoctich() {
        return Quoctich;
    }

    public void setQuoctich(String Quoctich) {
        this.Quoctich = Quoctich;
    }

    @Override
    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public double getDongia() {
        return dongia;
    }

    @Override
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public SimpleDateFormat getDf() {
        return df;
    }

    public void setDf(SimpleDateFormat df) {
        this.df = df;
    }
    @Override
    public double getThanhtien() {
        return dongia*soLuong;
    }
    
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quốc tịch : ");
        this.Quoctich = sc.nextLine();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Quốc tịch : " + this.Quoctich);
        System.out.println("Tiền phải đóng của khách hàng " + getThanhtien() + "VND");
    }
}
