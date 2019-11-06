package jobsheet07reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Manager1841720078Reza extends Karyawan1841720078Reza
{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720078Reza mSt[];

    public void setTunjanganReza(double mTunjangan) 
    {
        this.mTunjangan = mTunjangan;
    }
    
    public double getTunjanganReza()
    {
        return mTunjangan;
    }

    public void setBagianReza(String mBagian) 
    {
        this.mBagian = mBagian;
    }
    
    public String getBagianReza() 
    {
        return mBagian;
    }
    
    public void setStaffReza(Staff1841720078Reza mSt[])
    {
        this.mSt = mSt;
    }
    
    public void viewStaffReza()
    {
        int i;
        System.out.println("----------------------");
        for (i = 0; i < mSt.length; i++) 
        {
            mSt[i].lihatInfoReza();
        }
        System.out.println("----------------------");
    }
    
    public void lihatInfoReza()
    {
        System.out.println("Manager : "+this.getBagianReza());
        System.out.println("NIP : "+this.getNipReza());
        System.out.println("Nama : "+this.getNamaReza());
        System.out.println("Golongan : "+this.getGolonganReza());
        System.out.printf("Tunjangan : %.0f\n", this.getTunjanganReza());
        System.out.printf("Gaji : %.0f\n", this.getGajiReza());
        System.out.println("Bagian : "+this.getBagianReza());
        this.viewStaffReza();
    }

    @Override
    public double getGajiReza() 
    {
        return super.getGajiReza() + mTunjangan;
    }
}
