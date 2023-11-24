public class LombaLari extends Lomba implements PersyaratanUmum {
    private int jarak;

    public LombaLari(String namaPeserta, int jarak) {
        super(namaPeserta);
        this.jarak = jarak;
        this.jenisLomba = "Lari";
    }

    @Override
    public void persyaratan() {
        System.out.println("Persyaratan Lomba Lari:");
        System.out.println("- Jarak minimal: 100 meter");
        System.out.println("- Peserta harus sehat dan fit");
        System.out.println("Jarak Lomba Lari yang diikuti oleh " + namaPeserta + ": " + jarak + " meter");
    }
}
