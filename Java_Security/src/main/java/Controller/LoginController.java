package Controller;

import Dao.loginDao;
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

public class LoginController {

    @FXML
    private Button dangKyButton;
    public void dangKy(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/register.fxml")); // chỉnh path nếu cần
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
    @FXML
    private Label errorLabel;

    @FXML
    private Button forgotPassButton;

    @FXML
    private Button loginButton;
    public void login(){
        String user=this.userNameText.getText();
        String pass=this.passText.getText();
        if(user.isEmpty() || pass.isEmpty()){
            this.errorLabel.setText("Không được để username hoặc mật khẩu trống");
            return;
        }
        maHoaMatKhau maHoa=new maHoaMatKhau();
        pass=maHoa.hashPassword(pass);
        loginDao dao=new loginDao();
        if(dao.dangNhap(user, pass)){
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/LogOut.fxml")); // chỉnh path nếu cần
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
        else {
            this.errorLabel.setText("Sai tài khoản hoặc sai mật khâủ");
        }
    }
    @FXML
    private PasswordField passText;

    @FXML
    private TextField userNameText;
}
