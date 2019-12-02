package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Reza R
 */
public class Anggota1841720078Reza {
    
    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720078Reza() {
    }

    public Anggota1841720078Reza(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaReza() {
        return mIdanggota;
    }

    public void setIdanggotaReza(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaReza() {
        return mNama;
    }

    public void setNamaReza(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatReza() {
        return mAlamat;
    }

    public void setAlamatReza(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponReza() {
        return mTelepon;
    }

    public void setTeleponReza(String mTelepon) {
        this.mTelepon = mTelepon;
    }
    
    public Anggota1841720078Reza getByIdReza(int id)
    {
        Anggota1841720078Reza agt = new Anggota1841720078Reza();
        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");
        
        try {
            while (rs.next()) {
                agt = new Anggota1841720078Reza();
                agt.setIdanggotaReza(rs.getInt("idanggota"));
                agt.setNamaReza(rs.getString("nama"));
                agt.setAlamatReza(rs.getString("alamat"));
                agt.setTeleponReza(rs.getString("telepon"));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }
    
    public ArrayList<Anggota1841720078Reza> getAllReza() {
        ArrayList<Anggota1841720078Reza> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720078Reza.selectQueryReza("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720078Reza agt = new Anggota1841720078Reza();
                agt.setIdanggotaReza(rs.getInt("idanggota"));
                agt.setNamaReza(rs.getString("nama"));
                agt.setAlamatReza(rs.getString("alamat"));
                agt.setTeleponReza(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota1841720078Reza> searchReza(String keyword) {
        ArrayList<Anggota1841720078Reza> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720078Reza.selectQueryReza(sql);

        try {
            while (rs.next()) {
                Anggota1841720078Reza agt = new Anggota1841720078Reza();
                agt.setIdanggotaReza(rs.getInt("idanggota"));
                agt.setNamaReza(rs.getString("nama"));
                agt.setAlamatReza(rs.getString("alamat"));
                agt.setTeleponReza(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void saveReza() {
        if (getByIdReza(mIdanggota).getIdanggotaReza()== 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720078Reza.insertQueryGetIdReza(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720078Reza.executeQueryReza(SQL);
        }
    }
    
    public void deleteReza()
    {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720078Reza.executeQueryReza(SQL);
    }
}
