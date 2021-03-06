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
public class Quanlyxemay {
    public static void Menu()
    {
        System.out.println("==========Menu==========");
        System.out.println("1. Nhập thông tin cho n xe máy ở Hoà Bình.");
        System.out.println("2. Nhập thông tin cho n xe máy ở Hà Nội.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Thống kê số lượng xe đang quản lý.");
        System.out.println("6. Thoát.");
    }
    
    public static void MenuCon()
    {
        System.out.println("Lựa chọn tỉnh thực hiện: ");
        System.out.println("1. Xe ở Hoà Bình.");
        System.out.println("2. Xe ở Hà Nội.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        Xemayhoabinh1 xehb = null;
        xemayhanoi xehn = null;
        int chon;
        do
        {
            Menu();
            System.out.println("Nhập vào lựa chọn của bạn: ");
            chon=nhap.nextInt();
            switch(chon)
            {
                case 1:
                    xehb = new Xemayhoabinh1();
                    xehb.nhap();
                    System.out.println();
                break;
                case 2: 
                    xehn = new xemayhanoi();
                    xehn.nhap();
                    System.out.println();
                break;
                case 3:
                    int chon3;
                    MenuCon();
                    chon3=nhap.nextInt();
                    switch(chon3)
                    {
                        case 1: 
                            if(xehb==null)
                                System.out.println("Chưa nhập dữ liệu cho xe ở Hoà Bình");
                            else
                            {
                                for(int i=0;i<xehb.getN()-1;i++)
                                {
                                    for(int j=i+1;j<xehb.getN();j++)
                                    {
                                        if(xehb.xe[i].getBienso().compareTo(xehb.xe[j].getBienso())>0)
                                        {
                                            Xemay temp = xehb.xe[i];
                                            xehb.xe[i] = xehb.xe[j];
                                            xehb.xe[j] = temp;
                                        }
                                    }
                                }
                                System.out.println("Danh sách xe máy ở Hoà Bình sắp xếp tăng dần theo biển số.");
                                xehb.hienthi();
                            }
                        break;
                        case 2:
                            if(xehn==null)
                                System.out.println("Chưa nhập dữ liệu cho xe ở Hà Nội");
                            else
                            {
                                for(int i=0;i<xehn.getN()-1;i++)
                                {
                                    for(int j=i+1;j<xehn.getN();j++)
                                    {
                                        if(xehn.xe[i].getBienso().compareTo(xehn.xe[j].getBienso())>0)
                                        {
                                            Xemay temp = xehn.xe[i];
                                            xehn.xe[i] = xehn.xe[j];
                                            xehn.xe[j] = temp;
                                        }
                                    }
                                }
                                System.out.println("Danh sách xe máy ở Hà Nội sắp xếp tăng dần theo biển số.");
                                xehn.hienthi();
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
                    chonc4=nhap.nextInt();
                    switch(chonc4)
                    {
                        case 1: 
                            if(xehb==null)
                                System.out.println("Chưa nhập dữ liệu cho xe ở Hoà Bình");
                            else
                            {
                                System.out.println("Nhập biển số xe cần tìm kiếm: ");
                                String bsx = nhap.next();
                                System.out.println("Xe máy cần tìm ở Hoà Bình:");
                                for(int i=0;i<xehb.getN();i++)
                                {
                                    if(xehb.xe[i].getBienso().equals(bsx));
                                    xehb.hienthi();
                                }
                            }
                        break;
                        case 2:
                            if(xehn==null)
                                System.out.println("Chưa nhập dữ liệu cho xe ở Hà Nội");
                            else
                            {
                                System.out.println("Nhập biển số xe cần tìm kiếm: ");
                                String bsx = nhap.next();
                                System.out.println("Xe máy cần tìm ở Hà Nội:");
                                for(int i=0;i<xehn.getN();i++)
                                {
                                    if(xehn.xe[i].getBienso().equals(bsx));
                                    xehn.hienthi();
                                }
                            }
                        break;
                        default:
                            System.out.println("Lựa chọn bạn vừa nhập không có trong Menu.");
                        break;
                    }
                break;
                case 5:
                    int chonc5;
                    MenuCon();
                    chonc5=nhap.nextInt();
                    switch(chonc5)
                    {
                        case 1: 
                            if(xehb==null)
                                System.out.println("Chưa nhập dữ liệu cho xe ở Hoà Bình");
                            else
                                System.out.println("Số lượng xe máy ở Hoà Bình là: "+(xehb.xe.length));
                        break;
                        case 2:
                            if(xehn==null)
                                System.out.println("Chưa nhập dữ liệu cho xe ở Hà Nội");
                            else
                                System.out.println("Số lượng xe máy ở Hà Nội là: "+(xehn.xe.length));
                        break;
                        default:
                            System.out.println("Lựa chọn bạn vừa nhập không có trong Menu.");
                        break;
                    }
                break;
            }
        }while(chon!=6);
    }
    
}
