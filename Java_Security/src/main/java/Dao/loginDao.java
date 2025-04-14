package Dao;

import Util.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDao {
    Connection con;

    public loginDao() {
        con = JDBC.getConnection();
    }

    public boolean dangNhap(String user, String pass) {
        String query = "SELECT username FROM account WHERE username=? AND password=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, user);
            pstm.setString(2, pass);
            ResultSet rs = pstm.executeQuery();
            return rs.next(); // Có bản ghi → đúng tài khoản
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
