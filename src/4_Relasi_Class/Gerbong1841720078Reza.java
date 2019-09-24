package jti.polinema.relasiclass.percobaan4_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Gerbong1841720078Reza
{
    private String mKode;
    private Kursi1841720078Reza[] mArrayKursi;

    public Gerbong1841720078Reza(String mKode, int jumlah)
    {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720078Reza[jumlah];
        this.initKursi();
    }
    
    private void initKursi()
    {
        for (int i = 0; i < mArrayKursi.length; i++)
        {
            this.mArrayKursi[i] = new Kursi1841720078Reza(String.valueOf(i + 1));
        }
    }
    
    public void setKodeReza(String mKode)
    {
        this.mKode = mKode;
    }
    
    public String getKodeReza()
    {
        return mKode;
    }
    
    public void setPenumpangReza(Penumpang1841720078Reza mPenumpang, int nomor)
    {
        // Percobaan 4 Pertanyaan No. 5
//        if (mArrayKursi[nomor - 1].getPenumpangReza() == null) 
//        {
//            this.mArrayKursi[nomor - 1].setPenumpangReza(mPenumpang);
//        } 
//        else 
//        {
//            System.out.println("Tidak dapat menduduki kursi yang sudah ada penumpang lain !");
//            System.out.println(mPenumpang.infoReza());
//        }
        this.mArrayKursi [nomor - 1].setPenumpangReza(mPenumpang);
    }
    
    public Kursi1841720078Reza[] getArrayKursiReza()
    {
        return mArrayKursi;
    }
    
    public String infoReza()
    {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720078Reza kursi : mArrayKursi)
        {
            info += kursi.infoReza();
        }
        return info;
    }
    
}
