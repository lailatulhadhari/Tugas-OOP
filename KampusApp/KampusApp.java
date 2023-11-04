// tugas kelompok
import java.util.ArrayList;
import java.util.Scanner;
public class KampusApp {

    public static void main(String[] args) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database database;

    public KampusApp() {
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void showMenu() {
        System.out.println("---- Selamat Datang di Aplikasi Kampus ----");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tampilkan Semua Data Mahasiswa"); // Menambahkan menu nomor 5
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukkan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline
        switch (menuYangDipilih) {
            case 1:
                menuTambah();
                break;
            case 2:
                menuUbah();
                break;
            case 3:
                menuHapus(); 
                break;
            case 4:
                menuCari();
                break;
            case 5:
                menuTampilkanSemua(); // Menambahkan menu nomor 5
                break;
            case 0: {
                System.out.println("* Terima kasih sudah menggunakan Aplikasi Kampus *");
                System.exit(0); // jangan diketik statusnya
            }
            default:
                System.out.println("Menu yang Anda pilih tidak valid, Pilih Menu yang ada");
                showMenu();
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("-- Menu Tambah Mahasiswa --");
    
        int nim = 0;
        String nama = "";
    
        boolean isValidNIM = false; //Variabel ini digunakan untuk menandai apakah NIM yang dimasukkan sudah valid atau belum.
    
        while (!isValidNIM) {
            System.out.print("Masukkan NIM (integer): "); //menerima input NIM user
            try {
                nim = scanner.nextInt(); //membaca input pengguna sebagai bilangan bulat dan menyimpannya dalam variabel nim
                scanner.nextLine(); // Membersihkan newline
                isValidNIM = true;//Jika pengguna berhasil memasukkan bilangan bulat (integer), maka isValidNIM diatur sebagai true, dan loop akan berhenti
            } catch (java.util.InputMismatchException e) { //blok catch yang akan menangkap pengecualian jika pengguna memasukkan sesuatu yang bukan bilangan bulat
                System.out.println("NIM harus berupa bilangan bulat (integer).");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
    
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
    
        Mahasiswa mahasiswa = new Mahasiswa(Integer.toString(nim), nama);
        database.create(mahasiswa);
    
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah() {
        System.out.println("-- Menu Ubah Data Mahasiswa --");

        System.out.print("Masukkan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukkan NIM Baru: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama);
        database.update(mahasiswa, nimLama);
        
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari() {
        System.out.println("-- Menu Cari Data Mahasiswa --");

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = database.read(nim);

        if (mahasiswa == null) {
            System.out.println("* NIM tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
        }

        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapus() {
        System.out.println("-- Menu Hapus Data Mahasiswa --");

        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = scanner.nextLine();

        database.delete(nim);

        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampilkanSemua() {
        System.out.println("-- Semua Data Mahasiswa --");
        ArrayList<Mahasiswa> semuaMahasiswa = database.read();
        for (Mahasiswa mahasiswa : semuaMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
 }
