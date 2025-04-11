 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocThread;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
         ShareData data=new ShareData();
         Thread1 thread1=new Thread1(data);
         Thread2 thread2=new Thread2(data);
         Thread3 thread3=new Thread3(data);
         thread1.start();
         thread2.start();
         thread3.start();
    }
}
