/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocThread;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class CustomThread extends Thread{
    ShareData data;
    public CustomThread(ShareData data){
        this.data=data;
    }

    @Override
    public void run() {
        Random rd=new Random();
        int x=rd.nextInt(10);
        for(int i=1;i<10;i++){
            data.add(x);
        }
    }
    
}
