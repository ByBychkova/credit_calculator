public class Main {
    public static void main(String[] args) {

        W service = new W();
        double i = 0.099_9 / 12 / 100;

        double a1 = 1 + i;
        int n1 = 12;
        System.out.printf("Число a1 в 12 степени равно %.0f \n", Math.pow(a1, n1));
        // коэффициент аннуитета;
        double k = (i * (Math.pow(a1, n1))) / ((Math.pow(a1, n1)) - 1);

        int s = 1_000_000;

        System.out.println(k);

        double a = service.calculate(0.08337843396539649, 1_000_000);
        System.out.println(a);
    }
}