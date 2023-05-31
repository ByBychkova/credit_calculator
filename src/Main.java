public class Main {
    public static void main(String[] args) {

        CreditPayment service = new CreditPayment();

        int result = service.calculate(1_000_000, 9.99, 12);
        System.out.println((result) + " Ежемесячный платеж со сроком кредита 1 год");

        int result1 = service.calculate(1_000_000, 9.99, 24);
        System.out.println((result1) + " Ежемесячный платеж со сроком кредита 2 года");

        int result2 = service.calculate(1_000_000, 9.99, 36);
        System.out.println((result2) + " Ежемесячный платеж со сроком кредита 3 года");
    }


}