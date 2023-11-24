public abstract class Karyawan {
    protected String nama;
    protected String idKaryawan;
    protected double gaji;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    public abstract void hitungGaji();

    public void tampilkanInformasi() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp" + gaji);
    }
}
