/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.Dao;
import Model.Order;
import Model.Product;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class controller {
    Dao dao=new Dao();
    ArrayList<Order> orderList=new ArrayList();
    ArrayList<String> listID=new ArrayList();
    ArrayList<Product> litsProduct=new ArrayList();
    public void inDonHang(){
       listID=dao.layIDKhachHang(2);
       orderList=dao.layDonHang(listID);
       if(orderList==null){
           System.out.println("Không thấy đơn hàng nào thoả mãn");
           return;
       }
       for(Order x : orderList){
           System.out.println(x);
       }
    }
    public void  laySanPham(){
        for(Order x : orderList){
            litsProduct.add(dao.layTenSanPhamDaDat(x.getProductID()));
        }
    }
    public void inSanPham(){
        if(litsProduct==null){
            System.out.println("Không có sãn phẩm nào");
            return;
        }
        for(Product p: litsProduct){
            System.out.println(p);
            System.out.println("helo");
        }
    }
}
