public abstract class ItemPustaka {
    protected String judul;

    public ItemPustaka(String judul) {
        this.judul = judul;
    }

    public abstract void displayInfo();

    public String getJudul() {
        return judul;
    }
}
