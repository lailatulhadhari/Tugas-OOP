public abstract class CuacaApp {
    protected String lokasi;
    protected int suhu;

    public CuacaApp(String lokasi, int suhu) {
        this.lokasi = lokasi;
        this.suhu = suhu;
    }

    public abstract void displayInfo();
}
