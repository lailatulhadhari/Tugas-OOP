public class Transaksi extends Kasir {
    @Override
    public double calculateTotal() {
        double total = 0;
        for (Produk product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}
