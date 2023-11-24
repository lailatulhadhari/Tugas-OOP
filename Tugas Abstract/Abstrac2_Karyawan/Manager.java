public class Manager extends Karyawan implements PeranManager {
    private int persentaseBonus;

    public Manager(String nama, String idKaryawan, int persentaseBonus) {
        super(nama, idKaryawan);
        this.persentaseBonus = persentaseBonus;
    }

    @Override
    public void hitungGaji() {
        // Implementasi perhitungan gaji untuk seorang manajer
        // Contoh sederhana, gaji dasar + bonus berdasarkan persentase
        gaji = 50000 + (persentaseBonus / 100.0) * 50000;
    }

    @Override
    public void mengelolaTim() {
        System.out.println(nama + " sedang mengelola tim.");
    }
}
