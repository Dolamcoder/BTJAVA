package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LogoutController {

    @FXML
    private Button closeButton;
    public void dangXuat(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml")); // chỉnh path nếu cần
            Parent root = loader.load();

            // Tạo scene mới
            Stage stage = new Stage();
            stage.setTitle("Trang Chính");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
