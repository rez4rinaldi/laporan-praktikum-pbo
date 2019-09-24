package jti.polinema.relasiclass.percobaan3_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class MainPercobaan3_1841720078Reza
{
    public static void main(String[] args)
    {
        Pegawai1841720078Reza masinis = new Pegawai1841720078Reza("1234", "Spongebob Squarepants");
        Pegawai1841720078Reza asisten = new Pegawai1841720078Reza("4567", "Patrick Star");
        KeretaApi1841720078Reza keretaApi = new KeretaApi1841720078Reza("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.infoReza());
    }
}
