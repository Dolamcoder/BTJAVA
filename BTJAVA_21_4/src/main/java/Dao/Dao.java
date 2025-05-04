package Dao;

import Model.Customer;
import Model.Order;
import Model.Product;
import Util.JDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Dao {
    Connection con;

    public Dao() {
        con = JDBC.getConnection();
    }
    public ArrayList<String> layIDKhachHang(int tier) {
        ArrayList<String> list = new ArrayList<>();
        String query = "SELECT * FROM customer WHERE tier=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, tier);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString("customerID");
                list.add(id); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list; 
    }

    // Phương thức lấy đơn hàng (tạm thời trả về null)
   public ArrayList<Order> layDonHang(ArrayList<String> idKH) {
    ArrayList<Order> list = new ArrayList<>(); // Đặt ngoài vòng for để lưu tất cả đơn hàng
    String query = "SELECT * FROM customerorder WHERE CustomerID = ? AND orderDate BETWEEN ? AND ?";
    try {
        PreparedStatement pstm = con.prepareStatement(query);
        for (String x : idKH) {
            pstm.setString(1, x);
            pstm.setDate(2, java.sql.Date.valueOf("2025-02-01"));
            pstm.setDate(3, java.sql.Date.valueOf("2025-04-01"));
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("orderId");
                String productID = rs.getString("customerId");
                LocalDate orderDate = rs.getDate("orderDate").toLocalDate();
                
                // Kiểm tra nếu deliveryDate có thể null
                Date deliverySqlDate = rs.getDate("deliveryDate");
                LocalDate deliveryDate = (deliverySqlDate != null) ? deliverySqlDate.toLocalDate() : null;

                String status = rs.getString("status");
                Order order = new Order(productID, x,orderId, orderDate, deliveryDate, status);
                list.add(order);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}

    public Product layTenSanPhamDaDat(String id) {
    String query = "SELECT * FROM product WHERE productID = ?";
    try {
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setString(1, id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            String productID = rs.getString("productID");
            String name = rs.getString("name");
            String category = rs.getString("category");
            double price = rs.getDouble("price");

            return new Product(productID, name, category, price);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null; // Không tìm thấy
}

}
