package jobsheet07reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Karyawan1841720078Reza 
{
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setNamaReza(String mNama) 
    {
        this.mNama = mNama;
    }

    public void setNipReza(String mNip) 
    {
        this.mNip = mNip;
    }

    public void setGolonganReza(String mGolongan) 
    {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) 
        {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }
    
    public void setGajiReza(double mGaji)
    {
        this.mGaji = mGaji;
    }

    public String getNamaReza()
    {
        return mNama;
    }

    public String getNipReza() 
    {
        return mNip;
    }

    public String getGolonganReza() 
    {
        return mGolongan;
    }

    public double getGajiReza()
    {
        return mGaji;
    }
}
