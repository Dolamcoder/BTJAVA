/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IOStream2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap ten: ");
            String name = br.readLine();
            System.out.println("Nhap ID:");
            String id = br.readLine();
            System.out.println("Nhap dia chi:");
            String address = br.readLine();
            Student s = new Student(name, id, address);
            System.out.println("Nhap dong ghi chu");
            String data=br.readLine();
          try{
            FileWriter fw=new FileWriter("output2.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(s.toString());
            bw.newLine();
            bw.write(data);
            bw.close();
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
