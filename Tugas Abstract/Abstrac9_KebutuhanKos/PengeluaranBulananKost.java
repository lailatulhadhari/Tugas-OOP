public abstract class PengeluaranBulananKost {
    protected String jenisPengeluaran;
    protected int jumlah;

    public PengeluaranBulananKost(String jenisPengeluaran, int jumlah) {
        this.jenisPengeluaran = jenisPengeluaran;
        this.jumlah = jumlah;
    }

    public abstract void displayInfo();
}
