/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nam
 */
public class myObject {
    boolean flag = false;
    DateFormat df;
    int second;

    /**
     *
     */
    public synchronized void thoiGian() {
        while (flag) {
            try {
                wait();
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
        df = new SimpleDateFormat("HH:mm:ss");
        String format = df.format(new Date());
        System.out.println(format);
        second = Calendar.getInstance().get(Calendar.SECOND);
        flag = true;
        notifyAll();
    }
    public synchronized void kiemtra() {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    if(second%2==0 ){
        System.out.println("The "+ second +" is Chẵn");
    }
    else{
        System.out.println("The "+ second +" is Lẻ");
        flag = false;
        notifyAll();
    }
    }

     
}
