package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Reza R
 */
public class Peminjaman1841720078Reza {

    private int mIdpeminjaman;
    private Anggota1841720078Reza mAnggota = new Anggota1841720078Reza();
    private Buku1841720078Reza mBuku = new Buku1841720078Reza();
    private String mTanggalpinjam;
    private String mTanggalkembali;

    public Peminjaman1841720078Reza() {
    }

    public Peminjaman1841720078Reza(Anggota1841720078Reza mAnggota, Buku1841720078Reza mBuku, String mTanggalpinjam, String mTanggalkembali) {
        this.mAnggota = mAnggota;
        this.mBuku = mBuku;
        this.mTanggalpinjam = mTanggalpinjam;
        this.mTanggalkembali = mTanggalkembali;
    }

    public int getIdpeminjamanReza() {
        return mIdpeminjaman;
    }

    public void setIdpeminjamanReza(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720078Reza getAnggotaReza() {
        return mAnggota;
    }

    public void setAnggotaReza(Anggota1841720078Reza mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720078Reza getBukuReza() {
        return mBuku;
    }

    public void setBukuReza(Buku1841720078Reza mBuku) {
        this.mBuku = mBuku;
    }

    public String getTanggalpinjamReza() {
        return mTanggalpinjam;
    }

    public void setTanggalpinjamReza(String mTanggalpinjam) {
        this.mTanggalpinjam = mTanggalpinjam;
    }

    public String getTanggalkembaliReza() {
        return mTanggalkembali;
    }

    public void setTanggalkembaliReza(String mTanggalkembali) {
        this.mTanggalkembali = mTanggalkembali;
    }

    public Peminjaman1841720078Reza getByIdReza(int id) {
        Peminjaman1841720078Reza pinjam = new Peminjaman1841720078Reza();
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720078Reza();
                pinjam.setIdpeminjamanReza(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaReza().setIdanggotaReza(rs.getInt("idanggota"));
                pinjam.getBukuReza().setIdbukuReza(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamReza(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliReza(rs.getString("tanggalkembali"));
                pinjam.setAnggotaReza(new Anggota1841720078Reza().getByIdReza(pinjam.getAnggotaReza().getIdanggotaReza()));
                pinjam.setBukuReza(new Buku1841720078Reza().getByIdReza(pinjam.getBukuReza().getIdbukuReza()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720078Reza> getAllReza() {
        ArrayList<Peminjaman1841720078Reza> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720078Reza pinjam = new Peminjaman1841720078Reza();
                pinjam.setIdpeminjamanReza(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaReza().setIdanggotaReza(rs.getInt("idanggota"));
                pinjam.getBukuReza().setIdbukuReza(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamReza(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliReza(rs.getString("tanggalkembali"));
                pinjam.setAnggotaReza(new Anggota1841720078Reza().getByIdReza(pinjam.getAnggotaReza().getIdanggotaReza()));
                pinjam.setBukuReza(new Buku1841720078Reza().getByIdReza(pinjam.getBukuReza().getIdbukuReza()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveReza() {
        if (getByIdReza(mIdpeminjaman).getIdpeminjamanReza() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaReza().getIdanggotaReza() + "', "
                    + "'" + this.getBukuReza().getIdbukuReza() + "',"
                    + "'" + this.mTanggalpinjam + "', "
                    + "'" + this.mTanggalkembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720078Reza.insertQueryGetIdReza(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getAnggotaReza().getIdanggotaReza() + "', "
                    + "idbuku = '" + this.getBukuReza().getIdbukuReza() + "', "
                    + "tanggalpinjam = '" + this.mTanggalpinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalkembali + "'";
            DBHelper1841720078Reza.executeQueryReza(sql);
        }
    }

    public void cariAnggotaReza(int id) {
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getAnggotaReza().setIdanggotaReza(rs.getInt("idanggota"));
                getAnggotaReza().setNamaReza(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuReza(int id) {
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getBukuReza().setIdbukuReza(rs.getInt("idbuku"));
                getBukuReza().setJudulReza(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteReza() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720078Reza.executeQueryReza(sql);
    }
}
