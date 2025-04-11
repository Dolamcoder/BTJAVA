/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Thread3 extends Thread {
    ShareData data;
    public Thread3(ShareData data){
        this.data=data;
    }

    @Override
    public void run() {
        int result;
       for(int i=0;i<100;i++){
           synchronized(data){
               try {
                   data.wait();
               } catch (InterruptedException ex) {
                   Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
               }
               if(check(data.rad)){
                   System.out.println("T3 > "+data.rad+" is Even");
               }
               else System.out.println("T3 > "+ data.rad+" is Odd");
               data.notify();
           }
       }
    }
    public boolean check(int x){
        if(x%2==0) return true;
        return false;
    }
}
