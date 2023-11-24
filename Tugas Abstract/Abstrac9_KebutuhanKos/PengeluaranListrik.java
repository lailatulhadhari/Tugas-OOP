public class PengeluaranListrik extends PengeluaranBulananKost {
    private String keterangan;

    public PengeluaranListrik(String jenisPengeluaran, int jumlah, String keterangan) {
        super(jenisPengeluaran, jumlah);
        this.keterangan = keterangan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pengeluaran listrik untuk kost:");
        System.out.println("Jumlah: " + jumlah + " KWh");
        System.out.println("Keterangan: " + keterangan);
    }
}
