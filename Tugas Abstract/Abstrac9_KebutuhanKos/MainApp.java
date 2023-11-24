public class MainApp {
    public static void main(String[] args) {
        // Pengeluaran listrik
        PengeluaranListrik pengeluaranListrik = new PengeluaranListrik("Listrik", 500, "Tagihan bulan ini");
        pengeluaranListrik.displayInfo();

        System.out.println();

        // Pengeluaran air
        PengeluaranAir pengeluaranAir = new PengeluaranAir("Air", 300, "Tagihan bulan ini");
        pengeluaranAir.displayInfo();
    }
}
