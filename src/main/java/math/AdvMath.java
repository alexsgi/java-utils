package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AdvMath {

    public static double sum(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double difference(double value, double... numbers) {
        for (double number : numbers) {
            value -= number;
        }
        return value;
    }

    public static double product(double... numbers) {
        int product = 1;
        for (double number : numbers) {
            product *= number;
        }
        return product;
    }

    public static double quotient(double value, double... numbers) {
        for (double number : numbers) {
            value /= number;
        }
        return value;
    }

    public static BigDecimal bigSum(BigDecimal... numbers) {
        BigDecimal sum = new BigDecimal(0);
        for (BigDecimal number : numbers) {
            sum = sum.add(number);
        }
        return sum;
    }

    public static BigDecimal bigDifference(BigDecimal value, BigDecimal... numbers) {
        for (BigDecimal number : numbers) {
            value = value.subtract(number);
        }
        return value;
    }

    public static BigDecimal bigProduct(BigDecimal... numbers) {
        BigDecimal product = new BigDecimal(1);
        for (BigDecimal number : numbers) {
            product = product.multiply(number);
        }
        return product;
    }

    public static BigDecimal bigQuotient(BigDecimal value, BigDecimal... numbers) {
        for (BigDecimal number : numbers) {
            value = value.divide(number, RoundingMode.HALF_UP);
        }
        return value;
    }

}
