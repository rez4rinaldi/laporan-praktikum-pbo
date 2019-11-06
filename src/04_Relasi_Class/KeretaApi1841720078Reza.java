package jti.polinema.relasiclass.percobaan3_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class KeretaApi1841720078Reza 
{
    private String mNama;
    private String mKelas;
    private Pegawai1841720078Reza mMasinis;
    private Pegawai1841720078Reza mAsisten;

    public KeretaApi1841720078Reza(String mNama, String mKelas, Pegawai1841720078Reza mMasinis)
    {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720078Reza(String mNama, String mKelas, Pegawai1841720078Reza mMasinis, Pegawai1841720078Reza mAsisten)
    {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }
    
    public void setNamaReza(String mNama)
    {
        this.mNama = mNama;
    }
    
    public String getNamaReza()
    {
        return mNama;
    }
    
    public void setKelasReza(String mKelas)
    {
        this.mKelas = mKelas;
    }
    
    public String getKelasReza()
    {
        return mKelas;
    }
    
    public void setMasinisReza(Pegawai1841720078Reza mMasinis)
    {
        this.mMasinis = mMasinis;
    }
    
    public Pegawai1841720078Reza getMasinisReza()
    {
        return mMasinis;
    }
    
    public void setAsistenReza(Pegawai1841720078Reza mAsisten)
    {
        this.mAsisten = mAsisten;
    }
    
    public Pegawai1841720078Reza getAsistenReza()
    {
        return mAsisten;
    }
    
    public String infoReza()
    {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis : " + this.mMasinis.infoReza() + "\n";
        if(mAsisten != null)
        {
             info += "Asisten : " + this.mAsisten.infoReza() + "\n";
        }
        return info;
    }
}
