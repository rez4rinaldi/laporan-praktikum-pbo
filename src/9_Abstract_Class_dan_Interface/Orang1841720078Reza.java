package pbominggu9.abstractclass;

/**
 *
 * @author Reza Rinaldi
 */
public class Orang1841720078Reza 
{
    private String mNama;
    private Hewan1841720078Reza mHewanPeliharaan;
    
    public Orang1841720078Reza(String mNama)
    {
        this.mNama = mNama;
    }
    
    public void peliharaHewanReza(Hewan1841720078Reza mHewanPeliharaan)
    {
        this.mHewanPeliharaan = mHewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanReza()
    {
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.mHewanPeliharaan.bergerakReza();
        System.out.println("-----------------------------------------");
    }
}
