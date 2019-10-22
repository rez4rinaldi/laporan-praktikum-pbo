package jti.polinema.relasiclass.tugas1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Kitab1841720078Reza 
{
    private Pedagang1841720078Reza mPedagang;
    private String mJudul;
    private int mHarga;
    private int mJumlah;

    public Kitab1841720078Reza() {
    }

    public Kitab1841720078Reza(String mJudul, int mHarga, int mJumlah) 
    {
        this.mJudul = mJudul;
        this.mHarga = mHarga;
        this.mJumlah = mJumlah;
    }

    public void setPedagangReza(Pedagang1841720078Reza mPedagang) 
    {
        this.mPedagang = mPedagang;
    }
    
    public Pedagang1841720078Reza getPedagangReza() 
    {
        return mPedagang;
    }

    public void setJudulKitabReza(String mJudul) 
    {
        this.mJudul = mJudul;
    }

    public String getJudulKitabReza() 
    {
        return mJudul;
    }

    public void setHargaReza(int mHarga) 
    {
        this.mHarga = mHarga;
    }

    public int getHargaReza() 
    {
        return mHarga;
    }

    public void setJumlahReza(int mJumlah) 
    {
        this.mJumlah = mJumlah;
    }

    public int getJumlahReza() 
    {
        return mJumlah;
    }
    
    public void infoReza()
    {
        System.out.println("Judul Kitab : " + mJudul);
        System.out.println("Harga       : " + mHarga);
        System.out.println("Jumlah      : " + mJumlah);
    }
}
