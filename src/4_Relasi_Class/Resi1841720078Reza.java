package jti.polinema.relasiclass.tugas1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Resi1841720078Reza 
{
    private String mResi;

    public Resi1841720078Reza() {
    }

    public Resi1841720078Reza(String mResi)
    {
        this.mResi = mResi;
    }

    public void setmResiReza(String mResi) 
    {
        this.mResi = mResi;
    }

    public String getmResiReza()
    {
        return mResi;
    }

    public String infoReza() 
    {
        String info = "";
        info += "Resi        : " + mResi + "\n";
        return info;
    }
}
