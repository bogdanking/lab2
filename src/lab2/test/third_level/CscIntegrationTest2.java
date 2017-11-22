package lab2.test.third_level;

import org.junit.Test;
import lab2.math_func.*;
import lab2.main_func.*;
import static org.junit.Assert.*;

public class CscIntegrationTest2 {
    Sin sin_func = new Sin();
    Tg tg_func = new Tg();
    TrigFunc tf = new TrigFunc();

    public double trigFuncCalc(double x) {
        return Math.pow(((((Cot.calc(x) * Cot.calc(x)) + sin_func.stub(x)) / (tg_func.stub(x) - Cot.calc(x))) - (Cot.calc(x) * (sin_func.stub(x) + Csc.calc(x)))), 3);
    }

    @Test
    public void test1() {
        assertEquals(tf.stub(-0.001), trigFuncCalc(-0.001), 1000);
    }

    @Test
    public void Test2() {
        assertEquals(tf.stub(0.0), trigFuncCalc(0.0), 0.001);
    }

    @Test
    public void Test3() {
        assertEquals(tf.stub(-Math.PI / 4 - 0.001), trigFuncCalc(-Math.PI / 4 - 0.001), 1000);
    }

    @Test
    public void Test4() {
        assertEquals(tf.stub(-Math.PI / 4), trigFuncCalc(-Math.PI / 4), 1000);
    }

    @Test
    public void Test5() {
        assertEquals(tf.stub(-Math.PI / 4 + 0.001), trigFuncCalc(-Math.PI / 4 + 0.001), 1000);
    }

    @Test
    public void Test6() {
        assertEquals(tf.stub(-Math.PI / 2 - 0.001), trigFuncCalc(-Math.PI / 2 - 0.001), 1000);
    }

    @Test
    public void Test7() {
        assertEquals(tf.stub(-Math.PI / 2), trigFuncCalc(-Math.PI / 2), 1000);
    }

    @Test
    public void Test8() {
        assertEquals(tf.stub(-Math.PI / 2 + 0.001), trigFuncCalc(-Math.PI / 2 + 0.001), 1000);
    }

    @Test
    public void Test9() {
        assertEquals(tf.stub(-2 * Math.PI), trigFuncCalc(-2 * Math.PI), 1000);
    }

    @Test
    public void Test10() {
        assertEquals(tf.stub(-4 * Math.PI), trigFuncCalc(-4 * Math.PI), 1000);
    }


}
