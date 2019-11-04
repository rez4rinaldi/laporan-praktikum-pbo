package jti.polinema.polimorfisme.tugas._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Tester1841720078Reza 
{
    public static void main(String[] args) 
    {
        WalkingZombie1841720078Reza wz = new WalkingZombie1841720078Reza(100, 1);
        JumpingZombie1841720078Reza jz = new JumpingZombie1841720078Reza(100, 2);
        Barrier1841720078Reza b = new Barrier1841720078Reza(100);
        Plant1841720078Reza p = new Plant1841720078Reza();
        System.out.println("" + wz.getZombieInfoReza());
        System.out.println("" + jz.getZombieInfoReza());
        System.out.println("" + b.getBarrierInfoReza());
        System.out.println("-------------------------");
        for (int i = 0; i < 4; i++) // Destroy the enemies 4 times
        {
            p.doDestroyReza(wz);
            p.doDestroyReza(jz);
            p.doDestroyReza(b);
        }
        System.out.println("" + wz.getZombieInfoReza());
        System.out.println("" + jz.getZombieInfoReza());
        System.out.println("" + b.getBarrierInfoReza());
    }
}
