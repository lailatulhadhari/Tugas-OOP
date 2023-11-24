public abstract class PemesananTiketKereta {
    protected String namaPenumpang;
    protected int harga;

    public PemesananTiketKereta(String namaPenumpang, int harga) {
        this.namaPenumpang = namaPenumpang;
        this.harga = harga;
    }

    public abstract void displayInfo();
}
