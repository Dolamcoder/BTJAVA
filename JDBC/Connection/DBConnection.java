package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private  static  final String DB_URL="jdbc:sqlserver://DESKTOP-S33MT4O:1433;databaseName=quanlidonhang;encrypt=true;trustServerCertificate=true;";
    private static  final  String DB_USER = "sa";
    private  static  final String DB_PASSWORD = "123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DBConnection.DB_URL, DBConnection.DB_USER, DBConnection.DB_PASSWORD);
    }
}
