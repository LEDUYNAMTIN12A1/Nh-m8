package Bai4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nam
 */
public class Engine {
    private String engineId ;
    private String engineName;
    private String manufacturer;
    private int yearMaking;
    private double price;

    public Engine() {
    }

    public Engine(String engineId, String engineName, String manufacturer, int yearMaking, double price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacturer = manufacturer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void input(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sản phẩm : ");
        this.engineId = sc.nextLine();
        System.out.println("Tên máy : ");
        this.engineName= sc.nextLine();
        System.out.println("Hãng sản xuất : ");
        this.manufacturer = sc.nextLine();
        System.out.println("Năm sản xuất:");
        this.yearMaking = sc.nextInt();
        System.out.println("Gía bán : ");
        this.price= sc.nextDouble();
        
    }
    public void display(){
        System.out.println(" Mã máy : " + this.engineId);
        System.out.println(" Tên máy  : " + this.engineName);
        System.out.println("Nhà sản xuất  : " + this.manufacturer);
        System.out.println("Năm xuất bản  : " + this.yearMaking);
        System.out.println("Gía bán : " + this.price + "triệu VND");

    }
}
