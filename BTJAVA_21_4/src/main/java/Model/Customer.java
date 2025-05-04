/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Customer {
    private String customerID, name;
    private int tier;
    public Customer(String customerID, String name, int tier) {
        this.customerID = customerID;
        this.name = name;
        this.tier = tier;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public int  getTier() {
        return tier;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(int  tier) {
        this.tier = tier;
    }
   
}
