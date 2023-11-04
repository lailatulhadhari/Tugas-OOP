package model;

public class Prodi {
    private String IDprodi;
    private String NamaProdi;

    public String getIDprodi(){
        return IDprodi;
    }

    public String getNamaProdi(){
        return NamaProdi;
    }

    public Prodi(String IDprodi, String NamaProdi) {
        this.IDprodi = IDprodi;
        this.NamaProdi = NamaProdi;
    }
}
