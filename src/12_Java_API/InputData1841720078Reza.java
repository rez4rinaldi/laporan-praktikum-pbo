package percobaan4;

import java.util.ArrayList;

/**
 *
 * @author Reza Rinaldi
 */
public class InputData1841720078Reza 
{   
    ArrayList<Mahasiswa1841720078Reza> ListMahasiswa;

    public InputData1841720078Reza() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataReza (String mNim, String mNama, String mAlamat)
    {
        Mahasiswa1841720078Reza mhs = new Mahasiswa1841720078Reza(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720078Reza> getDataReza()
    {
        return ListMahasiswa;
    }
}
