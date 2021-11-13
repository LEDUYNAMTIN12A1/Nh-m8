/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author Nam
 */
public class Thread2 extends Thread{
    myObject obj;
    public Thread2(myObject obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        try {
           while (true) {
           obj.kiemtra();
           Thread.sleep(1000);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
