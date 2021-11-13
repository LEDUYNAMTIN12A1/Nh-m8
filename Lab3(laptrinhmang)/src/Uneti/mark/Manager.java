/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uneti.mark;

import Uneti.StudentUneti;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Manager {
    /* public static void main(String[] args) {
        ArrayList<StudentUneti> List = new ArrayList<>();
        ArrayList<StudentMark> listmark = new ArrayList<>();
        StudentMark[] stdmark = null;
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
                    System.out.println(" nhap so n sinh vien : ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        StudentUneti sv = new StudentUneti();
                        System.out.println("Sinh vien thu" + (i+1));
                        sv.input();
                        List.add(sv);
                    }
                    System.out.println("=========================================");
                    break;
                case 2:
                    System.out.println("======================================");
                    for(int i=0;i<List.size();i++){
                        System.out.println("Xuat sinh vien thu " + (i+1));
                        System.out.println("========================================");
                        List.get(i).display();
                    }
                    System.out.println("========================================");
                    break;
                case 3:
                    if(List!=null){
                        int k;
                        System.out.println("Nhập vào số sinh viên : ");
                        k= Integer.parseInt(sc.nextLine());
                        for(int i=0 ; i<listmark.size() ; i++){
                            int dem=0;
                            String IDsearch;
                            do {                                
                                StudentMark a = new StudentMark();
                                System.out.println("Nhập môn học thứ " + (i+1));
                                   a.input();
                                   listmark.add(a);
                                   
                                
                            } while (dem!=0);
                        }
                        
                    }else{
                        System.out.println("Cap nhap thong tin sinh vien cho trươc");
                    }
                break;
                default:
                    System.out.println(" moi nhap lai !");
            }
        }while (choose!=6); 
    }
    static void showmenu(){
        System.out.println("1.nhap n sinh vien  : ");
        System.out.println("2.hien thi sinh vien  : ");
        System.out.println("3.  :   ");
        System.out.println("4.   ");
        System.out.println("5.  : ");
        System.out.println("6. Thoat !");
    }*/
    public static void main(String[] args) {
    int n=0;
    StudentUneti[] std=null;
    StudentMark[] stdmark = null;
        do {            
            Scanner sc=new Scanner(System.in);
            System.out.println("1 Nhap thong tin n sinh vien uneti");
            System.out.println("2 Nhap m diem cho cac sinh vien nay");
            System.out.println("3 sap xep sinh vien theo ten va hien thi ");
            System.out.println("4 Tim thong tin diem cua sinh vien theo id");
            System.out.println("Nhap vao lua chon cua ban : ");
            n=Integer.parseInt(sc.nextLine());
            switch(n)
            {
                case 1:
                    int m;
                    System.out.println("nhap vao so sinh vien :");
                    m=Integer.parseInt(sc.nextLine());
                    std=new StudentUneti[m];
                    for (int i = 0; i < m; i++) {
                        std[i]=new StudentUneti();
                        int dem=0;
                        do {
                           System.out.println("Nhap vao thong tin sinh vien thu "+(i+1));
                           std[i].input();
                           dem=0;
                           for (int j = 0; j < i; j++) {
                                if(std[i].getStuID().equals(std[j].getStuID())&&std!=null) {
                                System.out.println("ma id trung vui long nhap lai");
                                dem++;
                                }
                            }
                        }while(dem!=0);
                    }
                    break;
                case 2:
                    if(std!=null) {
                    System.out.println("Nhập số sinh viên có điểm là : ");
                    m=Integer.parseInt(sc.nextLine());
                    std=new StudentUneti[m];
                    for (int i = 0; i < m; i++) {
                        std[i]=new StudentUneti();
                        int dem=0;
                        do {
                           System.out.println("Nhap vao thong tin sinh vien thu "+(i+1));
                           std[i].input();
                           dem=0;
                            for (int j = 0; j < i; j++) {
                                if(std[i].getStuID().equals(std[j].getStuID())&&std!=null) {
                                System.out.println("ma id trung vui long nhap lai");
                                dem++;
                                }
                            }
                        }while(dem!=0);
                    }
                    }
                    else {
                    System.out.println("can nhap thong tin cho sinh vien truoc");
                    }
                    break;
                case 3:
                    if(std==null) {
                    System.out.println("ban chua nhap du lieu ");
                    }
                    else {
                        for (int i = 0; i < std.length- 1; i++) {
                            for (int j = i + 1; j <std.length; j++) {
                                if(std[i].getStuName().compareTo(std[i].getStuName())>0)
                                {
                                     StudentUneti tg=std[i];
                                     std[i]= std[j];
                                     std[j]=tg;
                                }
                            }
                        }
                        for (int i = 0; i < std.length; i++) {
                            System.out.println("thong tin sinh vien thu "+(i+1));
                            std[i].display();
                            }
                        }
                    break;
                case 4:
                    if(std==null||stdmark==null) {
                        System.out.println("ban chua nhap du lieu ");
                        }
                    else {
                        String id;
                        System.out.println("Mhap vao id ban muon tim:");
                        id= sc.nextLine();
                        System.out.println("Thong tin sinh vien ");
                        for (int i = 0; i < std.length; i++) {
                             if(id.equals(std[i].getStuID())){
                             stdmark[i].display();
                            }
                        }
                        System.out.println("voi cac diem :");
                            for (int i = 0; i < stdmark.length; i++) {
                                if(id.equals(stdmark[i].getStuId())){
                                   stdmark[i].display();
                                   }
                            }
                        }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("khong co lua chon cua ban");
                    break;
            }
        }while (n!= 5);
    }
}
            
                  