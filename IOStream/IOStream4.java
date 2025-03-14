/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IOStream4 {
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    
    public IOStream4(){
    }
    public void ghiFile(){
        try{
            DataOutputStream ghi=new DataOutputStream(new FileOutputStream("songuyen.bin"));
            System.out.println("nhap n so nguyen");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int number=rd.nextInt(100);
                ghi.writeInt(number);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void docFile(){
        try{
            DataInputStream doc=new DataInputStream(new FileInputStream("songuyen.bin"));
            while(doc.available()>0){
                int number=doc.readInt();
                System.out.println(number);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

