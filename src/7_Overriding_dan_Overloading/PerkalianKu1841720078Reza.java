package jobsheet07reza;

/**
 *
 * @author Reza Rinaldi
 */
public class PerkalianKu1841720078Reza 
{
    void perkalianReza(int a, int b)
    {
        System.out.println(a * b);
    }
    
    // Latihan 1
//    void perkalianReza(int a, int b, int c)
//    {
//        System.out.println(a * b * c);
//    }
    
    // Latihan 2
    void perkalianReza(double a, double b)
    {
        System.out.println(a * b);
    }
    
    public static void main(String[] args)
    {
        PerkalianKu1841720078Reza objek = new PerkalianKu1841720078Reza();
        // Latihan 1
//        objek.perkalianReza(25, 43);
//        objek.perkalianReza(34, 23, 56);
        
        // Latihan 2
        objek.perkalianReza(25, 43);
        objek.perkalianReza(34.56, 23.7);
    }
}
