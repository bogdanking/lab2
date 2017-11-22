package lab2.math_func;
import java.util.HashMap;

import static java.lang.Double.*;
import static java.lang.Math.PI;

public class Tg
{
    private final HashMap<Double, Double> table;

    public Tg() {
        table = new HashMap<>();
        table.put(-0.001, -0.0010000003333334668);
        table.put(0.0, 0.0);
        table.put(0.001, 0.0010000003333334668);
        table.put(-PI / 4 - 0.001, -1.0020020026700043);
        table.put(-PI / 4, -1.0);
        table.put(-PI / 4 + 0.001, -0.9980019973366625);
        table.put(-PI / 2 - 0.001, 999.999666666435);
        table.put(-PI / 2, POSITIVE_INFINITY);
        table.put(-PI / 2 + 0.001, -999.9996666670471);
        table.put(-PI - 0.001, -0.0010000003333336773);
        table.put(-PI, 0.0);
        table.put(-PI + 0.001, 0.0010000003333330643);
        table.put(-2 * PI, 0.0);
        table.put(-4 * PI, 0.0);
        table.put(POSITIVE_INFINITY, NaN);
        table.put(NEGATIVE_INFINITY, NaN);
    }

    public static double calc(double x) {
        while (x < -PI / 2) {
            x += PI;
        }
        while (x > Math.PI / 2) {
            x -= PI;
        }
        if (x == PI / 2)
            return POSITIVE_INFINITY;
        if (x == -PI / 2)
            return NEGATIVE_INFINITY;
        double tangent = lab2.math_func.Sin.calc(x) / (Math.sqrt(1 - Math.pow(lab2.math_func.Sin.calc(x), 2))); //tg=sin(x)/sqrt(1-sin(x)^2)
        return tangent;
    }

    public double stub(double x) {
        return table.get(x);
    }
}
