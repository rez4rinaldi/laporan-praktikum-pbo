package tugasjobsheet6;

/**
 *
 * @author Reza Rinaldi
 */
public class Leptop1841720078Reza extends Komputer1841720078Reza
{
    public String jnsBatre;
    
    public Leptop1841720078Reza(){
    }

    public Leptop1841720078Reza(String merk, String jnsProsesor, double kcptProsesor, int ukrMemori, String jnsBatre) 
    {
        super(merk, jnsProsesor, kcptProsesor, ukrMemori);
        this.jnsBatre = jnsBatre;
    }
    
    public void tampilLeptopReza()
    {
        super.tampilDataReza();
        System.out.println("Jenis Batre        = " + jnsBatre);
    }
}
