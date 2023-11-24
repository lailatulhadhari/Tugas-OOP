public class Sayuran extends Barang implements Penjualan {

    public Sayuran(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sayuran segar: " + nama);
    }

    @Override
    public int hitungHarga() {
        return harga;
    }
}
