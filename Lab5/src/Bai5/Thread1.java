/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author Nam
 */
public class Thread1 extends Thread{
    /*Number number;
    public Thread1(Number number) {
    this.number = number;
    }
    @Override
    public void run() {
        for (int i= 0; i < 1000; i++) {
             number.inSo();
             try {
             Thread.sleep(1000);
             } catch (Exception e) {
             }
     }
   }*/
    Number number;
    public  Thread1(Number number){
        this.number = number;
    }
    @Override
    public void run(){
        for(int i=0 ;i<1000 ;i++){
            number.inSo();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
