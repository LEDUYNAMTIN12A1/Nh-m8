/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class xemayhanoi extends Xemay{
    private int n;
    Xemay[] xe;
     ArrayList<xemayhanoi> List = new ArrayList<>();

    public xemayhanoi() {
    }

    public xemayhanoi(String bienso, String loaixe, String mauxe, float giatien,int n, Xemay[] xe) {
        super(bienso, loaixe, mauxe, giatien);
        this.n = n;
        this.xe = xe;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Xemay[] getXe() {
        return xe;
    }

    public void setXe(Xemay[] xe) {
        this.xe = xe;
    }
    
     @Override
    public void nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số lượng xe máy ở Hà Nội: ");
        n = nhap.nextInt();
        xe = new Xemay[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập vào thông tin xe máy ở Hà Nội thứ "+(i+1));
            xe[i]=new Xemay();
            xe[i].nhap();
        }
    }
    @Override
    public void hienthi()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Thông tin xe máy thứ "+(i+1));
            xe[i].hienthi();
        }
    }
}
