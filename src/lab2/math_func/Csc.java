package lab2.math_func;
import java.util.HashMap;

import static java.lang.Double.*;
import static java.lang.Math.PI;


public class Csc {
    private final HashMap<Double, Double> table;

    public Csc() {
        table = new HashMap<>();
        table.put(-0.001, -1000.0001666666861);
        table.put(0.0, POSITIVE_INFINITY);
        table.put(0.001, 1000.0001666666861);
        table.put(-PI / 4 - 0.001, -1.4128014675416953);
        table.put(-PI / 4, -1.4142135623730951);
        table.put(-PI / 4 + 0.001, -1.4156298998518997);
        table.put(-PI / 2 - 0.001, 1.0000005000002083);
        table.put(-PI / 2, 0.9999999999999998);
        table.put(-PI / 2 + 0.001, 1.0000005000002083);
        table.put(-PI - 0.001, 1000.0001666664766);
        table.put(-PI, POSITIVE_INFINITY);
        table.put(-PI + 0.001, -1000.0001666670888);
        table.put(-2 * PI, POSITIVE_INFINITY);
        table.put(-4 * PI, POSITIVE_INFINITY);
        table.put(POSITIVE_INFINITY, NaN);
        table.put(NEGATIVE_INFINITY, NaN);
    }

    //sec=1/sqrt(1-sin(x)^2) csc = 1/sin(x)
    public static double calc (double x) {
        double cosecans=0;

        if(x == PI){
            return POSITIVE_INFINITY;
        }

        if(x == -PI){
            return NEGATIVE_INFINITY;
        }

        if(x == 0){
            return NaN;
        }

        if (x > -PI && x < 0){
            cosecans = -1 / (lab2.math_func.Sin.calc(x));
        }
        if(x > 0 && x < PI);
        {
            cosecans = 1 / (lab2.math_func.Sin.calc(x));
        }
        return cosecans;
    }
    public double stub(double x){
        return table.get(x);
    }
}