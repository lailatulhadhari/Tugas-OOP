public class TiketEksekutif extends PemesananTiketKereta {
    private String fasilitas;

    public TiketEksekutif(String namaPenumpang, int harga, String fasilitas) {
        super(namaPenumpang, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pemesanan tiket eksekutif untuk " + namaPenumpang + ":");
        System.out.println("Harga: " + harga + " Rupiah");
        System.out.println("Fasilitas: " + fasilitas);
    }
}
