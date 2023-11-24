public class MainPenyewaan {
    public static void main(String[] args) {
        // Membuat objek PenyewaanMobil
        PenyewaanMobil mobilSewa = new PenyewaanMobil("Avanza", 200000, 5);
        mobilSewa.hitungBiaya(3);

        System.out.println(); // Spasi antar output

        // Membuat objek PenyewaanSepeda
        PenyewaanSepeda sepedaSewa = new PenyewaanSepeda("Polygon", 50000, 2);
        sepedaSewa.hitungBiaya(2);
    }
}