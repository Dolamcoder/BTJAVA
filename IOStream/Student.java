/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

/**
 *
 * @author Admin
 */
public class Student {
    private String name, id, address;

    public Student(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", address=" + address + '}';
    }
    
}
