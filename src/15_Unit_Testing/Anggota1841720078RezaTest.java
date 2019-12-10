package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Reza R
 */
public class Anggota1841720078RezaTest extends TestCase {

    Anggota1841720078Reza instance;

    public Anggota1841720078RezaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720078Reza("Reza", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchReza method, of class Anggota1841720078Reza.
     */
    @Test
    public void testSearchReza() {
        System.out.println("save test");
        this.instance.saveReza();
        ArrayList<Anggota1841720078Reza> expResult = instance.getByNamaAndAlamatAndTeleponReza(instance.getNamaReza(), instance.getAlamatReza(), instance.getTeleponReza());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveReza method, of class Anggota1841720078Reza.
     */
    @Test
    public void testSaveReza() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720078Reza> result = instance.searchReza(keyword);
        ArrayList<Anggota1841720078Reza> expResult = instance.getByNamaAndAlamatAndTeleponReza(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
