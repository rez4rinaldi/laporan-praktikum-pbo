package tugasjobsheet7reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Segitiga1841720078Reza 
{
    private static int mSudut;

    public static int totalsudutReza(float sudutA) 
    {
        return (int) ((int) 180 - sudutA);
    }

    public static int totalSudutReza(float sudutA, float sudutB) 
    {
        return (int) ((int) 180 - (sudutA + sudutB));
    }

    public static int kelilingReza(float sisiA, int sisiB, int sisiC) 
    {
        return (int) ((int) sisiB + sisiA + sisiC);
    }

    public static double kelilingReza(float sisiA, int sisiB)
    {
        return Math.pow(Math.sqrt(sisiA), 2) + Math.pow(Math.sqrt(sisiA), 2);
    }
    
    public static void main(String[] args) 
    {
        mSudut = 40;
        System.out.println(totalsudutReza(mSudut));
        System.out.println(totalSudutReza((float) mSudut, (float) mSudut));
        System.out.println(kelilingReza((float) mSudut, mSudut, mSudut));
        System.out.println(kelilingReza((float) mSudut, mSudut));
    }
}
