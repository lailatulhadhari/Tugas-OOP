import java.util.ArrayList;
import java.util.Scanner;

import model.Mahasiswa;
import model.Prodi;
import repository.Database;

public class KampusApp {
    public static void main(String[] arg) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database db;

    public KampusApp() {
        scanner = new Scanner(System.in);
        db = new Database();
    }

    public void showMenu() {
        System.out.println("---------------------------------");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tampilkan Semua Data Mahasiswa");
        System.out.println("6 -> Tampilkan Daftar Prodi");
        System.out.println("7 -> Tambah Data Prodi");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();
        switch(menuYangDipilih) {
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
            menuTampilSemuaMahasiswa();
            break;
            case 6:
            menuTampilkanProdi(); 
            break;
            case 7:
            menuTambahProdi();
            break;
            default: {
                System.out.print("* Terimakasih sudah menggunakan Aplikasi Kampus *");
                System.exit(0);
            }
            break;
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan ID Prodi: ");
        String IDprodi = scanner.nextLine();
        Prodi prodi = db.prodiTabel.getProdiById(IDprodi);
        if (prodi == null) {
            System.out.println("Prodi tidak ditemukan, tolong daftarkan prodi terlebih dahulu!");
            System.out.println("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
            showMenu();
        } else {
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, IDprodi);
            db.mahasiswaTbl.create(mahasiswa);
            System.out.println("Data Mahasiswa berhasil ditambahkan");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah() {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukan NIM: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan ID Prodi: ");
        String IDprodi = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, IDprodi);
        db.mahasiswaTbl.update(nimLama, mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapus() {
        System.out.println("----- Menu Hapus Data Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        db.mahasiswaTbl.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari(){
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = db.mahasiswaTbl.getMahasiswaByNim(nim);
        Prodi prodi = db.prodiTabel.getProdiById(mahasiswa.getIDprodi());
        if(mahasiswa == null) {
            System.out.println("* NIM tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Prodi: " + prodi.getNamaProdi() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampilSemuaMahasiswa() {
        System.out.println("----- Data Mahasiswa -----");
        ArrayList<Mahasiswa> semuaListMahasiswa = db.mahasiswaTbl.read(); 
        for (Mahasiswa mahasiswa : semuaListMahasiswa) { 
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("ID Prodi: " + mahasiswa.getIDprodi());
        System.out.println("------------------------------");
    }
        System.out.println("Tekan Enter untuk kembali ke menu utama...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampilkanProdi() {
        System.out.println("----- Daftar Prodi -----");
        ArrayList<Prodi> semuaListProdi = db.prodiTabel.read(); // Mengambil daftar Prodi dari Database
        for (Prodi prodi : semuaListProdi) { // Menggunakan daftar Prodi yang sudah diambil
            System.out.println("ID Prodi: " + prodi.getIDprodi());
            System.out.println("Nama Prodi: " + prodi.getNamaProdi());
            System.out.println("------------------------------");
        }
        System.out.println("Tekan Enter untuk kembali ke menu utama...");
        scanner.nextLine();
        showMenu();
    }
    
    public void menuTambahProdi() {
        System.out.println("----- Menu Tambah Prodi -----");
        System.out.print("Masukan ID Prodi: ");
        String IDprodi = scanner.nextLine();
        System.out.print("Masukan Nama Prodi: ");
        String NamaProdi = scanner.nextLine();
        Prodi prodi = new Prodi(IDprodi, NamaProdi);
        db.prodiTabel.create(prodi);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }


}