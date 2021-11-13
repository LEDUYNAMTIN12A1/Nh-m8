/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1.lab2;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Bai1Lab2 {

    /**
     * @param args the command line arguments
     */
    static void menu(){
            System.out.println("1.Nhap danh sach sinh vien:");
            System.out.println("2.Xuat dánh sách sinh vien: ");
            System.out.println("3.Sap xep danh sach sinh vien:");
            System.out.println("4.Thoat");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        Product a = new Product();
        Product[] product = null;
        do {            
            menu();
              System.out.println("Nhap vao lua chon cua ban :");
              Scanner sc = new Scanner(System.in);
              n = Integer.parseInt(sc.nextLine());
              switch (n) {
              case 1: {
              int m;
              System.out.println("Nhap vao n :");
              m = Integer.parseInt(sc.nextLine());
              product = new Product[m];
              for (int i = 0; i < m; i++) {
                     product[i] = new Product();
                     product[i].nhap();
              }
              break;
              }
              case 2: {
              if (product == null) {
              System.out.println("ban chua nhap du lieu");
              } else {
              System.out.println("du lieu ban vua nhap la :");
              for (int i = 0; i < product.length; i++) {
                       System.out.println("thong tin hang hoa thu " + (i + 1));
                       product[i].hienthi();
                      }
              }
              break;
              }
              case 3: {
                    if (product == null) {
                       System.out.println("ban chua nhap du lieu");
                    } else {
                    a.sort(product);
                    System.out.println("du lieu sau khi sap xep la :");
                    for (int i = 0; i < product.length; i++) {
                    System.out.println("thong tin hang hoa thu " + (i + 1));
                    product[i].hienthi();
                    }
                }
              break;
              }
              case 4:
                     break;
                     default: {
                     System.out.println("khong co lua chon cua ban ");
                     break;
                    }
                 }
        } while (n !=4 );
    }
    
}
