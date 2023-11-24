abstract class RumahSakit {
    protected String nama;
    protected String alamat;

    // Konstruktor
    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void layanan();
}