package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Alexander Sagorski
 * @version 1.0
 * @since 1.0
 */
public class AdvMath {

    public static final double E = Math.E;
    public static final double PI = Math.PI;
    private static double xPre = Math.random() % 10;
    private static double eps = 0.001;
    private static double delX = 2147483647;
    private static double xK = 0.0;
    private AdvMath() {
    }

    public static double sum(double... summands) {
        double sum = 0;
        for (double summand : summands) {
            sum += summand;
        }
        return sum;
    }

    public static double difference(double minuend, double... subtrahends) {
        for (double subtrahend : subtrahends) {
            minuend -= subtrahend;
        }
        return minuend;
    }

    public static double product(double... factors) {
        int product = 1;
        for (double factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double quotient(double dividend, double... divisors) {
        for (double divisor : divisors) {
            dividend /= divisor;
        }
        return dividend;
    }

    public static BigDecimal bigSum(BigDecimal... summands) {
        BigDecimal sum = new BigDecimal(0);
        for (BigDecimal summand : summands) {
            sum = sum.add(summand);
        }
        return sum;
    }

    public static BigDecimal bigDifference(BigDecimal minuend, BigDecimal... subtrahents) {
        for (BigDecimal subtrahent : subtrahents) {
            minuend = minuend.subtract(subtrahent);
        }
        return minuend;
    }

    public static BigDecimal bigProduct(BigDecimal... factors) {
        BigDecimal product = new BigDecimal(1);
        for (BigDecimal factor : factors) {
            product = product.multiply(factor);
        }
        return product;
    }

    public static BigDecimal bigQuotient(BigDecimal dividend, BigDecimal... divisors) {
        for (BigDecimal divisor : divisors) {
            dividend = dividend.divide(divisor, RoundingMode.HALF_UP);
        }
        return dividend;
    }

    public static double sin(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static double asin(double a) {
        return Math.asin(a);
    }

    public static double acos(double a) {
        return Math.acos(a);
    }

    public static double atan(double a) {
        return Math.atan(a);
    }

    public static double exp(double a) {
        return Math.exp(a);
    }

    public static double log(double a) {
        return Math.log(a);
    }

    public static double log10(double a) {
        return Math.log10(a);
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double nthRoot(int radikand, int root) {
        while (delX > eps) {
            xK = ((root - 1.0) * xPre +
                    (double) radikand / Math.pow(xPre, root - 1)) / (double) root;
            delX = Math.abs(xK - xPre);
            xPre = xK;
        }
        return Math.round(xK * 1000) / 1000;
    }

    public static double nthRootNonRounded(int radikand, int root) {
        while (delX > eps) {
            xK = ((root - 1.0) * xPre +
                    (double) radikand / Math.pow(xPre, root - 1)) / (double) root;
            delX = Math.abs(xK - xPre);
            xPre = xK;
        }
        return xK;
    }

}
