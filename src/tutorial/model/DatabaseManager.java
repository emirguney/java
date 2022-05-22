package tutorial.model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ME99735 on 30.07.2018 - 13:41
 * part of project: tutorialProject1
 */
public final class DatabaseManager {
    private static final String url = "jdbc:mysql://localhost:3306/tutorial";
    private static final String userName = "root";
    private static final String password = "e";
    private static Connection connection;

    public static final Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veritabanı nerde!", "HATA!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return connection;
    }
}
