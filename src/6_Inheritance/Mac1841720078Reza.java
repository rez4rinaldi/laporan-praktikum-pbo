package tugasjobsheet6;

/**
 *
 * @author Reza Rinaldi
 */
public class Mac1841720078Reza extends Leptop1841720078Reza
{
    public String keamanan;
    
    public Mac1841720078Reza() {
    }

    public Mac1841720078Reza(String merk, String jnsProsesor, double kcptProsesor, int ukrMemori, String jnsBatre, String keamanan) 
    {
        super(merk, jnsProsesor, kcptProsesor, ukrMemori, jnsBatre);
        this.keamanan = keamanan;
    }
    
    public void tampilMacReza()
    {
        System.out.println("==============Leptop MacBook==============");
        super.tampilLeptopReza();
        System.out.println("Keamanan           = " + keamanan);
    }
}
