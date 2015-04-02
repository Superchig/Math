package generic.tests;

import generic.Factors;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Chiggie on 4/1/2015.
 */
public class FactorsTests {

    @Test
    public void getGcdTest() {

        org.junit.Assert.assertEquals(10, Factors.getGCF(30, 100));

    }

    @Test
    public void GetFactorsTest() {

        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(6);
        expected.add(10);
        expected.add(15);
        expected.add(30);

        org.junit.Assert.assertEquals(expected, Factors.getFactors(30));

    }

}
