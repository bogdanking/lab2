package lab2.math_func;

import java.util.HashMap;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static java.lang.Math.*;

public class Sin {
    private final HashMap<Double, Double> table;

    public Sin()
    {
        table = new HashMap<>();
        table.put(-0.001, -9.999998333333417E-4);
        table.put(0.0, 0.0);
        table.put(0.001, 9.999998333333417E-4);
        table.put(-PI / 4 - 0.001, -0.7078135342965217);
        table.put(-PI / 4, -0.7071067811865475);
        table.put(-PI / 4 + 0.001, -0.7063993209698509);
        table.put(-PI / 2 - 0.001, 0.9999995000000417);
        table.put(-PI / 2, 1.0);
        table.put(-PI / 2 + 0.001, 0.9999995000000417);
        table.put(-PI - 0.001, 9.999998333335511E-4);
        table.put(-PI, 0.0);
        table.put(-PI + 0.001, -9.99999833332939E-4);
        table.put(-2 * PI, 0.0);
        table.put(-4 * PI, 0.0);
        table.put(POSITIVE_INFINITY, NaN);
        table.put(NEGATIVE_INFINITY, NaN);
    }

    public static double calc(double x) {
        while (x < -PI) {
            x += 2 * PI;
        }

        while (x > PI) {
            x -= 2 * PI;
        }

        return x - (Math.pow(x, 3) / 6)
                + (pow(x, 5) /120)
                - (pow(x, 7) / 5040)
                + (pow(x, 9) / 362880)
                - (pow(x, 11) / 39916800)
                + (pow(x, 13) / 6227020800L)
                - (pow(x, 15) / 130767436800L)
                + (pow(x, 17) / 355687428096000L)
                - (pow(x, 19) / 121645100408832000L);
    }

    public double stub(double x){
        return table.get(x);
    }
}
