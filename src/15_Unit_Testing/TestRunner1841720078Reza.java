package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Kategori1841720078RezaTest;
import unittest.database.Anggota1841720078RezaTest;

/**
 *
 * @author Reza R
 */
public class TestRunner1841720078Reza {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720078Reza.class);
        showMessageResultReza(mResult, MessageProcessorTest1841720078Reza.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720078RezaTest.class);
        showMessageResultReza(mResult, Kategori1841720078RezaTest.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Anggota1841720078RezaTest.class);
        showMessageResultReza(mResult, Anggota1841720078RezaTest.class.getSimpleName());
    }

    private static void showMessageResultReza(Result mResult, String mClassName) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", mClassName, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
