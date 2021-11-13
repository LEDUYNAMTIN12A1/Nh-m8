/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Quanlygiangvien {
    public static void main(String[] args) {
        int n = 0;
        ArrayList<Giangvien> list=new ArrayList<Giangvien>();
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    System.out.println("nhap giang vien co huu :");
                        GiangVienCoHuu sv = new GiangVienCoHuu();
                        sv.inputq();
                        list.add(sv);
                    break;
                }
                case 2: {
                     System.out.println("nhap giang vien thinh giang :");
                     list.add(new Giangvienthinhgia().inputq());
                     break;
                }
                case 3: {
                    if(list==null){
                    System.out.println("ban chua nhap du lieu");
                    }
                    else{
                    System.out.println("thong tin giang vien vua nhap la :");
                    int i=0;
                    for (Giangvien e:list) {
                        System.out.println("thong tin giang vien thu "+(i+1));
                        i++;
                        e.displayq();
                        }
                    }
                    break;
                    }
                case 4:
                    {
                    if(list==null){
                    System.out.println("ban chua nhap du lieu");
                    }
                    else{
                        int dem=0;
                        System.out.println("danh sach giang vien co huu");
                        for (Giangvien i : list) {
                            if (i instanceof GiangVienCoHuu) {
                            i.displayq();
                            dem++;
                               }
                            }
                        if(dem==0){
                        System.out.println("khong co san pham ban muon tim");
                              }
                        }
                    break;
                    }
                case 5:
                {
                     if(list==null){
                     System.out.println("ban chua nhap du lieu");
                                   }
                     else{
                            int dem=0;
                            System.out.println("danh sach giang vien thinh giang");
                            for (Giangvien i : list) {
                                if (i instanceof Giangvienthinhgia) {
                                    i.displayq();
                                    dem++;
                                }
                            }
                            if(dem==0){
                                System.out.println("khong co san pham ban muon tim");
                             }
                        }
                break;
                }
                case 6:
                {
                    if(list==null){
                        System.out.println("ban chua nhap du lieu");
                         }
                    else{
                        float tong=0;
                        System.out.println("tong luong cua toan bo giao vien la :");
                        for (Giangvien i:list) {
                            tong+=i.getTongluong();
                            }
                            System.out.println(tong);
                        }
                    break;
                }
                case 7:
                {
                    if(list==null){
                        System.out.println("ban chua nhap du lieu");
                                  }
                    else{
                        System.out.println("giang vien co luong cao nhat");
                        float max=0;
                        for (Giangvien i:list) {
                            if(max<i.getTongluong()){
                               max=i.getTongluong();
                               }
                            }
                        for (Giangvien i:list) {
                            if(max==i.getTongluong()){
                               i.displayq();
                                }
                            }
                        }
                }
                case 8:
                   break;
                   default:{
                   System.out.println("khong co lua chon cua ban ");
                   break;
                        }
                    }
        } while (n != 8);
 
    }
    public static void menu(){
        System.out.println("1 Nhap thong tin giang vien co huu");
        System.out.println("2 nhap thong tin giang vien thinhg giang");
        System.out.println("3 hien thi toan bo thong tin");
        System.out.println("4 hien thi thong tin giang vien co huu");
        System.out.println("5 hien thi thong tin GV thing giang");
        System.out.println("6 tong luong cua toan bo giang vien");
        System.out.println("7 luong cao nhat");
        System.out.println("8 thoat");
    }
}
//Nếu GiangVienCoHuu().inputq() hoặc Giangvienthinhgia.inputq() có lỗi ko gọi ra được inputq() , display() 
//thì kiểm tra lại lớp GiangVienCoHuu() và Giangvienthinhgia() có lỗi gì ko
//Hoặc xem có đúng chính tả ko
