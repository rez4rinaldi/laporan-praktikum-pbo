package jobsheet07reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Staff1841720078Reza extends Karyawan1841720078Reza
{
    private int mLembur;
    private double mGajiLembur;

    public void setLemburReza(int mLembur) 
    {
        this.mLembur = mLembur;
    }
    
    public int getLemburReza() 
    {
        return mLembur;
    }

    public void setGajiLemburReza(double mGajiLembur)
    {
        this.mGajiLembur = mGajiLembur;
    }
    
    public double getGajiLemburReza() 
    {
        return mGajiLembur;
    }
    
    public double getGajiReza(int mLembur, double mGajiLembur)
    {
        return super.getGajiReza() + mLembur * mGajiLembur;
    }

    @Override
    public double getGajiReza() 
    {
        return super.getGajiReza() + mLembur * mGajiLembur;
    }
    
    public void lihatInfoReza()
    {
        System.out.println("NIP : "+this.getNipReza());
        System.out.println("Nama : "+this.getNamaReza());
        System.out.println("Golongan : "+this.getGolonganReza());
        System.out.println("Jml Lembur : "+this.getLemburReza());
        System.out.printf("Gaji Lembur : %.0f\n", this.getGajiLemburReza());
        System.out.printf("Gaji : %.0f\n", this.getGajiReza());
        System.out.println();
    }
}
