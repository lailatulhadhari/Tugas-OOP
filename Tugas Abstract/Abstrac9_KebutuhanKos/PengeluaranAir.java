public class PengeluaranAir extends PengeluaranBulananKost {
    private String periode;

    public PengeluaranAir(String jenisPengeluaran, int jumlah, String periode) {
        super(jenisPengeluaran, jumlah);
        this.periode = periode;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pengeluaran air untuk kost:");
        System.out.println("Jumlah: " + jumlah + " Liter");
        System.out.println("Periode: " + periode);
    }
}
