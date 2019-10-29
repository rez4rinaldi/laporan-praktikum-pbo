package interfacelatihan;

/**
 *
 * @author Reza Rinaldi
 */
public class Rektor1841720078Reza
{
    // Percobaan 2
    public void beriSertifikatCumlaudeReza(ICumlaude1841720078Reza mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.kuliahDiKampusReza();
        mahasiswa.lulusReza();
        mahasiswa.meraihIPKTinggiReza();
        
        System.out.println("--------------------------------------------");
    }
    
    // Percobaan 3
    public void beriSertifikatMawapresReza(IBerprestasi1841720078Reza mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisiReza();
        mahasiswa.membuatPublikasiIlmiahReza();
        
        System.out.println("------------------------------------------------");
    }
}
