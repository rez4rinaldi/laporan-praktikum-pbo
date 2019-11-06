package tugasjobsheet6;

/**
 *
 * @author Reza Rinaldi
 */
public class Pc1841720078Reza extends Komputer1841720078Reza
{
    public int ukrMonitor;
    
    public Pc1841720078Reza() {
    }

    public Pc1841720078Reza(String merk, String jnsProsesor, int kcptProsesor, int ukrMemori, int ukrMonitor)
    {
        super(merk, jnsProsesor, kcptProsesor, ukrMemori);
        this.ukrMonitor = ukrMonitor;
    }
    
    public void tampilPcReza()
    {
        System.out.println("==============Personal Computer==============");
        super.tampilDataReza();
        System.out.println("Ukuran Monitor     = " + ukrMonitor + " Inch");
    }
}
