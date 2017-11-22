package lab2.math_func;

import java.util.HashMap;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.E;

public class Log2 {
    private final HashMap<Double, Double> table;

    public Log2() {
        table = new HashMap<>();
        table.put(-0.001, NaN);
        table.put(0.0, NEGATIVE_INFINITY);
        table.put(0.001, -9.965784284662087);
        table.put(0.999, -0.0014434168696687186);
        table.put(1.0, 0.0);
        table.put(1.001, 0.0014419741739063218);
        table.put(E - 0.001, 1.4421642053958204);
        table.put(E, 0.9102392266268373);
        table.put(E + 0.001, 0.9105740233462212);
        table.put(3.0, 1.0);
        table.put(4.3528834527188806919, 2.12197139287209);
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        table.put(NEGATIVE_INFINITY, NaN);
    }

    public static double calc(double x){
        double ln1 = Ln.calc(x, 0.0001);
        double ln2 = Ln.calc(2, 0.0001);
        double ln3 = ln1/ln2;
        return ln3;
    }

    public double stub(double x){
        return table.get(x);
    }
}
