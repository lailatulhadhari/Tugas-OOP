class RumahSakitGigi extends RumahSakit {
    private int jumlahDokterGigi;

    // Konstruktor
    public RumahSakitGigi(String nama, String alamat, int jumlahDokterGigi) {
        super(nama, alamat);
        this.jumlahDokterGigi = jumlahDokterGigi;
    }

    // Implementasi metode abstrak
    @Override
    public void layanan() {
        System.out.println("Rumah Sakit Gigi - Menyediakan layanan gigi dengan " + jumlahDokterGigi + " dokter gigi.");
    }
}