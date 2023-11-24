public class LombaApp {
    public static void main(String[] args) {
        LombaLari lariPeserta1 = new LombaLari("Lailatul Hadhari", 200);
        LombaRenang renangPeserta1 = new LombaRenang("Karina Putri", "Gaya Bebas");

        lariPeserta1.infoPeserta();
        lariPeserta1.persyaratan();

        System.out.println();

        renangPeserta1.infoPeserta();
        renangPeserta1.persyaratan();
    }
}
