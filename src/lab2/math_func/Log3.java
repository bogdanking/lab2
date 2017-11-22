package lab2.math_func;

import java.util.HashMap;

import static java.lang.Double.*;
import static java.lang.Math.E;

public class Log3 {
    private final HashMap<Double, Double> table;

    public Log3() {
        table = new HashMap<>();
        table.put(-0.001, NaN);
        table.put(0.0, NEGATIVE_INFINITY);
        table.put(0.001, -6.287709822867258);
        table.put(0.999, -9.106946498809711E-4);
        table.put(1.0, 0.0);
        table.put(1.001, 9.097844101991232E-4);
        table.put(E - 0.001, 0.9099043067199624);
        table.put(E, 0.9102392266268382);
        table.put(E + 0.001, 0.9105740233462222);
        table.put(3.0, 1.0);
        table.put(4.3528834527188806919, 1.3388148879904704);
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        table.put(NEGATIVE_INFINITY, NaN);
    }


    public static double calc(double x) {
        double ln1 = Ln.calc(x, 0.0001);
        double ln2 = Ln.calc(3,0.0001);
        double ln3 = ln1 / ln2;
        return ln3;
    }

    public double stub(double x){
        return table.get(x);
    }
}