/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LAB 1
 */
public class koneksi1 {
        private static Connection con;
    public static Connection getcon() {
    if (con == null) {
            try {
                String url = "jdbc:mysql//localhost/data_puskesmas";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
}
       return con;       

    }
}

