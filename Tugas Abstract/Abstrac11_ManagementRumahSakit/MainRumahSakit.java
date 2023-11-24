public class MainRumahSakit {
    public static void main(String[] args) {
        // Membuat objek RumahSakitUmum
        RumahSakitUmum rumahSakitUmum = new RumahSakitUmum("RS Umum Sejahtera", "Jl. Kesehatan No. 1", 10);
        rumahSakitUmum.layanan();

        System.out.println(); // Spasi antar output

        // Membuat objek RumahSakitGigi
        RumahSakitGigi rumahSakitGigi = new RumahSakitGigi("RS Gigi Cemerlang", "Jl. Gigi Indah No. 5", 5);
        rumahSakitGigi.layanan();
    }
}