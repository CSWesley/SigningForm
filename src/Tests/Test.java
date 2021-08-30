package Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {

        try {

            // localhost = 127.0.0.1
            // port = 3306
            Connection connection = DriverManager.getConnection("jdbc://localhost:3306/")

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
