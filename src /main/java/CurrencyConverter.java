public class CurrencyConverter {

    private double amount;
    private Currency fromCurrency;
    private Currency toCurrency;

    public CurrencyConverter(double amount,
                             Currency fromCurrency,
                             Currency toCurrency) {

        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public double convert() {

        return amount * toCurrency.getRate();
    }

    public double getAmount() {
        return amount;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    @Override
    public String toString() {
        return "{amount:" + amount +
                ", fromCurrency:" + fromCurrency.getCode() +
                ", toCurrency:" + toCurrency.getCode() + "}";
    }
}
