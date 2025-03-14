package IOStream;

import javax.swing.*;
import java.io.File;

public class IOStream5_2 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Chọn thư mục");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        int returnValue = chooser.showOpenDialog(null);
        //mo hop thoai
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = chooser.getSelectedFile(); // Lấy thư mục đã chọn
            if (selectedFolder.exists() && selectedFolder.isDirectory()) {
                File[] files = selectedFolder.listFiles(File::isFile); // Lọc chỉ tệp, bỏ qua thư mục con

                if (files != null && files.length > 0) {
                    for (File file : files) {
                        System.out.println(file.getName());
                    }
                } else {
                    System.out.println("NULL");
                }
            } else {
                System.out.println("Thu muc k hop le");
            }
        } else {
            System.out.println("khong chon thu muc nao");
        }
    }
}
