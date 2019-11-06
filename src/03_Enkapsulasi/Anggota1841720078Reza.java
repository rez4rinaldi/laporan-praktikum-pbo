package jti.polinema.koperasigettersetter1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Anggota1841720078Reza 
{
    private String mNama;
    private String mAlamat;
    private float mSimpanan;

    public Anggota1841720078Reza(String nama, String alamat)
    {
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }
    
    public void setNamaReza(String mNama)
    {
        this.mNama = mNama;
    }
    
    public void setAlamatReza(String mAlamat)
    {
        this.mAlamat = mAlamat;
    }
    
    public String getNamaReza()
    {
        return mNama;
    }
    
    public String getAlamatReza()
    {
        return mAlamat;
    }
    
    public float getSimpananReza()
    {
        return mSimpanan;
    }
    
    public void setorReza(float uang)
    {
        mSimpanan += uang;
    }
    
    public void pinjamReza(float uang)
    {
        mSimpanan -= uang;
    }
}