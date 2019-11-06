package jti.polinema.motorencapsulation1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Motor1841720078Reza
{
    private int mKecepatan = 90;
    private boolean mKontakOn = false;
    
    public void printStatusReza()
    {
        if (mKontakOn) 
        {
            System.out.println("Kontak On");
        }
        else 
        {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan = " + mKecepatan + "\n");
    }
    
    public void nyalakanMesinReza()
    {
        mKontakOn = true;
    }
    
    public void matikanMesinReza()
    {
        mKontakOn = false;
        mKecepatan = 0;
    }
    
    public void tambahKecepatanReza()
    {
        if (mKontakOn)
        {
            if (mKecepatan < 100) 
            {
                mKecepatan += 5;
            }
        }
        else
        {
            System.out.println("Kecepatan tidak bisa bertamabah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatanReza()
    {
        if (mKontakOn)
        {
            mKecepatan -= 5;
        }
        else
        {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
}