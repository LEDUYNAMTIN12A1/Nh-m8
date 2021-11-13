/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Teststudent extends sinhvien{
    
    public static void main(String[] args) {
         Danhsachsinhvien qlsv=new Danhsachsinhvien();
         sinhvien teo=new sinhvien();
         teo.setMasv("113");
         teo.setTensv("Nguyễn Văn Tèo");
         qlsv.addSinhVien(teo);
         teo.setDiachi("Yên bái");
         teo.setLop("MẠNG MÁY TÍNH 12A1HN ");
         sinhvien ty=new sinhvien();
         ty.setMasv("114");
         ty.setTensv("Nguyễn Thị tý");
    
         ty.setDiachi("Hà nội ");
         ty.setLop("Tin 12a1");
         sinhvien anh = new sinhvien();
         anh.setMasv("115");
         ty.setTensv("Hoàng diệu hương");
         ty.setDiachi("Hà nội ");
         ty.setLop("Tin 12a1");
         qlsv.addSinhVien(ty);
         qlsv.sort();
         System.out.println(qlsv);

    }
}
