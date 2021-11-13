/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class PieceWorked extends Employee{
    float soluongsanpham;
    float luong;
    @Override
    public float earnings() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so luong san pham");
        soluongsanpham=Float.parseFloat(sc.nextLine());
        return luong=(float) (soluongsanpham*0.5);
    }
    @Override
    public void hienthi() {
        //Lương của PieceWorker là soluongsanpham*0.5
        System.out.println("luong :"+luong);
    }
}
