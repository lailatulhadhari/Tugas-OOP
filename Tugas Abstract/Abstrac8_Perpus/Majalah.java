public class Majalah extends Jurnal {
    private int edisi;

    // Konstruktor
    public Majalah(String judul, String pengarang, String penerbit, int edisi) {
        super(judul, pengarang, penerbit);
        this.edisi = edisi;
    }

    // Override metode displayInfo jika diperlukan
    @Override
    public void displayInfo() {
        // Menggunakan metode getPengarang untuk mengakses atribut pengarang dari kelas turunan
        System.out.println("Majalah - Judul: " + judul + ", Pengarang: " + getPengarang() + ", Penerbit: " + getPenerbit() + ", Edisi: " + edisi);
    }
}
