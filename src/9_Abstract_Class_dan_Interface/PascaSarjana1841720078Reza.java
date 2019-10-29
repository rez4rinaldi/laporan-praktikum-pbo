package interfacelatihan;

/**
 *
 * @author Reza Rinaldi
 */
public class PascaSarjana1841720078Reza extends Mahasiswa1841720078Reza implements ICumlaude1841720078Reza,
        IBerprestasi1841720078Reza
{
    public PascaSarjana1841720078Reza(String mNama) 
    {
        super(mNama);
    }

    @Override
    public void lulusReza() 
    {
       System.out.println("Aku sudah menyelesaikan TESIS"); 
    }

    @Override
    public void meraihIPKTinggiReza() 
    {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisiReza() 
    {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");    
    }

    @Override
    public void membuatPublikasiIlmiahReza() 
    {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");    
    }
}
