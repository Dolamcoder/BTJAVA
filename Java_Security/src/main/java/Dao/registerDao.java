package Dao;

import Util.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerDao {
    Connection con;
    public registerDao(){
        con=JDBC.getConnection();
    }
    public boolean dangKyTaiKhoan(String user, String pass, String email){
        String query = "INSERT INTO account (username, password, email) VALUES (?, ?, ?)";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1, user);
            pstm.setString(2, pass);
            pstm.setString(3, email);
            int ans=pstm.executeUpdate();
            con.close();
            if(ans> 0) return true;
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return false;
    }

}
