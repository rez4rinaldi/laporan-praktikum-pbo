package sepedademo;

/**
 *
 * @author Reza Rinaldi
 */
public class SepedaGunung1841720078Reza extends Sepeda1841720078Reza
{
    private String mTipeSuspensi;
    
    public void setTipeSuspensiReza(String newValue)
    {
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusReza()
    {
        super.cetakStatusReza();
        System.out.println("Tipe suspensi: " + mTipeSuspensi);
    }
}
