/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author Nam
 */
public class Thread1 extends Thread{
    myObject obj;
    public Thread1(myObject obj) {
       this.obj = obj;
    }

    /*@Override
    public void run() {
        myObject obj = new myObject();
        try {
        while (true) {
            obj.th
            Thread.sleep(1000);
           }
        } catch (Exception e) {
          e.printStackTrace();
         }
    }*/
    @Override
    public void run(){
        myObject obj = new myObject();
        try {
        while (true) {
            obj.thoiGian();
            Thread.sleep(1000);
           }
        } catch (Exception e) {
          e.printStackTrace();
         }
    }
}
