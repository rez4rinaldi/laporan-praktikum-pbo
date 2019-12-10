package unittest.database;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Reza R
 */
public class Kategori1841720078Reza {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720078Reza() {
    }

    public Kategori1841720078Reza(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getIdkategoriReza() {
        return mIdkategori;
    }

    public void setIdkategoriReza(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getNamaReza() {
        return mNama;
    }

    public void setNamaReza(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganReza() {
        return mKeterangan;
    }

    public void setKeteranganReza(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720078Reza getByIdReza(int id) {
        Kategori1841720078Reza kat = new Kategori1841720078Reza();
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720078Reza();
                kat.setIdkategoriReza(rs.getInt("idkategori"));
                kat.setNamaReza(rs.getString("nama"));
                kat.setKeteranganReza(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720078Reza> getAllReza() {
        ArrayList<Kategori1841720078Reza> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720078Reza kat = new Kategori1841720078Reza();
                kat.setIdkategoriReza(rs.getInt("idkategori"));
                kat.setNamaReza(rs.getString("nama"));
                kat.setKeteranganReza(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720078Reza> searchReza(String keyword) {
        ArrayList<Kategori1841720078Reza> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720078Reza.selectQueryReza(sql);

        try {
            while (rs.next()) {
                Kategori1841720078Reza kat = new Kategori1841720078Reza();
                kat.setIdkategoriReza(rs.getInt("idkategori"));
                kat.setNamaReza(rs.getString("nama"));
                kat.setKeteranganReza(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720078Reza> getByNamaAndKeteranganReza(String nama, String keterangan) {
        ArrayList<Kategori1841720078Reza> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720078Reza.selectQueryReza(
                    "SELECT * FROM kategori "
                    + "WHERE nama = '" + nama + "'  AND keterangan = '" + keterangan + "'  ");

        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM kategori WHERE nama = '" + nama + "'");
        } else {
            rs = DBHelper1841720078Reza.selectQueryReza(
                    "SELECT * FROM kategori "
                    + "WHERE keterangan = '" + keterangan + "'  ");

        }
        try {
            while (rs.next()) {
                Kategori1841720078Reza kat = new Kategori1841720078Reza();
                kat.setIdkategoriReza(rs.getInt("idkategori"));
                kat.setNamaReza(rs.getString("nama"));
                kat.setKeteranganReza(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveReza() {
        if (getByIdReza(mIdkategori).getIdkategoriReza() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720078Reza.insertQueryGetIdReza(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.mNama + "', " + " keterangan = '" + this.mKeterangan + "' " + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720078Reza.executeQueryReza(SQL);
        }
    }

    public void deleteReza() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720078Reza.executeQueryReza(SQL);
    }

    public String toString() {
        return mNama;
    }
}
