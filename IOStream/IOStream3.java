/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Admin
 */
public class IOStream3 {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("input1.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            int count=0;
            while((line=br.readLine())!=null){
                count++;
            }
            System.out.println("So dong trong file input1.txt la "+ count);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
