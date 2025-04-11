package Test;

import Controller.OrderController;
import Model.OrderModel;
import View.OrderManagementUI;

import javax.swing.*;

public class OrderManagementApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OrderManagementUI view = new OrderManagementUI();
            OrderModel model = new OrderModel();
            OrderController controller = new OrderController(view, model);
        });
    }
}
