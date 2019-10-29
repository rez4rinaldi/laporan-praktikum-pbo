package interfacelatihan;

/**
 *
 * @author Reza Rinaldi
 */
public class Program23_1841720078Reza 
{
    public static void main(String[] args)
    {
        Rektor1841720078Reza pakRektor = new Rektor1841720078Reza();
        
//        Mahasiswa1841720078Reza mahasiswaBiasa = new Mahasiswa1841720078Reza("Charlie");
        Sarjana1841720078Reza sarjanaCumlaude = new Sarjana1841720078Reza("Dini");
        PascaSarjana1841720078Reza masterCumlaude = new PascaSarjana1841720078Reza("Elok");
        
        // Percobaan 2
//        pakRektor.beriSertifikatCumlaudeReza(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaudeReza(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaudeReza(masterCumlaude);
        
        // Percobaan 3
        pakRektor.beriSertifikatMawapresReza(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresReza(masterCumlaude);
    }
}
