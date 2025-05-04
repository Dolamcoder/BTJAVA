/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Order {
    private int orderID;
    private String productID, customerID;
    private LocalDate orderDate, deliveryDate;
    private String status;
    public Order(String productID, String customerID, int orderID, LocalDate orderDate, LocalDate deliveryDate, String status) {
        this.productID=productID;
        this.customerID=customerID;
        this.orderID=orderID;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getProductID() {
        return productID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", productID=" + productID + ", customerID=" + customerID + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status + '}';
    }
   
}
