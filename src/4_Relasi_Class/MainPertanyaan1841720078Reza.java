package jti.polinema.relasiclass.percobaan3_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class MainPertanyaan1841720078Reza 
{
    public static void main(String[] args) 
    {
        Pegawai1841720078Reza masinis = new Pegawai1841720078Reza("1234", "Spongebob Squarepants");
        KeretaApi1841720078Reza keretaApi = new KeretaApi1841720078Reza("Gaya Baru", "Bisnis", masinis);

        System.out.println(keretaApi.infoReza());
    }
}
