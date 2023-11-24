public class Main {
    public static void main(String[] args) {
        // Membuat objek dari turunan pertama (Buku)
        Buku buku = new Buku("Pemrograman Java", "John Doe");
        buku.displayInfo();

        // Membuat objek dari turunan kedua (Jurnal)
        Jurnal jurnal = new Jurnal("Penelitian AI", "Jane Doe", "Springer");
        jurnal.displayInfo();

        // Membuat objek dari turunan ketiga (Majalah)
        Majalah majalah = new Majalah("National Geographic", "Editorial Team", "NatGeo", 2023);
        majalah.displayInfo();
    }
}
