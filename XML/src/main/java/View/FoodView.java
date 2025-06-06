/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FoodController;
import Model.Food;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FoodView extends javax.swing.JFrame {
    FoodController ctl=new FoodController();
    ArrayList foodList;
    DefaultTableModel model;
    String[] colum={"ID", "Name", " Price", "description", "calories"};
    JTable table;
    public FoodView() {
        initComponents();
        foodList=ctl.listFood();
        model=this.getTable();
        table=new JTable(model);
        this.jScrollTable.setViewportView(table);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addFood = new javax.swing.JButton();
        removeFood = new javax.swing.JButton();
        updateFood = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollTable = new javax.swing.JScrollPane();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(refresh)
                .addGap(0, 628, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(refresh)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        addFood.setText("ADD");
        addFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodActionPerformed(evt);
            }
        });

        removeFood.setText("REMOVE");
        removeFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFoodActionPerformed(evt);
            }
        });

        updateFood.setText("UPDATE");
        updateFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(addFood)
                .addGap(37, 37, 37)
                .addComponent(removeFood)
                .addGap(39, 39, 39)
                .addComponent(updateFood)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFood)
                    .addComponent(removeFood)
                    .addComponent(updateFood))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 330, 700, 70);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 30, 700, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public DefaultTableModel getTable(){
        DefaultTableModel model=new DefaultTableModel(colum, 0);
        for (Object obj : foodList) {
        Food food = (Food) obj;
        Object[] rowData = {
            food.getId(),
            food.getName(),
            food.getPrice(),
            food.getDescription(),
            food.getCalories()
        };
        model.addRow(rowData);
    }
        return model;
    }
    private void addFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodActionPerformed
       ctl.addFood();
    }//GEN-LAST:event_addFoodActionPerformed

    private void removeFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFoodActionPerformed
        int selectedRow =table.getSelectedRow(); // Lấy hàng được chọn
        if (selectedRow != -1) { // Kiểm tra có chọn hàng chưa
        String foodId = table.getValueAt(selectedRow, 0).toString(); // Lấy giá trị cột 0 (ID)
        if(foodId!=null){
            ctl.remove(foodId);
        }
    }//GEN-LAST:event_removeFoodActionPerformed
    else{
            JOptionPane.showMessageDialog(null, "Vui lòng chọn món ăn cần xoá");
        }
    }
    private void updateFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateFoodActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        this.foodList=this.ctl.listFood();
        model.setRowCount(0); //xoá bảng củ
        this.setModel(this.getTable());
        this.table.setModel(model);
    }//GEN-LAST:event_refreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FoodView foodView=new FoodView();
                foodView.setSize(700, 430);
                foodView.setLocationRelativeTo(null);
                foodView.setVisible(true);
            }
        });
    }

    public ArrayList getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList foodList) {
        this.foodList = foodList;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    public JTable getJTable(){
        return this.table;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFood;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollTable;
    private javax.swing.JButton refresh;
    private javax.swing.JButton removeFood;
    private javax.swing.JButton updateFood;
    // End of variables declaration//GEN-END:variables
}
