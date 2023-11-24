public class CuacaHariIni extends CuacaApp {
    private String kondisi;

    public CuacaHariIni(String lokasi, int suhu, String kondisi) {
        super(lokasi, suhu);
        this.kondisi = kondisi;
    }

    @Override
    public void displayInfo() {
        System.out.println("Cuaca hari ini di " + lokasi + ":");
        System.out.println("Suhu: " + suhu + " derajat Celsius");
        System.out.println("Kondisi: " + kondisi);
    }
}
