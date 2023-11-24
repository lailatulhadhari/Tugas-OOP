public class MainManagementKaryawan {
    public static void main(String[] args) {
        Manager manager = new Manager("Lailatul Hadhari", "1202223144", 10);
        Developer developer = new Developer("Nadin Amizah", "12000000", "Java");

        manager.hitungGaji();
        manager.tampilkanInformasi();
        manager.mengelolaTim();

        System.out.println();

        developer.hitungGaji();
        developer.tampilkanInformasi();
        developer.kode();
    }
}
