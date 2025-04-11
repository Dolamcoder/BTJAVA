package View;
import javax.swing.*;
import java.awt.*;
 public class OrderManagementUI extends JFrame {
    private JButton btnAddOrder, btnViewHistory, btnCalculateTotal;
    private JTextArea textArea;

    public OrderManagementUI() {
        setTitle("Ứng dụng Quản lý Đơn hàng");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        btnAddOrder = new JButton("🛒 Thêm đơn hàng");
        btnViewHistory = new JButton("📜 Xem lịch sử đơn hàng");
        btnCalculateTotal = new JButton("💰 Tính tổng tiền");
        panel.add(btnAddOrder);
        panel.add(btnViewHistory);
        panel.add(btnCalculateTotal);
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBorder(BorderFactory.createTitledBorder("Thông tin"));

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setVisible(true);
    }

    public JButton getBtnAddOrder() { return btnAddOrder; }
    public JButton getBtnViewHistory() { return btnViewHistory; }
    public JButton getBtnCalculateTotal() { return btnCalculateTotal; }
    public JTextArea getTextArea() { return textArea; }
}