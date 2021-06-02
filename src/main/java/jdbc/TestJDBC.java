package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("xx", "root", "290102");
        System.out.println("Hi git!");
        System.out.println("dev!");
    }
}
