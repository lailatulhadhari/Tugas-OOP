abstract class PenyewaanBarang {
    protected String nama;
    protected int harga;

    // Konstruktor
    public PenyewaanBarang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void hitungBiaya(int lamaSewa);
}