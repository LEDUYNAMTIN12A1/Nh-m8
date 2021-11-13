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
public class Car extends Engine{
    private int totalSeat;
    private double speed;

    public Car(int totalSeat, double speed) {
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public Car() {
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Tổng số ghế : ");
        this.totalSeat = sc.nextInt();
        System.out.println("Tốc độ : ");
        this.speed = sc.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tổng số ghế : " + this.totalSeat);
        System.out.println("Tốc độ : " +this.speed  + "km/h");//To change body of generated methods, choose Tools | Templates.
    }
    
}
