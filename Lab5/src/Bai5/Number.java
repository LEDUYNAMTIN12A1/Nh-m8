/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author Nam
 */
public class Number {
    private  int num =1;
    private boolean flag = false;
    public synchronized void inSo(){
        while (flag) {            
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("So: " +num);
        flag = true;
        notifyAll();
    }
    public synchronized void kiemtra(){
        while (!flag) {            
            try {
                wait();
            } catch (Exception e) {
            }
            }
        if(lasonguyento()){
                System.out.println(num+ " la so nguyen to ");
        }
        else
        {
            System.out.println(num + "khong phai la so nguyen to");
            num++;
            flag = false;
            notifyAll();
        }
    }
    private boolean lasonguyento(){
            if(num == 1) return false;
            for(int i=2; i<num; i++){
                if(num % i == 0)
                    return false;
            }
    return true;
    }
}
