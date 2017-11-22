package lab2.test.second_level;

import org.junit.Test;
import lab2.math_func.*;
import lab2.main_func.*;
import static org.junit.Assert.*;

public class TgIntegrationTest {
    Csc csc_func = new Csc();
    Sin sin_func = new Sin();
    Cot cot_func = new Cot();
    TrigFunc tf = new TrigFunc();

    public double trigFuncCalc(double x) {
        return Math.pow(((((cot_func.stub(x) * cot_func.stub(x)) + sin_func.stub(x)) / (Tg.calc(x) - cot_func.stub(x))) - (cot_func.stub(x) * (sin_func.stub(x) + csc_func.stub(x)))), 3);
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
        assertEquals(tf.stub(-Math.PI / 4 + 0.001), trigFuncCalc(-Math.PI / 4 + 0.001), 1000);
    }

    @Test
    public void Test5() {
        assertEquals(tf.stub(-Math.PI / 2 - 0.001), trigFuncCalc(-Math.PI / 2 - 0.001), 1000);
    }

    @Test
    public void Test6() {
        assertEquals(tf.stub(-Math.PI / 2), trigFuncCalc(-Math.PI / 2), 1000);
    }

    @Test
    public void Test7() {
        assertEquals(tf.stub(-Math.PI / 2 + 0.001), trigFuncCalc(-Math.PI / 2 + 0.001), 1000);
    }

    @Test
    public void Test8() {
        assertEquals(tf.stub(-Math.PI), trigFuncCalc(-Math.PI), 1000);
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
