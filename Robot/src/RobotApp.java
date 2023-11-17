import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }

    /*
     * Perintah Soal:
     * Anggap 'o' adalah sebuah robot yang berada didalam area permainan.
     * Buat robot dapat bergerak ke kiri/kanan/atas/bawah sesuai jumlah langkah yang diinstruksikan.
     * Format instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah} dan 'x' untuk keluar aplikasi *case sensitive
     * Robot tidak boleh keluar dari area permainan dan buat pesan kesalahannya.
     * Buat pesan kesalahan jika pengguna tidak menulis instruksi dengan benar.
     * Lanjut pada perintah soal dibawah
     */

    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        // contoh konfigurasi (inisiasi object layout) area permainan: X = 10, Y = 10, icon area yang tidak ditempati robot adalah '*'
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(1, 1));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            if (instruction.equals("x")){
                break;
            } 
            else {
                moveRobot(instruction);
            }
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private void moveRobot(String instruction) {
        int numSteps = 0;
    
        if (instruction.length() != 2) {
            System.out.println("Instruksi tidak valid. Harap masukkan instruksi yang benar.");
            return;
        }
        char direction = instruction.charAt(0);

        try {
            numSteps = Integer.parseInt(instruction.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Instruksi tidak valid. Harap masukkan instruksi yang benar.");
            return;
        }
    
    int robotX = robot.getPosition().getX();
    int robotY = robot.getPosition().getY();

    switch (direction) {
        case 'w':
            robotX = Math.max(robotX - numSteps, 1);
            break;
        case 's':
            robotX = Math.min(robotX + numSteps, layout.getMaxY());
            break;
        case 'a':
            robotY = Math.max(robotY - numSteps, 1);
            break;
        case 'd':
            robotY = Math.min(robotY + numSteps, layout.getMaxX());
            break;
        default:
            System.out.println("Instruksi tidak valid. Harap masukkan instruksi yang benar.");
            return;
    }

    robot.getPosition().setX(robotX);
    robot.getPosition().setY(robotY);
}
    
    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        char[][] area = layout.getArea();
        for (int i = 0; i < layout.getMaxX(); i++) {
            for (int j = 0; j < layout.getMaxY(); j++) {
                if (i == robot.getPosition().getX() - 1 && j == robot.getPosition().getY() - 1) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(area[i][j]);
                }
            }
            System.out.println();
            }
        }
        
        /*
        Gambar layout:
        Contoh:
        - Posisi robot di 1,1
        - Area permainan luasnya 10,10
        sehingga gambar layout akan menjadi:

            o*********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********

            - konfigurasi (icon robot, posisi robot, luas area dan icon area permainan yang tidak ditempati robot) silahkan gunakan prinsip OOP
            - icon cukup menggunakan karakter yang ada di keyboard.
         */

    }
