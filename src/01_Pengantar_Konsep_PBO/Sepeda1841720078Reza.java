package sepedademo;

/**
 *
 * @author Reza Rinaldi
 */
public class Sepeda1841720078Reza
{
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setMerekReza(String newValue)
    {
        mMerek = newValue;
    }
    
    public void gantiGearReza(int newValue)
    {
        mGear = newValue;
    }
    
    public void tambahKecepatanReza(int increment)
    {
        mKecepatan = mKecepatan + increment;
    }
    
    public void remReza(int decrement)
    {
        mKecepatan = mKecepatan - decrement;
    }
    
    public void warnaSepeda(String newValue)
    {
        mWarna = newValue;
    }
    
    public void cetakStatusReza()
    {
        System.out.println("Merek: " + mMerek);
        System.out.println("Kecepatan: " + mKecepatan);
        System.out.println("Gear: " + mGear);
        System.out.println("Warna: " + mWarna);
    }
}
