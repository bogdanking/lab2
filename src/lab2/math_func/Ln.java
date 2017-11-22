package lab2.math_func;

import java.util.HashMap;

import static java.lang.Double.*;
import static java.lang.Math.E;


public class Ln {
    private final HashMap<Double, Double> table;
    public Ln() {
        table = new HashMap<>();
        table.put(-0.001, NaN);
        table.put(0.0, NEGATIVE_INFINITY);
        table.put(0.001, -6.9077552789811385);
        table.put(0.999, -0.0010005003335835344);
        table.put(1.0, 0.0);
        table.put(1.001, 9.99500333083423E-4);
        table.put(E - 0.001, 0.9996320528745853);
        table.put(E, 1.0);
        table.put(E + 0.001, 1.0003678117901198);
        table.put(3.0, 1.0986122886681073);
        table.put(4.3528834527188806919, 1.4708384881981464);
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        table.put(NEGATIVE_INFINITY, NaN);

    }

    public static double calc(double a, double checker) {
        if (Math.abs(a) < checker) return NEGATIVE_INFINITY;
        if (a < 0) return NaN;
        if (!(a < POSITIVE_INFINITY)) return a;
        if (a == 1) return 0;
        double result = 0;
        double member = 1;
        double tmp;
        if (Math.abs(a) < 1) {
            a -= 1;
            tmp = -1;
            for (int i = 1; Math.abs(member) > checker; i++) {
                tmp = tmp * a * (-1);
                member = tmp / i;
                result += member;
            }
        } else {
            a = (a / (a - 1));
            tmp = 1;
            for (int i = 1; Math.abs(member) > checker; i++) {
                tmp *= a;
                member = 1 / (tmp * i);
                result += member;
            }
        }
        return result;
    }

    public double stub(double x){
        return table.get(x);
    }

}
