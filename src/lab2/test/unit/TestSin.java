package lab2.test.unit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSin {


    @Test
    public void test1(){ assertEquals(0.009, lab2.math_func.Sin.calc(0.01), 0.001); }
    @Test
    public void test2(){ assertEquals(-0.009, lab2.math_func.Sin.calc(-0.01), 0.001); }
    //Sin = PI/2


    @Test
    public void test3(){
        assertEquals(-0.009, lab2.math_func.Sin.calc(Math.PI + 0.01), 0.001);
    }
    @Test
    public void test4(){
        assertEquals(0.009, lab2.math_func.Sin.calc(Math.PI - 0.01), 0.001);
    }
    //Sin=-PI
    @Test
    public void test5(){
        assertEquals(-0.009, lab2.math_func.Sin.calc(-Math.PI + 0.01), 0.001);
    }
    @Test
    public void test6(){
        assertEquals(0.009, lab2.math_func.Sin.calc(-Math.PI - 0.01), 0.001);
    }
    //Sin=-PI/2


    @Test
    public void test7(){
        assertEquals(-0.99, lab2.math_func.Sin.calc(-Math.PI/2 - 0.01), 0.1);
    }
    //Sin=3*PI/2

    @Test

    public void test8(){ assertEquals(-0.99, lab2.math_func.Sin.calc(3*Math.PI/2 + 0.01), 0.01); }
    @Test
    public void test9(){ assertEquals(-0.99, lab2.math_func.Sin.calc(3*Math.PI/2 - 0.01), 0.01); }
    //Sin=-3*PI/2


}