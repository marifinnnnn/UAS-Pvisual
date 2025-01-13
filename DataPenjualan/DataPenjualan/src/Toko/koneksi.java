package Toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/penjualan"; // Tambahkan timezone
                String user = "root"; // Ganti dengan user yang sesuai
                String password = ""; // Ganti dengan password yang sesuai

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                System.err.println("Koneksi Gagal: " + e.getMessage()); // Pesan error lebih detail
            }
        }
        return koneksi;
    }

    public static void main(String[] args) {
        getKoneksi();
    }
}