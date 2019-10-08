package tugasjobsheet6;

/**
 *
 * @author Reza Rinaldi
 */
public class Windows1841720078Reza extends Leptop1841720078Reza
{
    public String fitur;
    
    public Windows1841720078Reza() {
    }

    public Windows1841720078Reza(String merk, String jnsProsesor, double kcptProsesor, int ukrMemori, String jnsBatre, String fitur) 
    {
        super(merk, jnsProsesor, kcptProsesor, ukrMemori, jnsBatre);
        this.fitur = fitur;
    }
    
    public void tampilWindowsReza()
    {
        System.out.println("==============Leptop Windows==============");
        super.tampilLeptopReza();
        System.out.println("Fitur Tambahan     = " + fitur);
    }
}
