// catatan 2
import java.util.Scanner;

public class genapganjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah angka genap.");
        } else {
            System.out.println(angka + " adalah angka ganjil.");
        }
    }
}
