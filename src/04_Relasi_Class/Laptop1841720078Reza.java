package jti.polinema.relasiclass.percobaan1_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Laptop1841720078Reza
{
    private String mMerk;
    private Processor1841720078Reza mProc;

    public Laptop1841720078Reza() {
    }

    public Laptop1841720078Reza(String mMerk, Processor1841720078Reza mProc)
    {
        this.mMerk = mMerk;
        this.mProc = mProc;
    }
    
    public void setMerkReza(String mMerk)
    {
        this.mMerk = mMerk;
    }
    
    public String getMerkReza()
    {
        return mMerk;
    }
    
    public void setProcReza(Processor1841720078Reza mProc)
    {
        this.mProc = mProc;
    }
    
    public Processor1841720078Reza getProcReza()
    {
        return mProc;
    }
    
    public void infoReza()
    {
        System.out.println("Merk Laptop = " + mMerk);
        mProc.infoReza();
    }
}