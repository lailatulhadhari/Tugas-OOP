public class MainApp {
    public static void main(String[] args) {
        // Cuaca hari ini di Jakarta
        CuacaHariIni cuacaHariIni = new CuacaHariIni("Jakarta", 30, "Cerah");
        cuacaHariIni.displayInfo();

        System.out.println();

        // Cuaca besok di Jakarta
        CuacaBesok cuacaBesok = new CuacaBesok("Jakarta", 27, "Mendung");
        cuacaBesok.displayInfo();
    }
}
