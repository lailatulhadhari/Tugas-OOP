public class TiketEkonomi extends PemesananTiketKereta {
    private String jenisKereta;

    public TiketEkonomi(String namaPenumpang, int harga, String jenisKereta) {
        super(namaPenumpang, harga);
        this.jenisKereta = jenisKereta;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pemesanan tiket ekonomi untuk " + namaPenumpang + ":");
        System.out.println("Harga: " + harga + " Rupiah");
        System.out.println("Jenis Kereta: " + jenisKereta);
    }
}
