/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.Bai4;

/**
 *
 * @author KyThuat88
 */
public class ThreadUtils implements Runnable{

    static int arr[] = new int[1000];
    private int fromIndex;
    private int toIndex;
    private long total;
    
    
    public ThreadUtils(int fromIndex,int toIndex, int[] aaa){
        this.fromIndex=fromIndex;
        this.toIndex=toIndex;
        this.arr = aaa;
        this.total = 0L;
    }

    
    public long getSum() {
        return total;
    }
    
    
    
    @Override
    public void run() {
       //To change body of generated methods, choose Tools | Templates.
       for(int i = fromIndex; i<=toIndex;i++){
           total += arr[i];
       }
            
    }
    
}
