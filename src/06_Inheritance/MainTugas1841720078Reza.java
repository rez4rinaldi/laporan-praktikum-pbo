package tugasjobsheet6;

/**
 *
 * @author Reza Rinaldi
 */
public class MainTugas1841720078Reza 
{
    public static void main(String[] args) 
    {
        Pc1841720078Reza pc = new Pc1841720078Reza("Lenovo", "Intel Core i10", 5, 1000, 15);
        pc.tampilPcReza();
        
        System.out.println();
        
        Mac1841720078Reza mac = new Mac1841720078Reza("MacBook Pro", "Intel Core i5-8279U", 2.4, 256, "Lithium-Polymer 58,2 watt", "ESET NOD32");
        mac.tampilMacReza();
        
        System.out.println();
        
        Windows1841720078Reza windows = new Windows1841720078Reza("Asus ROG", "Intel Core i7-8750H", 2.2, 512, "64 Whrs 4 Cells Battery", "Bluetooth");
        windows.tampilWindowsReza();
    }
}
