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
public class Thread2 extends Thread{
    ShareData data;
    public Thread2(ShareData data){
        this.data=data;
    }

    @Override
    public void run() {
        int result=0;
        for(int i=0;i<100;i++){
            synchronized(data){
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                result=data.rad*data.rad;
                System.out.println("T2 > "+ result);
                data.notify();
            }
        }
    }
    
}
