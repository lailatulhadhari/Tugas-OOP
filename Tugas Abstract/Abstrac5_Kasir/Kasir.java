import java.util.ArrayList;

// Abstract class untuk Kasir
public abstract class Kasir {
    protected ArrayList<Produk> cart;

    public Kasir() {
        cart = new ArrayList<>();
    }

    public void addToCart(Produk product) {
        cart.add(product);
    }

    public void removeFromCart(Produk product) {
        cart.remove(product);
    }

    public void displayCart() {
        System.out.println("Keranjang:");
        for (Produk product : cart) {
            System.out.println(product.getName() + " - Rp" + product.getPrice());
        }
    }

    public abstract double calculateTotal();
}
