package jti.polinema.relasiclass.tugas1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class MainTugas1841720078Reza 
{
    public static void main(String[] args) 
    {
        Pedagang1841720078Reza pdg = new Pedagang1841720078Reza("637123", "Reza Rinaldi");

        System.out.println(pdg.infoReza());

        Kitab1841720078Reza kt = new Kitab1841720078Reza();
        kt.setJudulKitabReza("Hadits-Hadits Dha'if Dan Maudhu' - Ust. Abdul Hakim bin Amir Abdat");
        kt.setHargaReza(110000);
        kt.setJumlahReza(1);

        kt.infoReza();

        Resi1841720078Reza r = new Resi1841720078Reza("888040192254");

        System.out.println(r.infoReza());

        Pemesan1841720078Reza pm = new Pemesan1841720078Reza();

        pm.setTotalKitabReza(6);
        pm.setBayarReza(110000);
        pm.infoReza();
        System.out.println("Biaya Total : "
                + pm.hitungBiayaReza());
    }
}
