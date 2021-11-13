/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nam
 */
public class Danhsachsinhvien {
    private ArrayList<sinhvien> dssv = new ArrayList<>();
    public boolean ktTrungma(String masv){
        for (sinhvien sv : dssv) {
            if(sv.getMasv().equalsIgnoreCase(masv)){
                return true;
            } 
        }
        return false;
    }
    public boolean addSinhVien(sinhvien sv){
        if(ktTrungma(sv.getMasv())){
            return false;
        }
       return dssv.add(sv);
    }
    public sinhvien findSinhVien1(String masv){
        for (sinhvien sv : dssv) {
            if(sv.getMasv().equalsIgnoreCase(masv)){
                return sv;
            }
        }
        return null;
    }
    public int findSinhvien2(String masv)
        {
        for(int i=0;i<dssv.size();i++)
        {
        if(dssv.get(i).getMasv().equalsIgnoreCase(masv))
        return i;
        }
        return -1;
        }
    public sinhvien updateSinhvien(int index,sinhvien sv)
        {
        return dssv.set(index, sv);
        }
    public void removeSinhvien(String masv)
        {
        sinhvien sv=findSinhVien1(masv);
        dssv.remove(sv);
        }
    public String toString() {
        return dssv.toString();
        }
    public void sort(){
        Collections.sort(dssv);
    }
}
