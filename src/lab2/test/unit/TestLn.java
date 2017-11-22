package lab2.test.unit;

import lab2.math_func.Ln;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLn {
    @Test
    public void test0(){  assertEquals(Double.NEGATIVE_INFINITY, Ln.calc(0, 0.0001), 0.001); }
    @Test
    public void test01(){  assertEquals(Double.NaN, Ln.calc(-0.001, 0.0001), 0.001); }

    @Test
    public void test1(){ assertEquals(0, Ln.calc(1, 0.0001), 0.001); }
    @Test
    public void test11()
    {
        assertEquals(0.0009, Ln.calc(1.001, 0.0001), 0.001);
    }
    @Test
    public void test12(){ assertEquals(-0.001, Ln.calc(0.999, 0.0001), 0.001);}

    @Test
    public void test2(){ assertEquals(1.000367, Ln.calc(Math.E + 0.001, 0.0001), 0.001); }
    @Test
    public void test21(){ assertEquals(0.99963, Ln.calc(Math.E - 0.001, 0.0001), 0.001); }
    @Test
    public void test22(){ assertEquals(1, Ln.calc(Math.E, 0.0001), 0.001); }

    @Test
    public void test3(){ assertEquals(Double.POSITIVE_INFINITY, Ln.calc(Double.POSITIVE_INFINITY, 0.0001), 0.001); }
    @Test
    public void test31(){ assertEquals(Double.POSITIVE_INFINITY + 0.01, Ln.calc(Double.POSITIVE_INFINITY + 0.01, 0.0001), 0.001); }
    @Test
    public void test32(){ assertEquals(Double.POSITIVE_INFINITY - 0.01, Ln.calc(Double.POSITIVE_INFINITY - 0.01, 0.0001), 0.001); }

    @Test
    public void test4(){ assertEquals(Double.NaN, Ln.calc(Double.NEGATIVE_INFINITY, 0.0001), 0.001); }
    @Test
    public void test41(){ assertEquals(Double.NaN, Ln.calc(Double.NEGATIVE_INFINITY + 0.01, 0.0001), 0.001); }
    @Test
    public void test42(){ assertEquals(Double.NaN, Ln.calc(Double.NEGATIVE_INFINITY - 0.01, 0.0001), 0.001); }
}