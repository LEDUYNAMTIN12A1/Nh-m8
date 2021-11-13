/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.Bai3;

/**
 *
 * @author KyThuat88
 */
public class Square implements Runnable, Listener{

    Thread t;
    int number;
    boolean flag = false;
    
    @Override
    public void run() {
         //To change body of generated methods, choose Tools | Templates.
        try {
            while(true) {
                if(this.flag) {
                    System.out.println("Square: " + number * number);
                    this.flag = false;
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void start(){
        if(t == null) {
            t = new Thread(this, "Square");
            t.start();
        }
    }

    @Override
    public void addNumber(int number) {
        //To change body of generated methods, choose Tools | Templates.
        this.number = number;
        this.flag = true;
    }
    
}
