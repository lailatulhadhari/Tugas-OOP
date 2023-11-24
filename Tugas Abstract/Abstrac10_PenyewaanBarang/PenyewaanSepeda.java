class PenyewaanSepeda extends PenyewaanBarang {
    private int jumlahSepeda;

    // Konstruktor
    public PenyewaanSepeda(String nama, int harga, int jumlahSepeda) {
        super(nama, harga);
        this.jumlahSepeda = jumlahSepeda;
    }

    // Implementasi metode abstrak
    @Override
    public void hitungBiaya(int lamaSewa) {
        int totalBiaya = harga * lamaSewa * jumlahSepeda;
        System.out.println("Biaya sewa sepeda " + nama + " selama " + lamaSewa + " hari: Rp " + totalBiaya);
    }
}