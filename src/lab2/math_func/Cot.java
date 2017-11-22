package lab2.math_func;

import java.util.HashMap;

public class Cot {

    private final HashMap<Double, Double> table;

    public Cot() {
        table = new HashMap<>();
        table.put(-0.001, -999.9996666666444);
        table.put(0.0, Double.POSITIVE_INFINITY);
        table.put(0.001, 999.9996666666444);
        table.put(-Math.PI / 4 - 0.001, -0.9980019973366625);
        table.put(-Math.PI / 4, -1.0);
        table.put(-Math.PI / 4 + 0.001, -1.0020020026700043);
        table.put(-Math.PI / 2 - 0.001, 0.0010000003333336762);
        table.put(-Math.PI / 2, 0.0);
        table.put(-Math.PI / 2 + 0.001, -0.001000000333333064);
        table.put(-Math.PI - 0.001, -999.9996666664339);
        table.put(-Math.PI, Double.NEGATIVE_INFINITY);
        table.put(-Math.PI + 0.001, 999.9996666670469);
        table.put(-2 * Math.PI, Double.POSITIVE_INFINITY);
        table.put(-4 * Math.PI, Double.POSITIVE_INFINITY);
        table.put(Double.POSITIVE_INFINITY, Double.NaN);
        table.put(Double.NEGATIVE_INFINITY, Double.NaN);
    }
    public static double calc(double x) {

        double cotangent = (Math.sqrt(1 - Math.pow(lab2.math_func.Sin.calc(x), 2))) / lab2.math_func.Sin.calc(x); //ctg=sqrt(1-sin(x)^2)/sin(x)

        return cotangent;
    }

    public double stub(double x){
        return table.get(x);
    }
}