/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Nam
 */
public class GiangVienCoHuu extends Giangvien{
    private float luongthoathuan;
    private int soGioquydinh;
    public GiangVienCoHuu(){
        
    }

    public GiangVienCoHuu(float luongthoathuan, int soGioquydinh) {
        this.luongthoathuan = luongthoathuan;
        this.soGioquydinh = soGioquydinh;
    }
    public GiangVienCoHuu(float luongThoaThuan, int soGioQuyDinh,
    String tenGiangVien, String email, String diachi, String dienThoai, float
    tongLuong, int soGioGiang) {
        super(tenGiangVien, email, diachi, dienThoai, tongLuong, soGioGiang);
        this.luongthoathuan = luongThoaThuan;
        this.soGioquydinh = soGioQuyDinh;
    }
    @Override
    public Giangvien inputq() {
    super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong thoa thuan:");
        this.luongthoathuan=Float.parseFloat(sc.nextLine());
        return this;
    }
    @Override
    public void displayq() {
        super.display();
        System.out.println("luong thoa thuan :"+luongthoathuan);
        System.out.println("so gio quy dinh :"+soGioquydinh);
    }
    @Override
    public void tinhluong() {
       float luong;
       luong=luongthoathuan+(this.getSoGioGiang()-40)*200000;
       this.setTongluong(luong);
    }
}
//viết các phương thức của lớp GiangVienCoHuu() trước rồi mới extend lớp Giangvien() 
//như thế sẽ ko phải chuyển thành lớp abstract
