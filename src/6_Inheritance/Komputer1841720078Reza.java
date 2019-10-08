package tugasjobsheet6;

/**
 *
 * @author Reza Rinaldi
 */
public class Komputer1841720078Reza 
{
    public String merk, jnsProsesor;
    public double kcptProsesor;
    public int ukrMemori;
    
    public Komputer1841720078Reza() {
    }

    public Komputer1841720078Reza(String merk, String jnsProsesor, double kcptProsesor, int ukrMemori) 
    {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kcptProsesor = kcptProsesor;
        this.ukrMemori = ukrMemori;
    }
    
    public void tampilDataReza()
    {
        System.out.println("Merk               = " + merk);
        System.out.println("Jenis Prosesor     = " + jnsProsesor);
        System.out.println("Kecepetan Prosesor = " + kcptProsesor + " GHz");
        System.out.println("Ukuran Memori      = " + ukrMemori + " GB");
    }
}
