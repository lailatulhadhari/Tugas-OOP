public class LombaRenang extends Lomba implements PersyaratanUmum {
    private String gayaRenang;

    public LombaRenang(String namaPeserta, String gayaRenang) {
        super(namaPeserta);
        this.gayaRenang = gayaRenang;
        this.jenisLomba = "Renang";
    }

    @Override
    public void persyaratan() {
        System.out.println("Persyaratan Lomba Renang:");
        System.out.println("- Menggunakan gaya renang yang benar");
        System.out.println("- Peserta harus bisa berenang");
        System.out.println("Gaya renang Lomba Renang yang diikuti oleh " + namaPeserta + ": " + gayaRenang);
    }
}
