/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocThread;

/**
 *
 * @author Admin
 */
public class ShareData {
    private int x=10;
    int rad;
    public ShareData(){
        
    }
    public synchronized void add(int plus){
        x+=plus;
        System.out.println("day so "+x);
        for(int i=0;i<=x;i++){
            System.out.print(i+" ");
        }
        this.x=0;
        System.out.println("");
    }
}
