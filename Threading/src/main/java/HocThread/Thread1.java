/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocThread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Thread1 extends Thread{
     ShareData data;
    public Thread1(ShareData data){
        this.data=data;
    }

    @Override
    public void run() {
        Random rd=new Random();
        for(int i=0;i<100;i++){
            synchronized(data){
            data.rad=rd.nextInt(100);
            System.out.println("T1 > "+data.rad);
            data.notify();
            try {
                data.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }   
    }
    
}
