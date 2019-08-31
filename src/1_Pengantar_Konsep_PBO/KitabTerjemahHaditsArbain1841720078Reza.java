package tugas;

/**
 *
 * @author Reza Rinaldi
 */
public class KitabTerjemahHaditsArbain1841720078Reza extends KitabHaditsArbain1841720078Reza
{
    private String mPenerjemah;
    
    public void namaPenerjemahReza(String newValue)
    {
        mPenerjemah = newValue;
    }
    
    public void cetakStatusReza()
    {
        super.cetakStatusReza();
        System.out.println("Nama Penerjemah: " + mPenerjemah);
    }
}
