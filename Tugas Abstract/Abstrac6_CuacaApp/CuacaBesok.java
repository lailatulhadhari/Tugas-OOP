public class CuacaBesok extends CuacaApp {
    private String kondisi;

    public CuacaBesok(String lokasi, int suhu, String kondisi) {
        super(lokasi, suhu);
        this.kondisi = kondisi;
    }

    @Override
    public void displayInfo() {
        System.out.println("Cuaca besok di " + lokasi + ":");
        System.out.println("Suhu: " + suhu + " derajat Celsius");
        System.out.println("Kondisi: " + kondisi);
    }
}
