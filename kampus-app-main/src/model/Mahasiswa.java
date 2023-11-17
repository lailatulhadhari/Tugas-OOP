package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private String IDprodi;
    public String getIDprodi() {
        return IDprodi;
    }

    public Mahasiswa(String nim, String nama, String IDprodi) {
        this.nim = nim;
        this.nama = nama;
        this.IDprodi = IDprodi;
    }
}
