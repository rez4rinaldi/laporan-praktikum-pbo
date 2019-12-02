package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Reza R
 */
public class Buku1841720078Reza {

    private int mIdbuku;
    private Kategori1841720078Reza mKategori = new Kategori1841720078Reza();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720078Reza() {
    }

    public Buku1841720078Reza(Kategori1841720078Reza mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getIdbukuReza() {
        return mIdbuku;
    }

    public void setIdbukuReza(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720078Reza getKategoriReza() {
        return mKategori;
    }

    public void setKategoriReza(Kategori1841720078Reza mKategori) {
        this.mKategori = mKategori;
    }

    public String getJudulReza() {
        return mJudul;
    }

    public void setJudulReza(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getPenerbitReza() {
        return mPenerbit;
    }

    public void setPenerbitReza(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getPenulisReza() {
        return mPenulis;
    }

    public void setPenulisReza(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720078Reza getByIdReza(int id) {
        Buku1841720078Reza buku = new Buku1841720078Reza();
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                buku = new Buku1841720078Reza();
                buku.setIdbukuReza(rs.getInt("idbuku"));
                buku.getKategoriReza().setIdkategoriReza(rs.getInt("idkategori"));
                buku.getKategoriReza().setNamaReza(rs.getString("nama"));
                buku.getKategoriReza().setKeteranganReza(rs.getString("keterangan"));
                buku.setJudulReza(rs.getString("judul"));
                buku.setPenerbitReza(rs.getString("penerbit"));
                buku.setPenulisReza(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720078Reza> getAllReza() {
        ArrayList<Buku1841720078Reza> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Buku1841720078Reza buku = new Buku1841720078Reza();
                buku.setIdbukuReza(rs.getInt("idbuku"));
                buku.getKategoriReza().setIdkategoriReza(rs.getInt("idkategori"));
                buku.getKategoriReza().setNamaReza(rs.getString("nama"));
                buku.getKategoriReza().setKeteranganReza(rs.getString("keterangan"));
                buku.setJudulReza(rs.getString("judul"));
                buku.setPenerbitReza(rs.getString("penerbit"));
                buku.setPenulisReza(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720078Reza> searchReza(String keyword) {
        ArrayList<Buku1841720078Reza> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.judul LIKE '%" + keyword + "%' " + " OR b.penerbit LIKE '%" + keyword + "%' " + " OR b.penulis LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Buku1841720078Reza buku = new Buku1841720078Reza();
                buku.setIdbukuReza(rs.getInt("idbuku"));
                buku.getKategoriReza().setIdkategoriReza(rs.getInt("idkategori"));
                buku.getKategoriReza().setNamaReza(rs.getString("nama"));
                buku.getKategoriReza().setKeteranganReza(rs.getString("keterangan"));
                buku.setJudulReza(rs.getString("judul"));
                buku.setPenerbitReza(rs.getString("penerbit"));
                buku.setPenulisReza(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveReza() {
        if (getByIdReza(mIdbuku).getIdbukuReza() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES(" + " '" + this.mJudul + "', " + " '" + this.getKategoriReza().getIdkategoriReza() + "', " + " '" + this.mPenulis + "', " + " '" + this.mPenerbit + "' " + " )";
            this.mIdbuku = DBHelper1841720078Reza.insertQueryGetIdReza(SQL);
        } else {
            String SQL = "UPDATE buku SET " + " judul = '" + this.mJudul + "', " + " idkategori = '" + this.getKategoriReza().getIdkategoriReza() + "', " + " penulis = '" + this.mPenulis + "', " + " penerbit = '" + this.mPenerbit + "' " + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1841720078Reza.executeQueryReza(SQL);
        }
    }

    public void deleteReza() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720078Reza.executeQueryReza(SQL);
    }
}
