/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Product {
    private String tenhanghoa;
    private String nhaSanXuat;
    private float giaBan;

    public Product() {
    }

    public Product(String tenhanghoa, String nhaSanXuat, float giaBan) {
        this.tenhanghoa = tenhanghoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println(" nhap ten hang hoa :  ");
        this.tenhanghoa = in.nextLine();
        System.out.println("nhap nha san xuat : ");
        this.nhaSanXuat = in.nextLine();
        System.out.println("nhap gia ban  :  ");
        this.giaBan = in.nextFloat();
    }

    public void hienthi() {
        System.out.println("ten hang hoa : " + this.tenhanghoa);
        System.out.println("nha san xuat: " + this.nhaSanXuat);
        System.out.println("gioi tinh " + this.giaBan);
    }
    public void sort(Product[] b){
          for (int i = 0; i < b.length - 1; i++) {
               for (int j = i + 1; j < b.length; j++) {
                    if (b[i].giaBan > b[j].giaBan) {
                        Product tem = b[i];
                        b[i] = b[j];
                        b[j] = tem;
                    }
               }
            }
    }

}
