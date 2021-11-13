/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Xemayhoabinh extends Xemay{
     
    @Override
    public void nhap(){
        super.nhap();
    }
    @Override 
    public void hienthi(){
        super.hienthi();
    }
    public static void main(String[] args) {
        ArrayList<Xemayhoabinh> List = new ArrayList<>();
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
                    System.out.println(" nhap so xe may hoa binh : ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Xemayhoabinh sv = new Xemayhoabinh();
                        sv.nhap();
                        List.add(sv);
                    }
                    System.out.println("=========================================");
                    break;
                case 2:
                    System.out.println("======================================");
                    for(int i=0;i<List.size();i++){
                        List.get(i).hienthi();
                    }
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.println("=========================================");
                    System.out.println(" moi nhap bien so xe can tim : ");
                    String namesearch = sc.nextLine();
                    int count=0;
                    for(Xemayhoabinh sv :  List){
                        if(sv.getBienso().equalsIgnoreCase(namesearch)){
                            sv.hienthi();
                            count++;
                        }
                    }
                    if(count == 0 ){
                        System.out.println("khong tim thay bien so  nay ! ");
                    }
                    System.out.println("========================================");
                    break;
                case 4:
                    System.out.println("======================================");
                    int dem = 0 ;
                    for (int i = 0; i < List.size(); i++) {
                        dem++;                    }
                    System.out.println("Tong luong xe la : " +dem);
                case 5:
                    System.out.println("==========================================");
                    Collections.sort(List, (a,b)->a.getBienso().compareTo(b.getBienso()));
                    for(int i=0 ;i<List.size();i++){
                        List.get(i).hienthi();
                    }
                    System.out.println("==========================================");
                    break;
                default:
                    System.out.println(" moi nhap lai !");
            }
        }while (choose!=6);       
    }
    static void showmenu(){
        System.out.println("1.nhap n xe may hoa binh  : ");
        System.out.println("2.hien thi xe may hoa binh  : ");
        System.out.println("3.Tim bien so xe  :   ");
        System.out.println("4. Tong luong xe   ");
        System.out.println("5. Sap xep theo giam dan : ");
        System.out.println("6. Thoat !");
    }
}
