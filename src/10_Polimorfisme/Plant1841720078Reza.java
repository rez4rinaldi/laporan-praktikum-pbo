package jti.polinema.polimorfisme.tugas._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Plant1841720078Reza
{
    public void doDestroyReza(IDestroyable1841720078Reza d) 
    {
        if (d instanceof WalkingZombie1841720078Reza) 
        {
            WalkingZombie1841720078Reza wz = (WalkingZombie1841720078Reza) d;
            wz.destroyedReza();
        } 
        
        else if (d instanceof JumpingZombie1841720078Reza) 
        {
            JumpingZombie1841720078Reza jz = (JumpingZombie1841720078Reza) d;
            jz.destroyedReza();
        } 
        
        else if (d instanceof Barrier1841720078Reza) 
        {
            Barrier1841720078Reza b = (Barrier1841720078Reza) d;
            b.destroyReza();
        }
    }
}
