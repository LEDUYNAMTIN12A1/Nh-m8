/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Mobile extends Engine{
      
    private String country;

    public Mobile() {
    }

    public Mobile(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Đất nước : ");
        this.country = sc.nextLine();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Đất nước : " + this.country);
    }
    

    
}
