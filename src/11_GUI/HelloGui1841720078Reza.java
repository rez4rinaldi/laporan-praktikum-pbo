package hellogui;

/**
 *
 * @author Reza Rinaldi
 */
import javax.swing.*;

public class HelloGui1841720078Reza
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program akan berhenti jika ditutup
        frame.setSize(600, 300); // lebar, tinggi windows
        frame.setLocation( 200, 200); // x, y tampilan pada windows
        // frame.setLocationRelativeTo(null); // menempatkan frame ditengah-tengah layar
        frame.setVisible(true); // untuk menampilkan frame
    }

}
