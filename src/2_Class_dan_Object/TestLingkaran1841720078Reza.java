package tugasjobhseet2;
import java.util.Scanner;

/**
 *
 * @author Reza Rinaldi
 */
public class TestLingkaran1841720078Reza 
{
    public static void main(String[] args)
    {
        Lingkaran1841720078Reza lkrn = new Lingkaran1841720078Reza();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka jari-jari lingkaran (r): ");
        lkrn.r = sc.nextDouble();
        
        System.out.println("Luas Lingkaran: " + lkrn.hitungLuasReza());
        System.out.println("Keliling Lingkaran: " + lkrn.hitungKelilingReza());
    }
}
