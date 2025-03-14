/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IOStrean5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nameFolder=sc.nextLine();
        sc.close();
        File folder=new File(nameFolder);
        if(folder.exists() && folder.isDirectory()){
            File[] listFile=folder.listFiles();
            if(listFile!=null && listFile.length>0){
            for(File file : listFile){
                    System.out.println(file);
            }
            }else {
                System.out.println("File trong");
            }
        }
        else {
            System.out.println("not folder or not find folder");
        }
        
    }
}
