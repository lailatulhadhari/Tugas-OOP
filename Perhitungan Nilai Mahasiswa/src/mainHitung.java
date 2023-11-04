// Tugas nilai mahasiswa
import java.util.Scanner;

public class mainHitung {
    public static void main(String[] args) {
        System.out.println("===Kalkulator Nilai Pemrograman Berorientasi Objek===");
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        System.out.print("Nilai Tubes : ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz  : ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS   : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double nilaiUAS = input.nextDouble();

        rumusHitung rumus = new rumusHitung();
        double nilaiAkhir = rumus.hitungTotalAkhir(nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("\n===Nilai Matakuliah Pemrograman Berorientasi Objek===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
