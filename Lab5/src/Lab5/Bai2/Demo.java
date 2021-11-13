/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.Bai2;

/**
 *
 * @author KyThuat88
 */
public class Demo implements Runnable{

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Thread con");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Demo dm = new Demo();
        Thread thread = new Thread(dm);
        thread.start();
        System.out.println("Thread cha");
    }
    
    
}
