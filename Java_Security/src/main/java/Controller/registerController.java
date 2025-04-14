package Controller;

import Dao.registerDao;
import Model.maHoaMatKhau;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class registerController {

    @FXML
    private Button dangKy;
    public void dangKy(){
        if(emailText.getText().isEmpty() || userNameText.getText().isEmpty() || pass1Text.getText().isEmpty()|| pass2Text.getText().isEmpty()){
            errorLabel.setText("không được để dữ liệu trong");
            return;
        }
        String pass1=pass1Text.getText();
        String pass2=pass2Text.getText();
        if(!pass1.equals(pass2)){
            errorLabel.setText("mật khẩu không khớp");
            return;
        }
        maHoaMatKhau maHoa=new maHoaMatKhau();
        pass1=maHoa.hashPassword(pass1);
        registerDao dao=new registerDao();
       boolean check= dao.dangKyTaiKhoan(userNameText.getText(), pass1, emailText.getText());
        if(check){
            JOptionPane.showMessageDialog(null, "đăng ký thành công");
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml")); // chỉnh path nếu cần
                Parent root = loader.load();

                // Tạo scene mới
                Stage stage = new Stage();
                stage.setTitle("Trang Chính");
                stage.setScene(new Scene(root));
                stage.show();

                // Đóng cửa sổ đăng nhập
                Stage currentStage = (Stage) this.userNameText.getScene().getWindow();
                currentStage.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Đăng Ký khon thanh cong");
            return;
        }
    }
    @FXML
    private Label errorLabel;

    @FXML
    private TextField emailText;

    @FXML
    private PasswordField pass1Text;

    @FXML
    private PasswordField pass2Text;

    @FXML
    private TextField userNameText;

}
