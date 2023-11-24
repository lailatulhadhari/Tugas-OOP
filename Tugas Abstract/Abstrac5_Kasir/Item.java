public abstract class Item implements Produk {
    private String nama;
    private double harga;

    public Item(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String getName() {
        return nama;
    }

    @Override
    public double getPrice() {
        return harga;
    }
}
