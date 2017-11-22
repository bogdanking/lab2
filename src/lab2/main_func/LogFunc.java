package lab2.main_func;
import lab2.math_func.*;

public class LogFunc {
    public static double calc(double x)
    {
        return ((Math.pow(((Log5.calc(x) + Log3.calc(x)) * Ln.calc(x, 0.0001)), 3) * (Log5.calc(x) * (Ln.calc(x, 0.0001) * Ln.calc(x, 0.0001)))) * Log3.calc(x));
    }

}
