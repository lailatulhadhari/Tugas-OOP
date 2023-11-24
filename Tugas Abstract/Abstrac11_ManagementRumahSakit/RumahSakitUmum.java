class RumahSakitUmum extends RumahSakit {
    private int jumlahDokter;

    // Konstruktor
    public RumahSakitUmum(String nama, String alamat, int jumlahDokter) {
        super(nama, alamat);
        this.jumlahDokter = jumlahDokter;
    }

    // Implementasi metode abstrak
    @Override
    public void layanan() {
        System.out.println("Rumah Sakit Umum - Menyediakan layanan umum dengan " + jumlahDokter + " dokter.");
    }
}
