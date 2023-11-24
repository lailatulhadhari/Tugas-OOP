public class Main {
    public static void main(String[] args) {
        Kasir transactionCashier = new Transaksi();

        Produk product1 = new Barang("Produk 1", 25000);
        Produk product2 = new Makanan("makanan 1", 12000, 7);

        transactionCashier.addToCart(product1);
        transactionCashier.addToCart(product2);
        transactionCashier.displayCart();

        double total = transactionCashier.calculateTotal();
        System.out.println("Total: Rp" + total);
    }
}
