package Model;

import java.sql.*;
import java.util.logging.*;
import Connection.DBConnection;
 public class OrderModel {
 private static final Logger LOGGER = Logger.getLogger(OrderModel.class.getName());

     public String addOrder(int customerId, double totalPrice) {
         String result = "🛒 Đơn hàng mới đã được thêm thành công!";
         try (Connection conn = DBConnection.getConnection()) {
             String sql = "INSERT INTO Orders (customer_id, total_price) VALUES (?, ?)";
             PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setInt(1, customerId);
             stmt.setDouble(2, totalPrice);
             int rowsAffected = stmt.executeUpdate();
             if (rowsAffected == 0) {
                 result = "⚠ Không thể thêm đơn hàng!";
             }
         } catch (SQLException ex) {
             LOGGER.severe("Lỗi thêm đơn hàng: " + ex.getMessage());
             result = "⚠ Lỗi khi thêm đơn hàng vào database!";
         }
         return result;
     }

 public String viewOrderHistory() {
     StringBuilder sb = new StringBuilder();
     try (Connection conn = DBConnection.getConnection()) {
         String sql = "SELECT * FROM Orders";
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery();
         sb.append("Lịch sử đơn hàng:\n====================\n");
         while (rs.next()) {
             sb.append("🛒 Đơn hàng ID: ").append(rs.getInt("id"))
                     .append(" | Khách hàng ID: ").append(rs.getInt("customer_id"))
                     .append(" | Tổng tiền: ").append(rs.getDouble("total_price"))
                     .append("đ\n--------------------\n");
         }
     } catch (SQLException ex) {
         LOGGER.severe("Lỗi truy xuất đơn hàng: " + ex.getMessage());
         return "⚠ Lỗi truy xuất đơn hàng!";
     }
     return sb.toString();
 }

 public String calculateTotalOrderAmount() {
     try (Connection conn = DBConnection.getConnection()) {
         String sql = "SELECT SUM(total_price) AS total FROM Orders";
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery();
         if (rs.next()) {
             double total = rs.getDouble("total");
             return "💰 Tổng tiền của tất cả đơn hàng: " + total + "đ";
         }
     } catch (SQLException ex) {
         LOGGER.severe("Lỗi tính tổng tiền: " + ex.getMessage());
         return "⚠ Lỗi tính tổng tiền!";
     }
     return "Không có dữ liệu.";
 }
}
