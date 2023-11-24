public abstract class Lomba {
    protected String namaPeserta;
    protected String jenisLomba;

    public Lomba(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }

    public abstract void persyaratan();

    public void infoPeserta() {
        System.out.println("Peserta Lomba " + jenisLomba + ": " + namaPeserta);
    }
}
