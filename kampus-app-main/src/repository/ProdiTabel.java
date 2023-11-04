package repository;

import java.util.ArrayList;
import model.Prodi;

public class ProdiTabel {
    private Database db;

    public ProdiTabel(Database db) {
        this.db = db;
    }

    public Prodi getProdiById(String IDprodi) {
        ArrayList<Prodi> dataProdi = db.tables.dataProdi;
        for (Prodi prodi : dataProdi) {
            if (prodi.getIDprodi().equals(IDprodi)) {
                return prodi;
            }
        }
        return null;
    }

    public void create(Prodi prodi) {
        db.tables.dataProdi.add(prodi);
        db.commit();
    }

    public ArrayList<Prodi> read() {
        return db.tables.dataProdi;
    }
}
