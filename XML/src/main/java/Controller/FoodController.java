/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Food;
import View.FoodView;
import XML.XMLAddFood;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import XML.XMLReader;
import XML.XMLRemoveFood;

/**
 *
 * @author Admin
 */
public class FoodController {
    XMLAddFood add;
    XMLRemoveFood remover;
    public FoodController(){
        add=new XMLAddFood();
        remover=new XMLRemoveFood();
    }
    public ArrayList<Food> listFood(){
        return XMLReader.readFoodFromXML("food_list.xml");
    }
    public void addFood(){
        Food food=this.addData();
        if(food!=null){
        if(add.addFoodToXML("food_list.xml", food)){
            JOptionPane.showMessageDialog(null, "thêm món ăn thành công");
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Thêm món ăn không thành công");
        }
    }
    public Food addData() {
    try {
        String id = JOptionPane.showInputDialog(null, "Nhập ID:");
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để ID trống");
            return null;
        }

        String name = JOptionPane.showInputDialog(null, "Nhập tên món ăn:");
        if (name == null || name.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Không được để Tên món ăn trống");
            return null;
        }

        String priceStr = JOptionPane.showInputDialog(null, "Nhập giá:");
        if (priceStr == null || priceStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để giá món ăn trống");
            return null;
        }
        double price = Double.parseDouble(priceStr);

        String description = JOptionPane.showInputDialog(null, "Nhập mô tả:");
        if (description == null || description.trim().isEmpty()){
            description=" ";
        }

        String caloriesStr = JOptionPane.showInputDialog(null, "Nhập calories:");
        if (caloriesStr == null || caloriesStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để lượng calo trống");
            return null;
        }
        int calories = Integer.parseInt(caloriesStr);

        return new Food( name,id,  price, description, calories);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Giá hoặc Calories không hợp lệ. Vui lòng nhập số.");
        return null;
    }
}
    public void remove(String id){
      boolean ans=remover.removeFoodById("food_list.xml", id);
      if(ans){
          JOptionPane.showMessageDialog(null, "Xoá thành công");
      }
      else{
          JOptionPane.showMessageDialog(null, "Xoá không thành công");
      }
    }
}
