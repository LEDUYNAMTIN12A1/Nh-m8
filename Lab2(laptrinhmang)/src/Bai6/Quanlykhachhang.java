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
public class Quanlykhachhang {
    public static void main(String[] args) {
        ArrayList<KhachVietNam> List = new ArrayList<>();
        ArrayList<Khachnuocngoai> List1 = new ArrayList<>();
        int choose;
        Scanner sc=  new Scanner(System.in);
        do{
            showmenu();
            System.out.println(" moi nhap lua chon : ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("========================================");
                    System.out.println(" nhap n khach hàng người Việt : ");
                    int n;
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        KhachVietNam sv = new KhachVietNam();
                        sv.input();
                        List.add(sv);
                    }
                    System.out.println("=========================================");
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println(" nhap m khách hàng nước ngoài : ");
                    int m;
                    m=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<m;i++){
                        Khachnuocngoai a = new Khachnuocngoai();
                        a.input();
                        List1.add(a);
                    }
                    System.out.println("=========================================");
                    break;
                case 3:
                    int chon3;
                    MenuCon();
                    chon3= Integer.parseInt(sc.nextLine());
                    switch(chon3)
                    {
                        case 1: 
                            if(List==null){
                                System.out.println("Chưa nhập dữ liệu cho khách hàng Việt Nam");
                            }
                            else
                            {   
                                System.out.println("=============================");
                                System.out.println("===========Danh sách khách hàng Việt Nam =====================");
                                for(int i=0;i<List.size();i++){
                                System.out.println("===========================");
                                List.get(i).display();
                                }
                            }
                            System.out.println("======================================");
                        break;
                        case 2:
                            if(List1==null)
                            {
                                System.out.println("Chưa nhập dữ liễu cho khách hàng nước ngoài ");
                            }
                            else
                            {
                                System.out.println("=============================");
                                System.out.println("=======Danh Sách khách hàng Nước Ngoài là ===================");
                                for(int i=0;i<List1.size();i++){
                                System.out.println("===========================");
                                List1.get(i).display();
                                }
                            }
                        break;
                        default:
                            System.out.println("Lựa chọn bạn vừa nhập không có trong Menu.");
                        break;
                    }
                break;
                case 4:
                    int chonc4;
                    MenuCon();
                    chonc4=Integer.parseInt(sc.nextLine());
                    switch(chonc4)
                    {
                        case 1: 
                            System.out.println("======Tổng số điện tiêu thụ của khách hàng việt nam là :==========");
                            double total1 = 0.0;
                            for(int i=0 ; i<List.size() ; i++){
                                total1+=List.get(i).getSoLuong();
                            }
                            System.out.println("==" + total1 + "số điện");
                            System.out.println("===========================================");
                        break;
                        case 2:
                            System.out.println("=====Tổng số lượng điện tiêu thụ của khách hàng Nước ngoài là :");
                            double total2=0.0;
                            for (int i = 0; i < List1.size(); i++) {
                                total2+=List1.get(i).getSoLuong();
                            }
                            System.out.println("===" + total2 + "Số điện");
                            System.out.println("============================================");
                        break;
                        default:
                            System.out.println("Lựa chọn bạn vừa nhập không có trong Menu.");
                    }
                    break;
                case 5:
                    System.out.println("=================================");
                    System.out.println("Tính tiền trung bình của khach hàng Nước Ngoài ");
                    double Tong = 0;
                    int dem=0;
                    for (int i = 0; i <List1.size(); i++) {
                        Tong+=List1.get(i).getThanhtien();
                        dem++;
                    }
                    System.out.println(" Tiền trung bình của khách hàng nước ngoài là : " + (Tong/dem) + "VND");
                    break;
                default:
                System.out.println(" moi nhap lai !");
            }
        }while (choose!=6);    
    }
    static void showmenu(){
        System.out.println("=================Menu=========================");
        System.out.println("1.nhap n so khach hàng  : ");
        System.out.println("2. nhap m so khách nước ngoài   : ");
        System.out.println("3. Hiện thị danh sách : ");
        System.out.println("4. Tổng Lượng điện tiêu thụ của từng loại khách hàng là :  ");
        System.out.println("5.Tiền trung bình của khách hàng nước ngoài : ");
        System.out.println("6. Thoat !");
         System.out.println("=============================================");
    }
    public static void MenuCon()
    {
        System.out.println("Lựa chọn loại khách hàng: ");
        System.out.println("1. Khách hàng nội địa.");
        System.out.println("2. Khách hàng nước ngoài.");
        System.out.println("==========================================");
    }
}
/*System.out.println("======================================");
                    for(int i=0;i<List.size();i++){
                        System.out.println("===========================");
                        List.get(i).display();
                    }
                    System.out.println("========================================");
*/