package Controller;

import Model.OrderModel;
import View.OrderManagementUI;
import Connection.DBConnection;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderController {
    private OrderManagementUI view;
    private OrderModel model;

    public OrderController(OrderManagementUI view, OrderModel model) {
        this.view = view;
        this.model = model;

        this.view.getBtnAddOrder().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int customerId = Integer.parseInt(JOptionPane.showInputDialog("Nhập ID khách hàng:"));
                    double totalPrice = Double.parseDouble(JOptionPane.showInputDialog("Nhập tổng tiền đơn hàng:"));
                    String result = model.addOrder(customerId, totalPrice);
                    view.getTextArea().setText(result);
                } catch (NumberFormatException ex) {
                    view.getTextArea().setText("⚠ Dữ liệu nhập không hợp lệ!");
                }
            }
        });

        this.view.getBtnViewHistory().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String history = model.viewOrderHistory();
                view.getTextArea().setText(history);
            }
        });

        this.view.getBtnCalculateTotal().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String total = model.calculateTotalOrderAmount();
                view.getTextArea().setText(total);
            }
        });
    }
}
