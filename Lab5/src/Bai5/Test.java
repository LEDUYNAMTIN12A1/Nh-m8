/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;



/**
 *
 * @author Nam
 */
public class Test {
    public static void main(String[] args) {
        Number num = new Number();
        //hàm khởi tạo với giá trị num
        Thread1 t1 = new Thread1(num);
        thread2 t2 = new thread2(num);     
        t1.start();
        t2.start();
    }
}
