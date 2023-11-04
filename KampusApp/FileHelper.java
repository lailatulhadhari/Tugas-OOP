// ini file helper
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class FileHelper {
    private String namaFileDataMahasiswa = "data_mahasiswa.txt";
    public void simpankeFile(ArrayList<Mahasiswa> daftarMahasiswa){
        try (PrintWriter writer = new PrintWriter(new File(namaFileDataMahasiswa))){
            for (Mahasiswa m : daftarMahasiswa){
                writer.println(m.getNim() + "," + m.getNama());
            }
        } catch (IOException e){
            System.out.println("terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }

    public ArrayList<Mahasiswa> bacaDariFile(){
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); //TIDAK ADA KURUNG
        try (Scanner scanner = new Scanner(new File(namaFileDataMahasiswa))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(","); // GA NULIS REGEX
                if (parts.length == 2) {
                    Mahasiswa m = new Mahasiswa(parts[0], parts[1]);
                    daftarMahasiswa.add(m);
                }
            }
        } catch (IOException e) {

        } 
        return daftarMahasiswa;
    }   

}
