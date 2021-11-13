/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Nam
 */
public class CommissionWorker extends Employee{
    float luong;
    @Override
    public float earnings() {
        //Lương của CommissionWorker là 4500 + 0.5*sosanpham 
        return luong = new Boss().earnings() + new PieceWorked().earnings();

    }
    @Override
    public void hienthi() {
    System.out.println("luong :"+luong);
    }
}
