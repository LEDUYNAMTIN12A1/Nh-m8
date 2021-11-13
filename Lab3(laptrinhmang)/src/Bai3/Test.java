/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Test {
   
    public static void main(String[] args) {
        Employee[] arr=new Employee[3];
        System.out.println("Nhap Thong tin boss");
        arr[0]=new Boss();
        arr[0].nhap();
        System.out.println("Nhap Thong tin PieceWorked ");
        arr[1]=new PieceWorked();
        arr[1].nhap();
        System.out.println("Nhap Thong tin CommisstionWorked ");
        arr[2]=new CommissionWorker();
        arr[2].nhap();
        System.out.println("Thong tin boss");
        arr[0].display();
        System.out.println("Thong tin PieceWorked");
        arr[1].display();
        System.out.println("Thong tin CommisstionWorked");
        arr[2].display();
    }
}
