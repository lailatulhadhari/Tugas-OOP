// catatan 1
import java.util.Scanner;

public class Cekkelulusan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris dan kolom: ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




