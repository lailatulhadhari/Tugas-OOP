public class Buah extends Barang implements Penjualan {

    public Buah(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void deskripsi() {
        System.out.println("Ini adalah buah segar: " + nama);
    }

    @Override
    public int hitungHarga() {
        return harga;
    }
}
