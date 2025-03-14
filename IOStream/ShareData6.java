/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class ShareData6 {
    private BufferedWriter bw;

    public ShareData6() {
        try {
            this.bw = new BufferedWriter(new FileWriter("output6.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void ghiFile(String data) {
        try {
            bw.write(data);
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (bw != null) {
                bw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
