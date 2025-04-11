/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocThread;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ShareData data=new ShareData();
        CustomThread thread1=new CustomThread(data);
        thread1.start();
        CustomThread thread2=new CustomThread(data);
        thread2.start();
        CustomThread thread3=new CustomThread(data);
        thread3.start();
        CustomThread thread4=new CustomThread(data);
        thread4.start();
        CustomThread thread5=new CustomThread(data);
        thread5.start();
        CustomThread thread6=new CustomThread(data);
        thread6.start();
        CustomThread thread7=new CustomThread(data);
        thread7.start();
        
    }
}
