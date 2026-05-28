public class Main {

    public static void main(String[] args) {

        Currency usd = new Currency("USD", 1.0);
        Currency eur = new Currency("EUR", 0.92);
        Currency inr = new Currency("INR", 83.20);

        CurrencyConverter converter =
                new CurrencyConverter(100, usd, inr);

        double result = converter.convert();

        Transactions transaction =
                new Transactions(result, inr.getCode());

        System.out.println("Currency Converter");
        System.out.println("-------------------");

        System.out.println("From Currency: " +
                usd.getCode());

        System.out.println("To Currency: " +
                inr.getCode());

        System.out.println("Amount: " +
                converter.getAmount());

        System.out.println("Converted Amount: " +
                result);

        System.out.println(transaction);
    }
}
