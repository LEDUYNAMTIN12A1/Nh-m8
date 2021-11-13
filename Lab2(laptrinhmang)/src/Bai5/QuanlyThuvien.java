/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nam
 */
public class QuanlyThuvien {
    private ArrayList<Tailieu> taiLieus;
    private Scanner reader;
    public QuanlyThuvien() {
    taiLieus = new ArrayList<>();
    reader = new Scanner(System.in);
    }
    public Sach taoMoiSach(){
        Sach s = new Sach();
        System.out.println("Mã tài liệu: ");
        s.setMaTaiLieu(reader.nextLine());
        System.out.println("Tên nhà xuất bản: ");
        s.setTenNhaXuatban(reader.nextLine());
        System.out.println("Số bản phát hành: ");
        s.setSobanphathanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Tên tác giả: ");
        s.setTenTacGia(reader.nextLine());
        System.out.println("Tên sách: ");
        s.setTenSach(reader.nextLine());
        System.out.println("Số trang: ");
        s.setSoTrang(Integer.parseInt(reader.nextLine()));
    return s;
      }
    public Tapchi taoMoiTapChi(){
        Tapchi tapChi = new Tapchi();
        System.out.println("Mã tài liệu: ");
        tapChi.setMaTaiLieu(reader.nextLine());
        System.out.println("Tên nhà xuất bản: ");
        tapChi.setTenNhaXuatban(reader.nextLine());
        System.out.println("Số bản phát hành: ");
        tapChi.setSobanphathanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Số phát hành: ");
        tapChi.setSoPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Tháng phát hành: ");
        tapChi.setThangPhatHanh(Integer.parseInt(reader.nextLine()));
        return tapChi;
    }
    public Bao taoMoiBao(){
       Bao bao = new Bao();
       System.out.println("Mã tài liệu: ");
       bao.setMaTaiLieu(reader.nextLine());
       System.out.println("Tên nhà xuất bản: ");
       bao.setTenNhaXuatban(reader.nextLine());
       System.out.println("Số bản phát hành: ");
       bao.setSobanphathanh(Integer.parseInt(reader.nextLine()));
       System.out.println("Ngày phát hành: ");
       bao.setNgayPhatHanh(convertStringToDate(reader.nextLine()));
       return bao;
    }
    private Date convertStringToDate(String ddMMyyyy) {
    try {
        return new SimpleDateFormat("dd/MM/yyyy").parse(ddMMyyyy);
     } catch (ParseException ex) {
         Logger.getLogger(QuanlyThuvien.class.getName()).log(Level.SEVERE, null, ex);
     }
     return null;
     }
    public void nhapDanhSachTaiLieu(){
        System.out.println("Nhập 1 - Tạo mới sách");
        System.out.println("Nhập 2 - Tạo mới tạp chí");
        System.out.println("Nhập 3 - Tạo mới báo");
        System.out.println("Nhập 4 - Kết thúc");
        int selectedValue;
        do {
            System.out.println("Bạn chọn: ");
            selectedValue = Integer.parseInt(reader.nextLine());
            switch(selectedValue){
            case 1:
                taiLieus.add(taoMoiSach());
                break;
            case 2:
                taiLieus.add(taoMoiTapChi());
                break;
            case 3:
                taiLieus.add(taoMoiBao());
                break;
                }
        } while (selectedValue!=4);
    }
    private void xuatThongTin(Tailieu taiLieu){
        System.out.println("Mã tài liệu: " + taiLieu.getMaTaiLieu());
        System.out.println("Tên nhà xuất bản: " + taiLieu.getTenNhaXuatban());
        System.out.println("Số bản phát hành:" + taiLieu.getSobanphathanh());
        if (taiLieu instanceof Sach) {
            Sach sach = (Sach) taiLieu;
            System.out.println("Tên tác giả: " + sach.getTenTacGia());
            System.out.println("Tên sách: " + sach.getTenSach());
            System.out.println("Số trang: " + sach.getSoTrang());
        }
        else{
           if (taiLieu instanceof Tapchi) {
           Tapchi tapChi = (Tapchi) taiLieu;
           System.out.println("Số phát hành: " + tapChi.getSoPhatHanh());
           System.out.println("Tháng phát hành:" + tapChi.getThangPhatHanh());
           }else{
                Bao bao = (Bao)taiLieu;
                System.out.println("Ngày phát hành"+ convertDateToString(bao.getNgayPhatHanh()));
                }
            }
        }
    private String convertDateToString(Date ngayPhatHanh) {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayPhatHanh);
    }
    public void xuatDanhSachTaiLieu(){
        for (Tailieu taiLieu : taiLieus) {
        xuatThongTin(taiLieu);
        }
    }
    public void timTheoLoai(String loai){
        if (loai.equalsIgnoreCase("Sach")) {
            for (Tailieu taiLieu : taiLieus) {
                if (taiLieu instanceof Sach) {
                    xuatThongTin(taiLieu);
                 }
            }
        } else {
            if (loai.equalsIgnoreCase("Tap Chi")) {
                for (Tailieu taiLieu : taiLieus) {
                    if (taiLieu instanceof Tapchi) {
                        xuatThongTin(taiLieu);
                    }
                }
            } else {
                for (Tailieu taiLieu : taiLieus) {
                    if (taiLieu instanceof Bao) {
                        xuatThongTin(taiLieu);
                        }
                    }
                }
            }
    }
    public void timGanDungTheoTenSach(String str){
        for (Tailieu taiLieu : taiLieus) {
            if (taiLieu instanceof Sach) {
                Sach sach = (Sach) taiLieu;
                if (sach.getTenSach().indexOf(str)!=-1) {
                    xuatThongTin(taiLieu);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuanlyThuvien QuanLyTV = new QuanlyThuvien();
        QuanLyTV.nhapDanhSachTaiLieu();
        QuanLyTV.xuatDanhSachTaiLieu();
        System.out.println("Nhập loại bạn muốn tìm: ");
        QuanLyTV.timTheoLoai(input.nextLine());
    }
}
