package backend;

import java.sql.*;

/**
 *
 * @author Reza R
 */
public class DBHelper1841720078Reza {

    private static Connection sKoneksi;

    public static void bukaKoneksiReza() {
        if (sKoneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                sKoneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error koneksi!");
            }
        }
    }

    public static int insertQueryGetIdReza(String query) {
        bukaKoneksiReza();
        int num = 0;
        int result = -1;

        try {
            Statement stmt = sKoneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQueryReza(String query) {
        bukaKoneksiReza();
        boolean result = false;

        try {
            Statement stmt = sKoneksi.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQueryReza(String query) {
        bukaKoneksiReza();
        ResultSet rs = null;
        try {
            Statement stmt = sKoneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
