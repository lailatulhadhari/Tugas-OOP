public class Developer extends Karyawan implements PeranDeveloper {
    private String bahasaPemrograman;

    public Developer(String nama, String idKaryawan, String bahasaPemrograman) {
        super(nama, idKaryawan);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    @Override
    public void hitungGaji() {
        // Implementasi perhitungan gaji untuk seorang pengembang
        // Contoh sederhana, gaji dasar + bonus berdasarkan bahasa pemrograman
        gaji = 40000 + hitungBonusBahasa(bahasaPemrograman);
    }

    private double hitungBonusBahasa(String bahasa) {
        // Contoh pemberian bonus berdasarkan bahasa pemrograman
        if (bahasa.equalsIgnoreCase("Java")) {
            return 10000;
        } else if (bahasa.equalsIgnoreCase("Python")) {
            return 8000;
        } else {
            return 5000;
        }
    }

    @Override
    public void kode() {
        System.out.println(nama + " sedang coding dalam " + bahasaPemrograman);
    }
}
