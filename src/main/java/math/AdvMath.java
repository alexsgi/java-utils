package math;

public class AdvMath {

    public static double sum(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double product(double... numbers) {
        int product = 1;
        for (double number : numbers) {
            product *= number;
        }
        return product;
    }

}
