package jti.polinema.relasiclass.percobaan4_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class MainPercobaan4_1841720078Reza
{
    public static void main(String[] args)
    {
        Penumpang1841720078Reza p = new Penumpang1841720078Reza("12345", "Mr. Krab");
        Penumpang1841720078Reza budi = new Penumpang1841720078Reza("12346", "Budi");
        Gerbong1841720078Reza gerbong = new Gerbong1841720078Reza("A", 10);
        gerbong.setPenumpangReza(p, 1);
        gerbong.setPenumpangReza(budi, 2);
        System.out.println(gerbong.infoReza());
    }
}
