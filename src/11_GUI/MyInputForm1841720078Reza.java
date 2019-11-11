package myinputform;

/**
 *
 * @author Reza Rinaldi
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720078Reza extends JFrame 
{
    /**
     * @param args the command line arguments
     */
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JLabel mDLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JButton mButtonTambah;
    private JPanel mPanel;

    public MyInputForm1841720078Reza() 
    {
        createTextFieldReza();
        createButtonKaliReza();
        createButtonTambahReza();
        createPanelReza();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }

    private void createTextFieldReza() 
    {
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai B: ");
        mCLabel = new JLabel("Hasil Perkalian: ");
        mDLabel = new JLabel("Hasil Penambahan: ");

        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButtonKaliReza() 
    {
        mButton = new JButton("Kali (*)"); // untuk membuat tombol "Kali"
        class AddInterestListener1841720078Reza implements ActionListener 
        {
            @Override
            public void actionPerformed(ActionEvent event) 
            {
                int a = Integer.valueOf(mAField.getText()); // mengambil inputan textbox
                int b = Integer.valueOf(mBField.getText());
                int c = a * b;
                mCLabel.setText("Hasil Perkalian: " + c);
            }
        }
        ActionListener listener = new AddInterestListener1841720078Reza();
        mButton.addActionListener(listener);
    }
    
    private void createButtonTambahReza() 
    {
        mButtonTambah = new JButton("Tambah (+)"); // untuk membuat tombol "Tambah"
        class AddInterestListener1841720078Reza implements ActionListener 
        {
            @Override
            public void actionPerformed(ActionEvent event) 
            {
                int a = Integer.valueOf(mAField.getText()); // mengambil inputan textbox
                int b = Integer.valueOf(mBField.getText());
                int d = a + b;
                mDLabel.setText("Hasil Penambahan: " + d);
            }
        }
        ActionListener listener2 = new AddInterestListener1841720078Reza();
        mButtonTambah.addActionListener(listener2);
    }
    
    private void createPanelReza()
    {
        mPanel = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mButtonTambah);
        mPanel.add(mCLabel);
        mPanel.add(mDLabel);
        add(mPanel);
    }

    public static void main(String[] args)
    {
        // TODO code application logic here
        JFrame frame = new MyInputForm1841720078Reza();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
}
