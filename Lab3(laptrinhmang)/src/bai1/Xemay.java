/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Xemay implements Ixe{
    String bienso ;
    String loaixe ;
    String mauxe ;
    float giatien ;

    public Xemay() {
    }

    public Xemay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bien so : ");
        this.bienso = sc.nextLine();
        System.out.println("Nhap loai xe : ");
        this.loaixe =sc.nextLine();
        System.out.println("Nhap mau xe : ");
        this.mauxe = sc.nextLine();
        System.out.println("Nhap gia tien : ");
        this.giatien = sc.nextFloat();
    }

    @Override
    public void hienthi() {
        System.out.println("Bien so " + this.bienso);
        System.out.println("Loai xe" + this.loaixe);
        System.out.println("Mau xe " + this.mauxe);
        System.out.println("Gia tien : "+ this.giatien);//To change body of generated methods, choose Tools | Templates.
    }
    
}
