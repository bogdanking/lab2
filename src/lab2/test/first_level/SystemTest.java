package lab2.test.first_level;

import org.junit.Test;
import lab2.math_func.*;
import lab2.main_func.*;

import static org.junit.Assert.*;

public class SystemTest {
    TrigFunc tf = new TrigFunc();

    @Test
    public void test1() {
        assertEquals(tf.calc(-Math.PI), tf.stub(-Math.PI), 0.001);
    }
    @Test
    public void test2() {
        assertEquals(tf.calc(-Math.PI / 2), tf.stub(-Math.PI / 2), 0.001);
    }
    @Test
    public void test3() {
        assertEquals(tf.calc(-Math.PI / 2 + 0.001), tf.stub(-Math.PI / 2 + 0.001), 0.001);
    }
    @Test
    public void test4() {
        assertEquals(tf.calc(-Math.PI / 2 - 0.001), tf.stub(-Math.PI / 2 - 0.001), 0.001);
    }
}