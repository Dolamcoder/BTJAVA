/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Admin
 */
public class ThreadReadFile extends Thread{
    private String fileName;
    private ShareData6 input;
    public ThreadReadFile(String filename, ShareData6 input) {
       this.input=input;
       this.fileName=filename;
    }
    @Override
    public void run() {
        try {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String data;
        while ((data = br.readLine()) != null) {
            synchronized (input) {
                input.ghiFile(data);
            }
        }
        br.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
}
