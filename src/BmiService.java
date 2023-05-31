public class W {

    public int calculate(double sum, double proc, double term) {

        double mps = proc / 12 / 100;  //месячная проц ставка
        double result = mps * Math.pow((1 + mps), term) / (Math.pow((1 + mps), term) - 1);

        result = result * sum;
        return (int) result;

    }
}