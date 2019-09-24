package jti.polinema.relasiclass.percobaan2_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Pelanggan1841720078Reza
{   
    private String mNama;
    private Mobil1841720078Reza mMobil;
    private Sopir1841720078Reza mSopir;
    private int mHari;
    
    public Pelanggan1841720078Reza() {
    }
    
    public void setNamaReza(String mNama)
    {
        this.mNama = mNama;
    }
    
    public String getNamaReza()
    {
        return mNama;
    }
    
    public void setMobilReza(Mobil1841720078Reza mMobil)
    {
        this.mMobil = mMobil;
    }
    
    public Mobil1841720078Reza getMobilReza()
    {
        return mMobil;
    }
    
    public void setSopirReza(Sopir1841720078Reza mSopir)
    {
        this.mSopir = mSopir;
    }
    
    public Sopir1841720078Reza getSopirReza()
    {
        return mSopir;
    }
    
    public void setHariReza(int mHari)
    {
        this.mHari = mHari;
    }
    
    public int getHariReza()
    {
        return mHari;
    }
    
    public int hitungBiayaTotalReza()
    {
        return mMobil.hitungBiayaMobilReza(mHari) +
                mSopir.hitungBiayaSopirReza(mHari);
    }
}
