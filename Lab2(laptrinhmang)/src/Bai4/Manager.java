/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Manager {
    public static void main(String[] args) {
        ArrayList<Mobile> List = new ArrayList<>();
        ArrayList<Car> List1 = new ArrayList<>();
        int choose;
        Scanner sc=  new Scanner(System.in);
        do{
            showmenu();
            System.out.println(" moi nhap lua chon : ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("========================================");
                    int n;
                    System.out.println(" nhap so Moblie : ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Mobile sv = new Mobile();
                        sv.input();
                        List.add(sv);
                    }
                    System.out.println("=========================================");
                    break;
                case 2:
                    System.out.println("========================================");
                    int m;
                    System.out.println(" nhap so Car : ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Car sv1 = new Car();
                        sv1.input();
                        List1.add(sv1);
                    }
                    System.out.println("=========================================");
                    break;
                case 3:
                    System.out.println("=======================================");
                    System.out.println("  1  .Xuat ds moblie");
                    for (int i = 0; i < List.size(); i++) {
                        List.get(i).display();
                    }
                    System.out.println("======================================");
                    System.out.println(" 2.   Danh sach Car : ");
                    for (int i = 0; i < List1.size(); i++) {
                       List1.get(i).display();
                    }
                    System.out.println("========================================");
                    break;
                case 4:
                    System.out.println("========================================");
                    System.out.print("  Tim kiem theo ten nha san xuat : " );
                    String namesearch = sc.nextLine()  + "\n";
                    int count=0;
                    for(Mobile sv :  List){
                        if(sv.getManufacturer().equalsIgnoreCase(namesearch)){
                            sv.display();
                            count++;
                        }
                    }
                    System.out.println("===================================");
                    for(Car sv1 :  List1){
                        if(sv1.getManufacturer().equalsIgnoreCase(namesearch)){
                            sv1.display();
                            count++;
                        }
                    }
                    if(count == 0 ){
                        System.out.println("khong tim thay nha san xuat  nay ! ");
                    }
                    System.out.println("========================================");
                    break;
                default:
                    System.out.println(" moi nhap lai !");
            }
        }while (choose!=6);
    }
    static void showmenu(){
        System.out.println("1.nhap n moblie  : ");
        System.out.println("2.nhap n Car  : ");
        System.out.println("3.hien thi moblie and Car  :   ");
        System.out.println("4.Tim kiem theo ten nha san xuat   ");
        System.out.println("5.  : ");
        System.out.println("6. Thoat !");
    }
}
