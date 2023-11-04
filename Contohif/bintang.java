// belajar bintang
import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        // Meminta pengguna memasukkan input angka ganjil
        do {
            System.out.print("Masukkan jumlah baris (angka ganjil): ");
            input = scanner.nextInt();

            if (input % 2 == 0) {
                System.out.println("Input harus berupa angka ganjil. Silakan coba lagi.");
            }
        } while (input % 2 == 0);

        for (int i = 1; i <= input; i++) {
            if (i <= input / 2 + 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= input - i + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

