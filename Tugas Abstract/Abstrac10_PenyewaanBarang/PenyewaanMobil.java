class PenyewaanMobil extends PenyewaanBarang {
    private int kapasitasPenumpang;

    // Konstruktor
    public PenyewaanMobil(String nama, int harga, int kapasitasPenumpang) {
        super(nama, harga);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Implementasi metode abstrak
    @Override
    public void hitungBiaya(int lamaSewa) {
        int totalBiaya = harga * lamaSewa;
        System.out.println("Biaya sewa mobil " + nama + " selama " + lamaSewa + " hari: Rp " + totalBiaya);
    }
}