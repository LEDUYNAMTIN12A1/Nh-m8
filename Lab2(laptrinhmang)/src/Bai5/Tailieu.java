/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author Nam
 */
public class Tailieu {
    private String maTaiLieu;
    private String tenNhaXuatban;
    private int Sobanphathanh;

    public Tailieu(String maTaiLieu, String tenNhaXuatban, int Sobanphathanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatban = tenNhaXuatban;
        this.Sobanphathanh = Sobanphathanh;
    }

    public Tailieu() {
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatban() {
        return tenNhaXuatban;
    }

    public void setTenNhaXuatban(String tenNhaXuatban) {
        this.tenNhaXuatban = tenNhaXuatban;
    }

    public int getSobanphathanh() {
        return Sobanphathanh;
    }

    public void setSobanphathanh(int Sobanphathanh) {
        this.Sobanphathanh = Sobanphathanh;
    }
    
}
