/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class IOStream6 {
    public static void main(String[] args){
          ShareData6 input=new ShareData6();
          ThreadReadFile thread1=new ThreadReadFile("input1.txt", input);
          ThreadReadFile thread2=new ThreadReadFile("output2.txt", input);
          ThreadReadFile thread3=new ThreadReadFile("lythuyet.txt", input);
          ThreadReadFile thread4=new ThreadReadFile("helloVKU.txt", input);
          thread1.start();
          thread2.start();
          thread3.start();
          thread4.start();
           try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          input.close();
    }
    
}
