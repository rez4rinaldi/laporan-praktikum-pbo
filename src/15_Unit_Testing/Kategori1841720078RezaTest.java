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
public class Kategori1841720078RezaTest extends TestCase {

    Kategori1841720078Reza instance;

    public Kategori1841720078RezaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720078Reza("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchReza method, of class Kategori1841720078Reza.
     */
    @Test
    public void testSearchReza() {
        System.out.println("save test");
        this.instance.saveReza();
        ArrayList<Kategori1841720078Reza> expResult = instance.getByNamaAndKeteranganReza(instance.getNamaReza(), instance.getKeteranganReza());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveReza method, of class Kategori1841720078Reza.
     */
    @Test
    public void testSaveReza() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720078Reza> result = instance.searchReza(keyword);
        ArrayList<Kategori1841720078Reza> expResult = instance.getByNamaAndKeteranganReza(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
