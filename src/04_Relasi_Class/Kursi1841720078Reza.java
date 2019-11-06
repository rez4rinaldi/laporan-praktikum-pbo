package jti.polinema.relasiclass.percobaan4_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Kursi1841720078Reza 
{
    private String mNomer;
    private Penumpang1841720078Reza mPenumpang;

    public Kursi1841720078Reza(String mNomer)
    {
        this.mNomer = mNomer;
    }
    
    public void setNomerReza(String mNomer)
    {
        this.mNomer = mNomer;
    }
    
    public String getNomerReza()
    {
        return mNomer;
    }
    
    public void setPenumpangReza(Penumpang1841720078Reza mPenumpang)
    {
        this.mPenumpang = mPenumpang;
    }
    
    public Penumpang1841720078Reza getPenumpangReza()
    {
        return mPenumpang;
    }
    
    public String infoReza()
    {
        String info = "";
        info += "Nomer: " + mNomer + "\n";
        if (this.mPenumpang != null)
        {
            info += "Penumpang: " + mPenumpang.infoReza() + "\n";
        }
        return info;
    }
}
