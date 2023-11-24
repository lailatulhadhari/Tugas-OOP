public class TokoApp {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 5000);
        Sayuran bayam = new Sayuran("Bayam", 3000);

        apel.infoBarang();
        apel.deskripsi();
        System.out.println("Total Harga: Rp " + apel.hitungHarga());

        System.out.println();

        bayam.infoBarang();
        bayam.deskripsi();
        System.out.println("Total Harga: Rp " + bayam.hitungHarga());
    }
}
