package lab2.main_func;
import lab2.math_func.*;

import java.util.HashMap;



public class TrigFunc {
    private final HashMap<Double, Double> table;

    public TrigFunc() {
        table = new HashMap<>();
        table.put(-0.001, -9.9700549200989466 * Math.pow(10, 17));
        table.put(0.0, Double.NaN);
        table.put(-Math.PI / 4 - 0.001, -407939.0);
        table.put(-Math.PI / 4, 1.791264429374316E35);
        table.put(-Math.PI / 4 + 0.001, 377554.0);
        table.put(-Math.PI / 2 - 0.001, Math.pow(10, -9));
        table.put(-Math.PI / 2, 0.0);
        table.put(-Math.PI / 2 + 0.001, -Math.pow(10, -9));
        table.put(-Math.PI - 0.001, 1.00301 * Math.pow(10, 18));
        table.put(-Math.PI, Double.NaN);
        table.put(-2 * Math.PI, Double.NaN);
        table.put(-4 * Math.PI, Double.NaN);
        table.put(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
    }

    public static double calc(double x) {
        if(x == -Math.PI)
            return Double.NaN;
        if(x == Double.NEGATIVE_INFINITY)
            return Double.NaN;
        if (x > 0)
            return Double.NaN;
        if (x == 0)
            return Double.NaN;
        return Math.pow(((((Cot.calc(x) * Cot.calc(x)) + Sin.calc(x)) / (Tg.calc(x) - Cot.calc(x))) - (Cot.calc(x) * (Sin.calc(x) + Csc.calc(x)))), 3);
    }

    public double stub(double x){
        return table.get(x);
    }
}
