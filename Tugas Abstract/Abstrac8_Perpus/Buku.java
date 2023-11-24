public class Buku extends ItemPustaka {
    private String pengarang;

    public Buku(String judul, String pengarang) {
        super(judul);
        this.pengarang = pengarang;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku - Judul: " + judul + ", Pengarang: " + pengarang);
    }

    public String getPengarang() {
        return pengarang;
    }
}
