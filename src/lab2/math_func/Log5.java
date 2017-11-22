package lab2.math_func;

import java.util.HashMap;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.E;


public class Log5 {
    private final HashMap<Double, Double> table;

    public Log5() {
        table = new HashMap<>();
        table.put(-0.001, NaN);
        table.put(0.0, NEGATIVE_INFINITY);
        table.put(0.001, -4.29202967422018);
        table.put(0.999, -0.0006216458092939952);
        table.put(1.0, 0.0);
        table.put(1.001, 0.000621024474048699);
        table.put(E - 0.001, 0.6211063161565218);
        table.put(E, 0.6213349345596119);
        table.put(E + 0.001, 0.6215634688741569);
        table.put(3.0, 1.0);
        table.put(4.3528834527188806919, 0.9138833358123553);
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        table.put(NEGATIVE_INFINITY, NaN);
    }
    public static double calc(double x){
        return Ln.calc(x,0.0001)/Ln.calc(5, 0.0001);
    }
    public double stubb(double x){ return table.get(x); }
}
