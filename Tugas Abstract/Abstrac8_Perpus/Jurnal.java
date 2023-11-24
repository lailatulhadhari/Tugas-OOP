public class Jurnal extends Buku {
    private String penerbit;

    public Jurnal(String judul, String pengarang, String penerbit) {
        super(judul, pengarang);
        this.penerbit = penerbit;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jurnal - Judul: " + judul + ", Pengarang: " + getPengarang() + ", Penerbit: " + penerbit);
    }

    public String getPenerbit() {
        return penerbit;
    }
}
