public abstract class Barang {
    protected String nama;
    protected int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void deskripsi();

    public void infoBarang() {
        System.out.println("Barang: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}
