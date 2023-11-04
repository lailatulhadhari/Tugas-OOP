// catatan 3
import java.util.Scanner;

public class Hadiah {

    public static void main(String[] args) {

        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah belanja anda : Rp ");
        belanja = scan.nextInt();
        if (belanja > 100000) {
            System.out.println("Selamat anda mendapat hadiah");
        }
        System.out.println("Terimakasih...");
    }

}