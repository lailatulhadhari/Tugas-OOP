public class MainApp {
    public static void main(String[] args) {
        // Pemesanan tiket ekonomi
        TiketEkonomi tiketEkonomi = new TiketEkonomi("John Doe", 150000, "Ekonomi AC");
        tiketEkonomi.displayInfo();

        System.out.println();

        // Pemesanan tiket eksekutif
        TiketEksekutif tiketEksekutif = new TiketEksekutif("Jane Smith", 300000, "Tempat duduk yang nyaman");
        tiketEksekutif.displayInfo();
    }
}
