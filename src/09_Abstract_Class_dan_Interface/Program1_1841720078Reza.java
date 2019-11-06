package pbominggu9.abstractclass;

/**
 *
 * @author Reza Rinaldi
 */
public class Program1_1841720078Reza 
{
    public static void main(String[] args) 
    {
        Kucing1841720078Reza kucingKampung = new Kucing1841720078Reza();
        Ikan1841720078Reza lumbaLumba = new Ikan1841720078Reza();
        
        Orang1841720078Reza ani = new Orang1841720078Reza("Ani");
        Orang1841720078Reza budi = new Orang1841720078Reza("Budi");
        
        ani.peliharaHewanReza(kucingKampung);
        budi.peliharaHewanReza(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalanReza();
        budi.ajakPeliharaanJalanJalanReza();
    }
}
