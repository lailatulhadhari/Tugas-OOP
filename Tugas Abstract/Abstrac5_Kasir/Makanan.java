public class Makanan extends Item {
    private int expirationDays;

    public Makanan(String name, double price, int expirationDays) {
        super(name, price);
        this.expirationDays = expirationDays;
    }

    public int getExpirationDays() {
        return expirationDays;
    }
}
